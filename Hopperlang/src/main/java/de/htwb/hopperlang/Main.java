package de.htwb.hopperlang;

import de.htwb.hopperlang.parser.HopperlangLexer;
import de.htwb.hopperlang.parser.HopperlangParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.*;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static final String INPUT_FILE_ARGUMENT_FLAG = "-f";
    public static final String OUTPUT_FILE_ARGUMENT_FLAG = "-o";
    public static final String HELP_FILE_ARGUMENT_FLAG_SHORT = "-h";
    public static final String HELP_FILE_ARGUMENT_FLAG_LONG = "--help";

    public static void main(String[] args) {
        List<String> argList = Arrays.asList(args);

        if(argList.contains(HELP_FILE_ARGUMENT_FLAG_SHORT) ||
                argList.contains(HELP_FILE_ARGUMENT_FLAG_LONG)) {
            StringBuilder builder = new StringBuilder();
            builder.append("Hopperlang CLI: \n");
            builder.append("\t"+INPUT_FILE_ARGUMENT_FLAG+" : Input Hopperlang File, otherwise reading from stdin \n");
            builder.append("\t"+OUTPUT_FILE_ARGUMENT_FLAG+" : Output Hopperlang File, otherwise writing to stdout \n");
            builder.append("\t"+HELP_FILE_ARGUMENT_FLAG_SHORT+", "+HELP_FILE_ARGUMENT_FLAG_LONG+" : "+
                            "This help page\n");
            System.out.println(builder.toString());
            System.exit(0);
        }

	    // write your code here
        ANTLRInputStream input = null;
        if(argList.contains(INPUT_FILE_ARGUMENT_FLAG)) {
            int index = argList.indexOf(INPUT_FILE_ARGUMENT_FLAG)+1;
            if(index < argList.size()) {
                try {
                    InputStream example = new FileInputStream(argList.get(index));
                    input = new ANTLRInputStream(example);
                } catch (IOException e) {
                    System.err.println("Error reading input file!");
                }
            } else {
                System.err.println("Please add input file to "+INPUT_FILE_ARGUMENT_FLAG+" flag!");
                System.exit(1);
            }
        } else {
            try {
                input = new ANTLRInputStream(System.in);
            } catch (IOException e) {
                System.err.println("Error reading stdin!");
                System.exit(1);
            }
        }


        if(input != null) {

            HopperlangLexer lexer = new HopperlangLexer(input);

            CommonTokenStream tokens = new CommonTokenStream(lexer);

            HopperlangParser parser = new HopperlangParser(tokens);
            System.out.println("Phase 1: Context aggregation");
            final ContextPool nodes = new ContextPool(parser);
            nodes.fill();
            System.out.println("Phase 2: Creating formal structures");
            final HopperlangCompiler compiler = new HopperlangCompiler(nodes);
            System.out.println("Phase 3: Basic checking");
            boolean check = compiler.check();
            if(check) {
                System.out.println("Checking passed!");
            } else {
                System.out.println("Checking failed!");
                System.exit(1);
            }
            System.out.println("Phase 4: Generating vhdl");
            //Phase 4
            VHDLDocument document = new VHDLDocument(compiler);
            System.out.println("Phase 5: Generating file");
            //Phase 5
            OutputStream out = null;
            if(argList.contains(OUTPUT_FILE_ARGUMENT_FLAG)) {
                int index = argList.indexOf(OUTPUT_FILE_ARGUMENT_FLAG)+1;
                if(index < argList.size()) {
                    try {
                        out = new FileOutputStream(argList.get(index));
                    } catch (IOException e) {
                        System.err.println("Error writing output file!");
                    }
                } else {
                    System.err.println("Please add output file to "+OUTPUT_FILE_ARGUMENT_FLAG+" flag!");
                    System.exit(1);
                }
            } else {
                System.out.println("\n\nResult:\n\n");
                out = System.out;
            }
            if(out != null) {
                PrintStream print = new PrintStream(out);
                print.print(document.getContent());
            }
        }



    }
}
