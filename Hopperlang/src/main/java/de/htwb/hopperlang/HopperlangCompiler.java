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
            states.add(new State(state, pool));
        }
    }

    public boolean check() {

        for(State state: states) {
            for (Transition transition : state.transitions) {
                System.out.println("Condition for "+transition.toString()+" is "+transition.condition);
                if(!HopperlangUtils.containsState(states, transition.dst)) {
                    System.out.println("Transition destination doesn't exist! "+transition.toString());
                    return false;
                }
            }

            for(Assignment assignment : state.assignments) {
                if(signals.containsSignal(assignment.leftSide)) {
                    if(!HopperlangUtils.isIntegerNumeric(assignment.rightSide)) {
                        if(!signals.containsSignal(assignment.rightSide)) {
                            System.out.println("Signal \"" +assignment.rightSide+ "\" doesn't exist! In assignment: "+state.name+" -> "+assignment.toString());
                            return false;
                        }
                    }
                } else {
                    System.out.println("Signal \""+assignment.leftSide+"\" doesn't exist! In: "+state.name+"\t"+assignment.toString());
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

        private Type(SignalType type, int width) {
            signalType = type;
            this.width = width;
        }
    }

    public static class State {
        String name;
        List<Assignment> assignments = new ArrayList<>();
        List<Transition> transitions = new ArrayList<>();

        public State(HopperlangParser.State_blockContext ctx, NodePool pool) {
            name = ctx.name().getText();
            HopperlangParser.State_bodyContext body = ctx.state_body();
            //StateBodyElements
            for(int i = 0; i < body.getChildCount(); i++) {
                ParseTree child = body.getChild(i);
                for(int j = 0; j < child.getChildCount(); j++) {
                    ParseTree grandchild = child.getChild(j);
                    if(grandchild instanceof HopperlangParser.AssignmentContext) {
                        assignments.add(new Assignment((HopperlangParser.AssignmentContext)grandchild));
                    }
                }
            }

            for(NodePool.Transition transition : pool.getTransitions()) {
                if(transition.src.equals(name)) {
                    transitions.add(new Transition(transition));
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
        String condition;

        public Transition(NodePool.Transition transition) {
            this.src = transition.src;
            this.dst = transition.dst;
            condition = new String();
            for(int i = 0; i < transition.conditions.size(); i++) {
                HopperlangParser.ConditionContext ctx = transition.conditions.get(i);
                creatCondition(ctx);
                if(i < transition.conditions.size() -1) {
                    condition += " AND ";
                }
            }
        }

        private void creatCondition(HopperlangParser.ConditionContext ctx) {
            if(ctx.getChildCount() > 1) {
                //Expression with conjunction
                condition += ("(");
            }
            for(int j = 0; j < ctx.getChildCount(); j++) {
                ParseTree child = ctx.getChild(j);
                if(child instanceof HopperlangParser.Boolean_expressionContext) {
                    HopperlangParser.Boolean_expressionContext expr = (HopperlangParser.Boolean_expressionContext)child;
                    while(expr.getChildCount() == 2) {
                        condition += " NOT";
                        expr = expr.boolean_expression();
                    }
                    condition += expr.getText().replace("(", " ").replace(")", " ");
                } else if(child instanceof HopperlangParser.ConjunctionContext) {
                    condition += child.getText().toUpperCase();
                } else if (child instanceof HopperlangParser.ConditionContext) {
                    creatCondition((HopperlangParser.ConditionContext)child);
                }

            }
            if(ctx.getChildCount() > 1) {
                //Expression with conjunction
                condition += (") ");
            }
        }

        @Override
        public String toString() {
            return src+" -> "+dst;
        }
    }

    public static class Assignment {
        String leftSide;
        String rightSide;

        public Assignment(HopperlangParser.AssignmentContext ctx) {
            leftSide = ctx.assignment_left().getText();
            rightSide = ctx.assignment_right().getText();
        }

        @Override
        public String toString() {
            return leftSide+" = "+rightSide;
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
