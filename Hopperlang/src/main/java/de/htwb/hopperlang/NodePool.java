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
import org.antlr.v4.runtime.tree.ParseTreeWalker;

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
        this.parser = parser;
    }

    public void fill() {
        HopperlangParser.DocumentContext document = parser.document();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(this, document);
    }

    @Override
    public void exitDocument(HopperlangParser.DocumentContext doc) {
        for(NodePool.Transition transition: this.getTransitions()) {
            System.out.println("Transition from: "+transition.src+" to: "+transition.dst);
            for(int i = 0; i < transition.conditions.size(); i++) {
                HopperlangParser.ConditionContext ctx = transition.conditions.get(i);
                String out = ctx.getText();
                if(i < transition.conditions.size()-1) {
                    out += " AND ";
                }
                System.out.print(out);
            }
            System.out.println();
        }
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
    public void exitTransition(HopperlangParser.TransitionContext ctx) {
        transitions.add(new Transition(ctx));
    }

    public class Transition {
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
    }
}
