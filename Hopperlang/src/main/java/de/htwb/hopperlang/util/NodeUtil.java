package de.htwb.hopperlang.util;

import com.sun.corba.se.impl.io.TypeMismatchException;
import de.htwb.hopperlang.NodePool;
import de.htwb.hopperlang.parser.HopperlangParser;

/**
 * Created by juene on 01.02.2017.
 */
public final class NodeUtil {

    public enum SIGNAL_TYPE {
        INPUT,
        OUTPUT,
        LOCAL
    }

    private NodeUtil() {}


    public static final SIGNAL_TYPE getTypeOfDeclartion(HopperlangParser.Signal_declarationContext ctx) {
        switch(ctx.signal_modifier().getText()) {
            case "input":
                return SIGNAL_TYPE.INPUT;
            case "output":
                return SIGNAL_TYPE.OUTPUT;
            case "local":
                return SIGNAL_TYPE.LOCAL;
            default:
                throw new TypeMismatchException("This declaration context has no type! "+ctx.toString());
        }
    }
}
