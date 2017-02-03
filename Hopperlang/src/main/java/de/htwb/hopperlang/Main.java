package de.htwb.hopperlang;

import de.htwb.hopperlang.parser.HopperlangBaseListener;
import de.htwb.hopperlang.parser.HopperlangLexer;
import de.htwb.hopperlang.parser.HopperlangParser;
import org.antlr.runtime.tree.ParseTree;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ANTLRInputStream input = null;
        try {
            InputStream example = new FileInputStream("example.hl");
            input = new ANTLRInputStream(example);
        } catch (IOException e) {
            e.printStackTrace();
        }

        if(input != null) {
            HopperlangLexer lexer = new HopperlangLexer(input);

            CommonTokenStream tokens = new CommonTokenStream(lexer);

            HopperlangParser parser = new HopperlangParser(tokens);
            final NodePool nodes = new NodePool(parser);

            nodes.fill();



        }



    }
}
