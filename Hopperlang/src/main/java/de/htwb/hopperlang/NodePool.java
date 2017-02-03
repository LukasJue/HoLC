package de.htwb.hopperlang;

import de.htwb.hopperlang.parser.HopperlangBaseListener;
import de.htwb.hopperlang.parser.HopperlangParser;
import de.htwb.hopperlang.util.HopperlangUtils;
import org.antlr.v4.runtime.*;
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

    private List<HopperlangCompiler.Transition> transitions = new ArrayList<>();

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

    public List<HopperlangCompiler.Transition> getTransitions() {
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

    @Override
    public void exitDocument(HopperlangParser.DocumentContext doc) {
        filled = true;
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
        HopperlangCompiler.SignalType type = HopperlangUtils.getTypeOfDeclartion((HopperlangParser.Signal_declarationContext)parent);
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
        transitions.add(new HopperlangCompiler.Transition(ctx));
    }
}
