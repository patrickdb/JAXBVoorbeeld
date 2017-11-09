package AIT;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;

public class InstructionGenerator {

    AdaptiveInstructionTree aitTree;
    EnumSet<CodeContext.CodeContextEnum> contextSet = null;
    private Map<String, String> parameterMap = null;

    public InstructionGenerator(AdaptiveInstructionTree tree)   {
        aitTree = tree;
    }

    public void provideContext(EnumSet<CodeContext.CodeContextEnum> contextSet) {
        this.contextSet = contextSet;
    }

    /***
     * Define the values of the parameters that are parsed in the template instructions
     * @param parameters Maps variables ($<var>) in instruction to a concrete value
     */
    public void setParameterMap(Map<String, String> parameters) { this.parameterMap = parameters; }

    public List<Instruction> generateInstruction()
    {
        return new ArrayList<Instruction>();
    }
}
