package AIT;

public class ContextDecision {

    CodeContext.CodeContextEnum contextType;

    Instruction instructionResult;
    Instruction previousInstruction;

    public CodeContext.CodeContextEnum getContextType() {
        return contextType;
    }

    public void setContextType(CodeContext.CodeContextEnum contextType) {
        this.contextType = contextType;
    }

    public Instruction getInstructionResult() {
        return instructionResult;
    }

    public void setInstructionResult(Instruction instructionResult) {
        this.instructionResult = instructionResult;
    }
}
