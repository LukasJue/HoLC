package de.htwb.hopperlang;

import de.htwb.hopperlang.parser.HopperlangParser;
import de.htwb.hopperlang.util.HopperlangUtils;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by juene on 03.02.2017.
 */
public class HopperlangCompiler {

    List<State> states = new ArrayList<>();
    SignalPool signals = new SignalPool();

    public HopperlangCompiler(NodePool pool) {
        if(pool.isFilled()) {
            init(pool);
        }
    }

    private void init(NodePool pool) {

        for(HopperlangParser.Signal_valueContext ctx : pool.getLocalSignals()) {
            signals.addLocalSignal(new Signal(SignalType.LOCAL, ctx));
        }

        for(HopperlangParser.Signal_valueContext ctx : pool.getInputSignals()) {
            signals.addLocalSignal(new Signal(SignalType.INPUT, ctx));
        }
        for(HopperlangParser.Signal_valueContext ctx : pool.getOutputSignals()) {
            signals.addLocalSignal(new Signal(SignalType.OUTPUT, ctx));
        }

        for(HopperlangParser.State_blockContext state : pool.getStates()) {
            states.add(new State(state, pool));
        }
    }

    public boolean check() {

        for(State state: states) {
            for (Transition transition : state.transitions) {
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
        SignalType modifier;
        String name;
        String type;

        public Signal(SignalType type, HopperlangParser.Signal_valueContext ctx) {
            modifier = type;
            name = ctx.name().getText();
            this.type = ctx.type().getText();
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

            for(Transition transition : pool.getTransitions()) {
                if(transition.src.equals(name)) {
                    transitions.add(transition);
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
        List<HopperlangParser.ConditionContext> conditions = new ArrayList<>();
        String src;
        String dst;

        public Transition(HopperlangParser.TransitionContext ctx) {
            if(ctx.name() != null) { //only if final end node
                System.out.println("Transition! "+ctx.getText());
                ParserRuleContext parent = ctx.getParent();
                while (parent != null) {
                    if(parent instanceof HopperlangParser.Transition_blockContext) {
                        HopperlangParser.ConditionContext condition =((HopperlangParser.Transition_blockContext) parent).condition();
                        if(condition != null) {
                            if(condition.parent instanceof HopperlangParser.ConditionContext) {
                                condition = (HopperlangParser.ConditionContext) condition.parent;
                            }
                            conditions.add(condition);
                            System.out.println("Parent Condition! "+condition.getText());
                        }
                    } else if(parent instanceof HopperlangParser.State_blockContext) {
                        src = ((HopperlangParser.State_blockContext)parent).name().getText();
                    }
                    parent = parent.getParent();
                }
                conditions.add(ctx.condition());
                dst = ctx.name().getText();
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

        void addSignal(SignalType type, Signal signal) {
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

    public enum SignalType {
        INPUT,
        OUTPUT,
        LOCAL
    }
}
