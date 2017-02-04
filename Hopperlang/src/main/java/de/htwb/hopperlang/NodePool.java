package de.htwb.hopperlang;

import de.htwb.hopperlang.parser.HopperlangBaseListener;
import de.htwb.hopperlang.parser.HopperlangParser;
import de.htwb.hopperlang.util.HopperlangUtils;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by juene on 01.02.2017.
 */
public class NodePool extends HopperlangBaseListener {

    private List<HopperlangParser.Signal_valueContext> localSignals = new ArrayList<>();
    private List<HopperlangParser.Signal_valueContext> inputSignals = new ArrayList<>();
    private List<HopperlangParser.Signal_valueContext> outputSignals = new ArrayList<>();

    private List<HopperlangParser.State_blockContext> states = new ArrayList<>();

    private List<Transition> transitions = new ArrayList<>();

    private String automateName = new String();

    private HopperlangParser parser;
    private boolean filled;

    public NodePool(HopperlangParser parser) {
        this.parser = parser;
    }

    public void fill() {
        HopperlangParser.DocumentContext document = parser.document();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(this, document);
    }

    public boolean isFilled() {
        return filled;
    }

    public List<Transition> getTransitions() {
        return transitions;
    }
    public List<HopperlangParser.State_blockContext> getStates() {
        return states;
    }

    public List<HopperlangParser.Signal_valueContext> getInputSignals() {
        return inputSignals;
    }

    public List<HopperlangParser.Signal_valueContext> getLocalSignals() {
        return localSignals;
    }

    public List<HopperlangParser.Signal_valueContext> getOutputSignals() {
        return outputSignals;
    }

    public String getAutomateName() {
        return automateName;
    }

    @Override
    public void exitDocument(HopperlangParser.DocumentContext doc) {
        filled = true;
    }

    @Override
    public void exitAutomat_block(HopperlangParser.Automat_blockContext ctx) {
        automateName = ctx.name().getText();
    }

    @Override
    public void exitSignal_value(HopperlangParser.Signal_valueContext ctx) {
        addSignal(ctx);
    }

    private void addSignal(HopperlangParser.Signal_valueContext ctx) {
        ParserRuleContext parent = ctx.getParent();
        while(!(parent instanceof HopperlangParser.Signal_declarationContext)) {
            parent = parent.getParent();
        }
        HopperlangCompiler.SignalPos type = HopperlangUtils.getTypeOfDeclartion((HopperlangParser.Signal_declarationContext)parent);
        switch (type) {
            case INPUT:
                System.out.println("Input! "+ctx.name().getText()+" "+ctx.type().getText());
                inputSignals.add(ctx);
                break;
            case OUTPUT:
                System.out.println("Output! "+ctx.name().getText()+" "+ctx.type().getText());
                outputSignals.add(ctx);
                break;
            case LOCAL:
                System.out.println("Local! "+ctx.name().getText()+" "+ctx.type().getText());
                localSignals.add(ctx);
                break;
        }
    }

    @Override
    public void exitState_block(HopperlangParser.State_blockContext ctx) {
        System.out.println("State! "+ctx.name().getText());
        states.add(ctx);
    }

    @Override
    public void exitTransition(HopperlangParser.TransitionContext ctx) {
        transitions.add(new Transition(ctx));
    }

    public static class Transition {
        List<HopperlangParser.ConditionContext> conditions = new ArrayList<>();
        String src;
        String dst;

        public Transition(HopperlangParser.TransitionContext ctx) {
            if(ctx.name() != null) { //only if final end node
                System.out.println("Transition! "+ctx.getText().replace("\n", ""));
                ParserRuleContext parent = ctx.getParent();
                while (parent != null) {
                    if(parent instanceof HopperlangParser.Transition_blockContext) {
                        HopperlangParser.ConditionContext condition =((HopperlangParser.Transition_blockContext) parent).condition();
                        if(condition != null) {
                            if(condition.parent instanceof HopperlangParser.ConditionContext) {
                                condition = (HopperlangParser.ConditionContext) condition.parent;
                            }
                            conditions.add(0, condition);
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
}
