package de.htwb.hopperlang.util;

import com.sun.corba.se.impl.io.TypeMismatchException;
import de.htwb.hopperlang.HopperlangCompiler;
import de.htwb.hopperlang.HopperlangCompiler.SignalPos;
import de.htwb.hopperlang.parser.HopperlangParser;

import java.util.List;

/**
 * Created by juene on 01.02.2017.
 */
public final class HopperlangUtils {

    private HopperlangUtils() {}


    public static final SignalPos getTypeOfDeclartion(HopperlangParser.Signal_declarationContext ctx) {
        switch(ctx.signal_modifier().getText()) {
            case "input":
                return SignalPos.INPUT;
            case "output":
                return SignalPos.OUTPUT;
            case "local":
                return SignalPos.LOCAL;
            default:
                throw new TypeMismatchException("This declaration context has no type! "+ctx.toString());
        }
    }

    public static final boolean containsState(List<HopperlangCompiler.State> states, String stateName) {
        for(HopperlangCompiler.State state : states) {
            if(state.getName().equals(stateName)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean isIntegerNumeric(String s) {
        try
        {
            int i = Integer.parseInt(s);
        }
        catch(NumberFormatException nfe)
        {
            return false;
        }
        return true;
    }

    public static final String formatNumberForSignal(HopperlangCompiler.Signal signal, int value) {
        int size;
        switch (signal.getType().getSignalType()) {
            case LOGIC:
                if (value > 1 || value < 0) {
                    System.err.println("Assigning value not matching for single bit! name: " + signal.getName() + " value: " + value);
                }
                return String.format("'%d'", value);
            case INT:
                size = (int)Math.pow(2, signal.getType().getWidth())-1;
                if(value > size) {
                    System.err.println("Assigning value not matching for integer size! name: " + signal.getName()
                            + " size: "+size+" value: " + value);
                }
                return Integer.toString(value);
            case VECTOR:
                size = (int)Math.pow(2, signal.getType().getWidth())-1;
                if(value > size) {
                    System.err.println("Assigning value not matching for bus size! name: " + signal.getName()
                            + " size: "+size+" value: " + value);
                }
                String bin = Integer.toString(value, 2);
                StringBuilder builder = new StringBuilder();
                builder.append("\"");
                for(int i = bin.length(); i < signal.getType().getWidth(); i++) {
                    builder.append("0");
                }
                builder.append(bin);
                builder.append("\"");
                return builder.toString();
            default:
                return Integer.toString(value);
        }
    }

    public static final HopperlangCompiler.Unary getOpositeUnary(HopperlangCompiler.Unary part) {
        switch (part) {
            case Equals:
                return HopperlangCompiler.Unary.Unequal;
            case Unequal:
                return HopperlangCompiler.Unary.Equals;
            case Lower:
                return HopperlangCompiler.Unary.GreaterEquals;
            case LowerEquals:
                return HopperlangCompiler.Unary.Greater;
            case Greater:
                return HopperlangCompiler.Unary.LowerEquals;
            case GreaterEquals:
                return HopperlangCompiler.Unary.Lower;
            default:
                return part;
        }
    }
}
