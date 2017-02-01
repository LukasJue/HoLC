package de.htwb.hopperlang;

import com.sun.corba.se.impl.io.TypeMismatchException;
import de.htwb.hopperlang.parser.HopperlangBaseListener;
import de.htwb.hopperlang.parser.HopperlangListener;
import de.htwb.hopperlang.parser.HopperlangParser;
import de.htwb.hopperlang.util.NodeUtil;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTree;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.BitSet;
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

    private HopperlangParser parser;

    public NodePool(HopperlangParser parser) {
        parser.addParseListener(this);
        this.parser = parser;
    }

    public void fill() {
        HopperlangParser.DocumentContext document = parser.document();
        System.out.println(document.toStringTree(parser));
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
        NodeUtil.SIGNAL_TYPE type = NodeUtil.getTypeOfDeclartion((HopperlangParser.Signal_declarationContext)parent);
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

    public List<Transition> getTransitions() {
        return transitions;
    }

    @Override
    public void exitState_block(HopperlangParser.State_blockContext ctx) {
        System.out.println("State! "+ctx.name().getText());
        states.add(ctx);
    }

    @Override
    public void exitCondition_line(HopperlangParser.Condition_lineContext ctx) {
        transitions.add(new Transition(ctx));
    }

    public class Transition {
        List<HopperlangParser.ConditionContext> conditions = new ArrayList<>();
        String src;
        String dst;

        public Transition(HopperlangParser.Condition_lineContext ctx) {
            if(ctx.name() != null) { //only if final end node
                System.out.println("Transition! "+ctx.getText());
                ParserRuleContext parent = ctx.getParent();
                while (parent != null) {
                    if(parent instanceof HopperlangParser.Condition_blockContext) {
                        conditions.add(((HopperlangParser.Condition_blockContext) parent).condition());
                        System.out.println("Parent Condition! "+((HopperlangParser.Condition_blockContext) parent).condition().getText());
                    } else if(parent instanceof HopperlangParser.State_blockContext) {
                        src = ((HopperlangParser.State_blockContext)parent).name().getText();
                    }
                    parent = parent.getParent();
                }
                conditions.add(ctx.condition());
                dst = ctx.name().getText();
            }
        }
    }
}
