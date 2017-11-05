package AIT;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement(name="DECISION")
public class ContextDecision {

    @XmlAttribute
    CodeContext.CodeContextEnum contextType;

    @XmlElement(name="INSTRUCTION")
    Instruction instructionResult;

    @XmlTransient
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
