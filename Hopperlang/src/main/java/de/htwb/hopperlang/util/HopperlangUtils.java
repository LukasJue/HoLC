package de.htwb.hopperlang.util;

import com.sun.corba.se.impl.io.TypeMismatchException;
import de.htwb.hopperlang.HopperlangCompiler;
import de.htwb.hopperlang.HopperlangCompiler.SignalPos;
import de.htwb.hopperlang.VHDLDocument;
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

    public static final String conditionToString(HopperlangCompiler.SignalPool pool, HopperlangCompiler.Condition condition) {
        int signalNameCount = 0;
        int numberCount = 0;
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < condition.getParts().size(); i++) {
            HopperlangCompiler.ConditionPart part = condition.getParts().get(i);
            if(part == HopperlangCompiler.ConditionPart.Signal) {
                if(i > 0 && (condition.getParts().get(i-1) == HopperlangCompiler.ConditionPart.Equals ||
                        condition.getParts().get(i-1) == HopperlangCompiler.ConditionPart.Unequal)) {
                    HopperlangCompiler.Signal leftSide = pool.getSignal(condition.getUsedSignals().get(signalNameCount-1));
                    HopperlangCompiler.Signal rightSide = pool.getSignal(condition.getUsedSignals().get(signalNameCount));
                    builder.append(getConversionWrappedRightSide(leftSide, rightSide));
                } else {
                    builder.append(condition.getUsedSignals().get(signalNameCount));
                }
                signalNameCount++;
            } else if (part == HopperlangCompiler.ConditionPart.Number) {
                String signalName = condition.getUsedSignals().get(signalNameCount-1);
                HopperlangCompiler.Signal signal = pool.getSignal(signalName);
                builder.append(formatNumberForSignal(signal, condition.getUsedNumbers().get(numberCount)));
                numberCount++;
            } else {
                builder.append(part.toString());
            }
            builder.append(" ");
        }
        return builder.toString();
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

    public static final String getConversionWrappedRightSide(HopperlangCompiler.Signal left, HopperlangCompiler.Signal right) {
        switch(left.getType().getSignalType()) {
            case LOGIC:
                switch (right.getType().getSignalType()) {
                    case LOGIC:
                        return right.getName();
                    case VECTOR:
                        return right.getName()+"(0)";
                    case INT:
                        return "std_logic_vector(to_unsigned("+right.getName()+", "+right.getType().getWidth()+"))(0)";
                    default:
                        return right.getName();
                }
            case INT:
                switch (right.getType().getSignalType()) {
                    case LOGIC:
                        System.err.println("Conversion of single bit to integer nor supported! bit: "+
                                right.getName()+" integer:" +left.getName());
                        return right.getName();
                    case VECTOR:
                        return "to_integer(unsigned("+right.getName()+"))";
                    case INT:
                        return right.getName();
                    default:
                        return right.getName();
                }
            case VECTOR:
                switch (right.getType().getSignalType()) {
                    case LOGIC:
                        StringBuilder builder = new StringBuilder();
                        builder.append("\"");
                        for(int i = 0; i < left.getType().getWidth()-1; i++) {
                            builder.append("0");
                        }
                        builder.append("\"&"+right.getName());
                        return builder.toString();
                    case VECTOR:
                        return right.getName();
                    case INT:
                        return "std_logic_vector(to_unsigned("+right.getName()+", "+right.getType().getWidth()+"))";
                    default:
                        return right.getName();
                }
            default:
                return right.getName();
        }
    }
}
