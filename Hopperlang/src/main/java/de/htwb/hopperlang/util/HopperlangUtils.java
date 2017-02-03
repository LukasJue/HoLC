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
            int d = Integer.parseInt(s);
        }
        catch(NumberFormatException nfe)
        {
            return false;
        }
        return true;
    }
}
