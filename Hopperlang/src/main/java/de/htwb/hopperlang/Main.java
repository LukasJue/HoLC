package de.htwb.hopperlang;

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
        try {
            InputStream example = new FileInputStream("C:\\Users\\juene\\IdeaProjects\\Hopperlang\\example.hl");
            ANTLRInputStream input = new ANTLRInputStream(example);
            HopperlangLexer lexer = new HopperlangLexer(input);

            CommonTokenStream tokens = new CommonTokenStream(lexer);

            HopperlangParser parser = new HopperlangParser(tokens);
            HopperlangParser.DocumentContext tree = parser.document(); // begin parsing at rule 'r'
            System.out.println(tree.toStringTree(parser)); // print LISP-style tree
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
