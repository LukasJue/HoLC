package de.htwb.hopperlang;

/**
 * Created by laokoon on 03.02.17.
 */
public class VHDLDocument {

    private static final String CURRENT_STATE= "currentState";
    private static final String NEXT_STATE = "nextState";
    private static final String STATE_TYPE_NAME = "STATE";

    private static final String STORAGE_PROCESS_NAME = "storage";
    private static final String MEMORY_PROCESS_NAME = "memory";

    private HopperlangCompiler compiler;
    private String automateName;
    private String content = new String();

    public VHDLDocument(HopperlangCompiler compiler) {
        this.compiler = compiler;
        this.automateName = compiler.automateName;
        fill();
    }

    private void fill() {
        StringBuilder builder = new StringBuilder();
        builder.append("library IEEE;\n");
        builder.append("use IEEE.STD_LOGIC_1164.ALL;\n");
        builder.append("use IEEE.NUMERIC_STD.ALL;\n");
        builder.append("\n\n");
        builder.append("entity "+automateName+" is\n");
        builder.append("Port (\n");
        for(int i = 0; i < compiler.getSignals().getInputSignals().size(); i++) {
            HopperlangCompiler.Signal signal = compiler.getSignals().getInputSignals().get(i);
            builder.append(signal.name);
            builder.append(" : in ");
            builder.append(getSignalTypeWithRangeInit(signal));
            if(compiler.getSignals().getOutputSignals().size() > 0 || i < compiler.getSignals().getInputSignals().size()-1) {
                builder.append(";\n");
            }
        }
        for(int i = 0; i < compiler.getSignals().getOutputSignals().size(); i++) {
            HopperlangCompiler.Signal signal = compiler.getSignals().getOutputSignals().get(i);
            builder.append(signal.name);
            builder.append(" : out ");
            builder.append(getSignalTypeWithRangeInit(signal));
            if(i < compiler.getSignals().getOutputSignals().size()-1) {
                builder.append(";\n");
            }
        }
        builder.append("\n);\n");
        builder.append("end "+automateName+";\n");
        builder.append("\n\n");
        builder.append("architecture Behavioral of "+automateName+" is\n\n");
        builder.append(createStateTypeLine());
        builder.append("\n");
        builder.append("signal "+CURRENT_STATE+": "+STATE_TYPE_NAME+" := "+compiler.states.get(0).name+";\n");
        builder.append("signal "+NEXT_STATE+": "+STATE_TYPE_NAME+" := "+compiler.states.get(0).name+";\n");
        for(HopperlangCompiler.Signal signal : compiler.getSignals().getLocalSignals()) {
            builder.append("signal "+signal.name+" : "+getSignalTypeWithRangeInit(signal));
            builder.append(";\n");
        }
        builder.append("\nbegin\n\n");
        builder.append(STORAGE_PROCESS_NAME+" : process(");
        builder.append(HopperlangCompiler.CLK_SIGNAL_NAME+", "+HopperlangCompiler.RESET_SIGNAL_NAME+")\n");
        builder.append("begin\n");
        builder.append("if "+HopperlangCompiler.RESET_SIGNAL_NAME+"= '1' then\n");
        builder.append(CURRENT_STATE+"<="+compiler.states.get(0).name+";\n");
        builder.append(NEXT_STATE +"<="+compiler.states.get(0).name+";\n");
        builder.append("elsif "+HopperlangCompiler.ENABLE_SIGNAL_NAME+"='1' AND ");
        builder.append("RISING_EDGE("+HopperlangCompiler.CLK_SIGNAL_NAME+") then\n");
        builder.append(CURRENT_STATE+"<="+NEXT_STATE+";\n");
        builder.append("end if;\nend process "+STORAGE_PROCESS_NAME+";\n");

        builder.append("end Behavioral;\n");
        content = builder.toString();
    }

    public String getContent() {
        return content;
    }

    private String getSignalTypeWithRangeInit(HopperlangCompiler.Signal signal) {
        StringBuilder builder = new StringBuilder();
        switch (signal.type.signalType) {
            case LOGIC:
                builder.append("STD_LOGIC");
                break;
            case VECTOR:
                builder.append("STD_LOGIC_VECTOR (");
                builder.append(signal.type.width-1);
                builder.append(" downto 0)");
                break;
            case INT:
                builder.append("INTEGER RANGE 0 to ");
                builder.append((int)(Math.pow(2, signal.type.width)-1));
                break;
        }
        return builder.toString();
    }

    private String createStateTypeLine() {
        StringBuilder builder = new StringBuilder();
        builder.append("type "+STATE_TYPE_NAME+" is (");
        for(int i = 0; i < compiler.states.size(); i++) {
            builder.append(compiler.states.get(i).name);
            if(i < compiler.getStates().size()-1) {
                builder.append(", ");
            }
        }
        builder.append(");\n");
        return builder.toString();
    }
}
