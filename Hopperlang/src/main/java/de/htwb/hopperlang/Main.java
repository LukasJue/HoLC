package de.htwb.hopperlang;

import de.htwb.hopperlang.parser.HopperlangBaseListener;
import de.htwb.hopperlang.parser.HopperlangLexer;
import de.htwb.hopperlang.parser.HopperlangParser;
import org.antlr.runtime.tree.ParseTree;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ANTLRInputStream input = null;
        try {
            InputStream example = new FileInputStream("C:\\Users\\juene\\IdeaProjects\\Hopperlang\\example.hl");
            input = new ANTLRInputStream(example);
        } catch (IOException e) {
            e.printStackTrace();
        }

        if(input != null) {
            HopperlangLexer lexer = new HopperlangLexer(input);

            CommonTokenStream tokens = new CommonTokenStream(lexer);

            HopperlangParser parser = new HopperlangParser(tokens);
            final NodePool nodes = new NodePool(parser);
            parser.addParseListener(new HopperlangBaseListener() {
                @Override
                public void exitDocument(HopperlangParser.DocumentContext doc) {
                    for(NodePool.Transition transition: nodes.getTransitions()) {
                        System.out.println("Transition from: "+transition.src+" to: "+transition.dst);
                        for(int i = 0; i < transition.conditions.size(); i++) {
                            HopperlangParser.ConditionContext ctx = transition.conditions.get(i);
                            String out = ctx.condition().getText();
                            if(i < transition.conditions.size()-1) {
                                out += " AND ";
                            }
                            System.out.print(out);
                        }
                        System.out.println();
                    }
                }
            });

            nodes.fill();



        }



    }
}
