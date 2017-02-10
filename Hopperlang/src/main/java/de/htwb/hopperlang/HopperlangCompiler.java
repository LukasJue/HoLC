package de.htwb.hopperlang;

import de.htwb.hopperlang.parser.HopperlangParser;
import de.htwb.hopperlang.util.HopperlangUtils;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by juene on 03.02.2017.
 */
public class HopperlangCompiler {

    public static final String CLK_SIGNAL_NAME = "clk";
    public static final String RESET_SIGNAL_NAME = "reset";
    public static final String ENABLE_SIGNAL_NAME = "enable";

    List<State> states = new ArrayList<>();
    SignalPool signals = new SignalPool();
    String automateName;


    public HopperlangCompiler(NodePool pool) {
        if(pool.isFilled()) {
            init(pool);
        }
    }

    private void init(NodePool pool) {

        automateName = pool.getAutomateName();

        signals.addInputSignal(new Signal(SignalPos.INPUT, CLK_SIGNAL_NAME, new Type(SignalType.LOGIC, 1)));
        signals.addInputSignal(new Signal(SignalPos.INPUT, RESET_SIGNAL_NAME, new Type(SignalType.LOGIC, 1)));
        signals.addInputSignal(new Signal(SignalPos.INPUT, ENABLE_SIGNAL_NAME, new Type(SignalType.LOGIC, 1)));

        for(HopperlangParser.Signal_valueContext ctx : pool.getLocalSignals()) {
            signals.addLocalSignal(new Signal(SignalPos.LOCAL, ctx));
        }

        for(HopperlangParser.Signal_valueContext ctx : pool.getInputSignals()) {
            signals.addInputSignal(new Signal(SignalPos.INPUT, ctx));
        }
        for(HopperlangParser.Signal_valueContext ctx : pool.getOutputSignals()) {
            signals.addOutputSignal(new Signal(SignalPos.OUTPUT, ctx));
        }

        for(HopperlangParser.State_blockContext state : pool.getStates()) {
            states.add(new State(state, pool, signals));
        }
    }

    public boolean check() {

        for(State state: states) {
            for (Transition transition : state.transitions) {
                if(!HopperlangUtils.containsState(states, transition.dst)) {
                    System.err.println("Transition destination doesn't exist! "+transition.toString());
                    return false;
                }
                for(String signalName : transition.getUsedSignals()) {
                    if(signals.containsSignal(signalName)) {
                        Signal signal = signals.getSignal(signalName);
                        if(signal.modifier == SignalPos.OUTPUT) {
                            System.err.println("Can't read from output signal: "+signal.name+" In transition: "+transition.toString());
                            return false;
                        }
                    } else {
                        System.err.println("Not existing Signal: "+signalName+" in Transition: "+transition.toString()+"\t"+transition.getConditionsString());
                        return false;
                    }
                }
                System.out.println("Condition for "+transition.toString()+" is "+transition.getConditionsString());
            }

            for(Assignment assignment : state.assignments) {
                if(signals.containsSignal(assignment.leftSide)) {
                    for(String signalName : assignment.rightSide.usedSignals) {
                        if(signals.containsSignal(signalName)) {
                            Signal signal = signals.getSignal(signalName);
                            if(signal.modifier == SignalPos.OUTPUT) {
                                System.err.println("Can't read from output signal: "+signal.name+" In assignment: "+state.name+" -> "+assignment.toString());
                                return false;
                            }
                        } else {
                            System.err.println("Signal \"" +assignment.rightSide+ "\" doesn't exist! In assignment: "+state.name+" -> "+assignment.toString());
                            return false;
                        }
                    }

                    Signal signal = signals.getSignal(assignment.leftSide);
                    if(signal.modifier == SignalPos.INPUT) {
                        System.err.println("Can't write to input signal: "+signal.name+" In assignment: "+state.name+" -> "+assignment.toString());
                    }
                } else {
                    System.err.println("Signal \""+assignment.leftSide+"\" doesn't exist! In: "+state.name+"\t"+assignment.toString());
                    return false;
                }
            }
        }

        return true;
    }

    public List<State> getStates() {
        return states;
    }

    public SignalPool getSignals() {
        return signals;
    }

    public class Signal {
        SignalPos modifier;
        String name;
        Type type;

        public Signal(SignalPos type, HopperlangParser.Signal_valueContext ctx) {
            modifier = type;
            name = ctx.name().getText();
            this.type = new Type(ctx.type());
        }

        private Signal(SignalPos mod, String name, Type type) {
            modifier = mod;
            this.name = name;
            this.type = type;
        }

        public String getName() {
            return name;
        }

        public SignalPos getModifier() {
            return modifier;
        }

        public Type getType() {
            return type;
        }

        public String castTo(Signal target) {
                switch(target.getType().getSignalType()) {
                    case LOGIC:
                        switch (getType().getSignalType()) {
                            case LOGIC:
                                return getName();
                            case VECTOR:
                                return getName()+"(0)";
                            case INT:
                                return "std_logic_vector(to_unsigned("+getName()+", "+getType().getWidth()+"))(0)";
                            default:
                                return getName();
                        }
                    case INT:
                        switch (getType().getSignalType()) {
                            case LOGIC:
                                System.err.println("Conversion of single bit to integer nor supported! bit: "+
                                        getName()+" integer:" +target.getName());
                                return getName();
                            case VECTOR:
                                return "to_integer(unsigned("+getName()+"))";
                            case INT:
                                return getName();
                            default:
                                return getName();
                        }
                    case VECTOR:
                        switch (getType().getSignalType()) {
                            case LOGIC:
                                StringBuilder builder = new StringBuilder();
                                builder.append("\"");
                                for(int i = 0; i < target.getType().getWidth()-1; i++) {
                                    builder.append("0");
                                }
                                builder.append("\"&"+getName());
                                return builder.toString();
                            case VECTOR:
                                return getName();
                            case INT:
                                return "std_logic_vector(to_unsigned("+getName()+", "+getType().getWidth()+"))";
                            default:
                                return getName();
                        }
                    default:
                        return getName();
                }
        }
    }

    public class Type {
        int width = 1;
        SignalType signalType;
        public Type(HopperlangParser.TypeContext ctx) {
            if(ctx.getText().equals("hilo") || ctx.getText().equals("bit")) {
                width = 1;
                signalType = SignalType.LOGIC;
            } else {
                if(ctx.getText().startsWith("int")) {
                    width = Integer.parseInt(ctx.getText().replace("int", ""));
                    signalType = SignalType.INT;
                } else {
                    width = Integer.parseInt(ctx.getText().replace("bus", ""));
                    signalType = SignalType.VECTOR;
                }
            }
        }

        public SignalType getSignalType() {
            return signalType;
        }

        public int getWidth() {
            return width;
        }

        private Type(SignalType type, int width) {
            signalType = type;
            this.width = width;
        }
    }

    public static class State {
        String name;
        List<Assignment> assignments = new ArrayList<>();
        List<Transition> transitions = new ArrayList<>();

        public State(HopperlangParser.State_blockContext ctx, NodePool pool, SignalPool signalPool) {
            name = ctx.name().getText();
            HopperlangParser.State_bodyContext body = ctx.state_body();
            //StateBodyElements
            for(int i = 0; i < body.getChildCount(); i++) {
                ParseTree child = body.getChild(i);
                for(int j = 0; j < child.getChildCount(); j++) {
                    ParseTree grandchild = child.getChild(j);
                    if(grandchild instanceof HopperlangParser.AssignmentContext) {
                        assignments.add(new Assignment(signalPool, (HopperlangParser.AssignmentContext)grandchild));
                    }
                }
            }

            for(NodePool.Transition transition : pool.getTransitions()) {
                if(transition.src.equals(name)) {
                    transitions.add(new Transition(transition, signalPool));
                }
            }
            pool.getTransitions().removeAll(transitions);
        }

        public String getName() {
            return name;
        }

        public List<Transition> getTransitions() {
            return transitions;
        }

        public List<Assignment> getAssignments() {
            return assignments;
        }
    }

    public static class Transition {

        String src;
        String dst;
        List<Condition> conditions = new ArrayList<>();
        List<String> usedSignals = new ArrayList<>();

        public Transition(NodePool.Transition transition, SignalPool pool) {
            this.src = transition.src;
            this.dst = transition.dst;
            for(int i = 0; i < transition.conditions.size(); i++) {
                Condition condition = new Condition(pool, transition.conditions.get(i));
                conditions.add(condition);
                usedSignals.addAll(condition.usedSignals);
            }
        }

        public List<String> getUsedSignals() {
            return usedSignals;
        }

        @Override
        public String toString() {
            return src+" -> "+dst;
        }

        public String getConditionsString() {
            StringBuilder builder =  new StringBuilder();
            int bracket = 0;
            for(int i = 0; i < conditions.size(); i++) {
                builder.append(conditions.get(i));
                if(i < conditions.size()-1) {
                    builder.append(" AND (");
                    bracket++;
                }
            }
            for(int i = 0; i < bracket; i++) {
                builder.append(")");
            }
            return builder.toString();
        }

        public String getCastedCondition() {
            StringBuilder builder =  new StringBuilder();
            int bracket = 0;
            for(int i = 0; i < conditions.size(); i++) {
                builder.append(conditions.get(i).getCasted());
                if(i < conditions.size()-1) {
                    builder.append(" AND (");
                    bracket++;
                }
            }
            for(int i = 0; i < bracket; i++) {
                builder.append(")");
            }
            return builder.toString();
        }
    }

    public static class Assignment {
        String leftSide;
        AssignmentRight rightSide;
        List<String> usedSignals = new ArrayList<>();
        SignalPool pool;

        public Assignment(SignalPool pool, HopperlangParser.AssignmentContext ctx) {
            leftSide = ctx.assignment_left().getText();
            rightSide = new AssignmentRight(pool, ctx.assignment_right());
            usedSignals.addAll(rightSide.usedSignals);
            usedSignals.add(leftSide);
            this.pool = pool;
        }

        private Assignment(SignalPool pool, String leftSide, AssignmentRight rightSide) {
            this.leftSide = leftSide;
            this.rightSide = rightSide;
            this.pool = pool;
            usedSignals.addAll(rightSide.usedSignals);
            usedSignals.add(leftSide);
        }

        @Override
        public String toString() {
            return leftSide+" = "+rightSide;
        }

        public String getCasted() {
            Signal signal = pool.getSignal(leftSide);
            return leftSide+" <= "+rightSide.getCastedToType(signal);
        }
    }

    public static class AssignmentRight {
        List<AssignmentRightPart> parts = new ArrayList<>();
        List<Integer> usedNumbers = new ArrayList<>();
        List<String> usedSignals = new ArrayList<>();
        private SignalPool pool;
        public AssignmentRight(SignalPool pool, HopperlangParser.Assignment_rightContext ctx) {
            this.pool = pool;
            addAssignmentPart(ctx);
        }

        private void addAssignmentPart(HopperlangParser.Assignment_rightContext ctx) {
            for(int i = 0; i < ctx.getChildCount(); i++) {
                ParseTree tree = ctx.getChild(i);
                if(tree instanceof HopperlangParser.NumberContext) {
                    parts.add(AssignmentRightPart.Number);
                    usedNumbers.add(Integer.parseInt(tree.getText()));
                } else if (tree instanceof HopperlangParser.NameContext) {
                    parts.add(AssignmentRightPart.Signal);
                    usedSignals.add(tree.getText());
                } else if(tree instanceof HopperlangParser.Assignment_rightContext) {
                    addAssignmentPart((HopperlangParser.Assignment_rightContext)tree);
                } else {
                    parts.add(AssignmentRightPart.parse(tree.getText()));
                }
            }
        }

        @Override
        public String toString() {
            StringBuilder builder = new StringBuilder();
            int numberCount = 0;
            int signalCount = 0;
            if(parts.size() > 1) {
                builder.append("( ");
            }
            for(AssignmentRightPart part : parts) {
                switch (part) {
                    case Number:
                        builder.append(usedNumbers.get(numberCount++)+" ");
                        break;
                    case Signal:
                        builder.append(usedSignals.get(signalCount++)+" ");
                        break;
                    default:
                        builder.append(part+" ");
                }
            }
            if(parts.size() > 1) {
                builder.append(" )");
            }
            return builder.toString();
        }

        public String getCastedToType(Signal left) {
            StringBuilder builder = new StringBuilder();
            int numberCount = 0;
            int signalCount = 0;
            if(parts.size() > 1) {
                builder.append("( ");
            }
            for(AssignmentRightPart part : parts) {
                switch (part) {
                    case Number:
                        builder.append(HopperlangUtils.formatNumberForSignal(left, usedNumbers.get(numberCount++))+" ");
                        break;
                    case Signal:
                        Signal signal = pool.getSignal(usedSignals.get(signalCount++));
                        builder.append(signal.castTo(left)+" ");
                        break;
                    default:
                        builder.append(part+" ");
                }
            }
            if(parts.size() > 1) {
                builder.append(" )");
            }
            return builder.toString();
        }

        public List<AssignmentRightPart> getParts() {
            return parts;
        }

        public List<String> getUsedSignals() {
            return usedSignals;
        }

        public List<Integer> getUsedNumbers() {
            return usedNumbers;
        }
    }

    public enum AssignmentRightPart {
        Signal,
        Number,
        Plus,
        Minus;

        public static final AssignmentRightPart parse(String s) {
            switch (s) {
                case "+":
                    return Plus;
                case "-":
                    return Minus;
                default:
                    if(HopperlangUtils.isIntegerNumeric(s)) {
                        return Number;
                    } else {
                        return Signal;
                    }
            }
        }

        @Override
        public String toString() {
            switch (this) {
                case Plus:
                    return "+";
                case Minus:
                    return "-";
                default:
                    return "";

            }
        }
    }

    public static class Condition {
        List<Conjunction> conjunctions =  new ArrayList<>();
        List<Comparison> comparisons = new ArrayList<>();
        List<String> usedSignals =  new ArrayList<>();
        private SignalPool pool;
        public Condition(SignalPool pool, HopperlangParser.ConditionContext ctx) {
            this.pool = pool;
            initCondition(ctx);
        }

        private void initCondition(HopperlangParser.ConditionContext ctx) {
            for (int i = 0; i < ctx.getChildCount(); i++) {
                ParseTree child = ctx.getChild(i);
                if(child instanceof HopperlangParser.Boolean_expressionContext) {
                    HopperlangParser.Boolean_expressionContext expr = (HopperlangParser.Boolean_expressionContext)child;
                    int notCount = 0;
                    while(expr.getChildCount() == 2) {
                        notCount++;
                        expr = expr.boolean_expression();
                    }
                    boolean uneven = (notCount % 2) == 1;
                    Comparison comparison = new Comparison(pool, expr.comparison(), uneven);
                    comparisons.add(comparison);
                    this.usedSignals.addAll(comparison.usedSignals);

                } else if (child instanceof HopperlangParser.ConjunctionContext) {
                    conjunctions.add(Conjunction.parse(child.getText()));
                } else if (child instanceof HopperlangParser.ConditionContext) {
                    initCondition((HopperlangParser.ConditionContext)child);
                }
            }
        }

        @Override
        public String toString() {
            StringBuilder builder = new StringBuilder();

            for(int i = 0; i < comparisons.size(); i++) {
                builder.append(comparisons.get(i));
                if(i < comparisons.size()-1) {
                    builder.append(" ");
                    builder.append(conjunctions.get(i));
                    builder.append(" ");
                }
            }
            return builder.toString();
        }

        public String getCasted() {
            StringBuilder builder = new StringBuilder();

            for(int i = 0; i < comparisons.size(); i++) {
                builder.append(comparisons.get(i).getCasted());
                if(i < comparisons.size()-1) {
                    builder.append(" ");
                    builder.append(conjunctions.get(i));
                    builder.append(" ");
                }
            }
            return builder.toString();
        }
    }

    public static class Comparison extends Assignment {
        Unary unaryOperator;
        public Comparison( SignalPool pool, HopperlangParser.ComparisonContext ctx, boolean inverted) {
            super(pool, ctx.assignment_left().getText(), new AssignmentRight(pool, ctx.assignment_right()));
            unaryOperator = Unary.parse(ctx.unary_operator().getText());
            if(inverted) {
                unaryOperator = HopperlangUtils.getOpositeUnary(unaryOperator);
            }
        }

        @Override
        public String toString() {
            return leftSide+" "+unaryOperator.toString()+" "+rightSide;
        }

        @Override
        public String getCasted() {
            Signal signal = pool.getSignal(leftSide);
            return leftSide+" "+unaryOperator.toString()+" "+rightSide.getCastedToType(signal);
        }
    }

    public enum Unary {
        Lower,
        LowerEquals,
        Equals,
        Greater,
        GreaterEquals,
        Unequal;

        public static final Unary parse(String value) {
            switch (value.toUpperCase()) {
                case "=":
                    return Equals;
                case "/=":
                    return Unequal;
                case "<":
                    return Lower;
                case "<=":
                    return LowerEquals;
                case ">":
                    return Greater;
                case ">=":
                    return GreaterEquals;
                default:
                    return Equals;
            }
        }

        @Override
        public String toString() {
            switch(this) {
                case Lower:
                    return "<";
                case LowerEquals:
                    return "<=";
                case Equals:
                    return "=";
                case Unequal:
                    return "/=";
                case GreaterEquals:
                    return ">=";
                case Greater:
                    return ">";
                default:
                    return "";
            }
        }
    }

    public enum Conjunction {

        And,
        Or,
        Xor;

        public static final Conjunction parse(String value) {
            switch (value.toUpperCase()) {
                case "AND":
                    return And;
                case "OR":
                    return Or;
                case "XOR":
                    return Xor;
                default:
                    return And;
            }
        }

        @Override
        public String toString() {
            switch(this) {
                case And:
                    return "AND";
                case Or:
                    return "OR";
                case Xor:
                    return "XOR";
                default:
                    return "";
            }
        }
    }

    public class SignalPool {
        private List<Signal> localSignals = new ArrayList<>();
        private List<Signal> inputSignals = new ArrayList<>();
        private List<Signal> outputSignals = new ArrayList<>();

        void addSignal(SignalPos type, Signal signal) {
            switch (type) {
                case LOCAL:
                    addLocalSignal(signal);
                    break;
                case INPUT:
                    addInputSignal(signal);
                    break;
                case OUTPUT:
                    addOutputSignal(signal);
                    break;
            }
        }

        void addLocalSignal(Signal signal) {
            localSignals.add(signal);
        }

        void addInputSignal(Signal signal) {
            inputSignals.add(signal);
        }

        void addOutputSignal(Signal signal) {
            outputSignals.add(signal);
        }

        public List<Signal> getLocalSignals() {
            return localSignals;
        }

        public List<Signal> getInputSignals() {
            return inputSignals;
        }

        public List<Signal> getOutputSignals() {
            return outputSignals;
        }

        public List<Signal> getAllSignals() {
            List<Signal> result = new ArrayList<>();
            result.addAll(getLocalSignals());
            result.addAll(getInputSignals());
            result.addAll(getOutputSignals());
            return result;
        }

        public boolean containsSignal(String signalName) {
            List<Signal> all = getAllSignals();
            for(Signal signal: all) {
                if(signal.name.equals(signalName)) {
                    return true;
                }
            }

            return false;
        }

        public Signal getSignal(String name) {
            List<Signal> all = getAllSignals();
            for(Signal signal: all) {
                if(signal.name.equals(name)) {
                    return signal;
                }
            }
            return null;
        }
    }

    public enum SignalPos {
        INPUT,
        OUTPUT,
        LOCAL
    }

    public enum SignalType {
        INT,
        LOGIC,
        VECTOR
    }
}
