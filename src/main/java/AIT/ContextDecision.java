package AIT;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement(name="DECISION")
public class ContextDecision {

    @XmlTransient
    Instruction previousInstruction;
    @XmlTransient
    Instruction nextInstruction;
    CodeContext.CodeContextEnum contextType;
    int         nextInstructionID = -1;


    @XmlAttribute
    public void setContextType(CodeContext.CodeContextEnum contextType) {
        this.contextType = contextType;
    }
    public CodeContext.CodeContextEnum getContextType() {
        return contextType;
    }

    @XmlElement(name="NEXT_INSTRUCTION")
    public void setNextInstructionID(int instructionResult) {
        this.nextInstructionID = instructionResult;
    }
    public int getNextInstructionID() {
        return nextInstructionID;
    }
}
