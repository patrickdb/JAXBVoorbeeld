package AIT;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

public class InstructionGenerator {

    EnumSet<CodeContext.CodeContextEnum> contextSet;
    AdaptiveInstructionTree aitTree;

    public InstructionGenerator(AdaptiveInstructionTree tree)   {
        aitTree = tree;
    }

    public void provideContext(EnumSet<CodeContext.CodeContextEnum> contextSet) {
        this.contextSet = contextSet;
    }

    public List<Instruction> generateInstruction()
    {
        return new ArrayList<Instruction>();
    }
}
