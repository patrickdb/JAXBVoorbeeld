package AIT;

import javax.naming.Context;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement (name = "INSTRUCTION")
public class Instruction {

    @XmlAttribute
    int     instructionID = -1;

    @XmlElement(name = "TEXT")
    String  instructionDescription;

    List<ContextDecision> decisions;

    @XmlElement(name= "DECISION")
    public void setDecisions(List<ContextDecision> decisions) {
        this.decisions = decisions;
    }

    public Instruction(int i, String s) {
        this.instructionDescription = s;
        this.instructionID = i;
    }

    public String getInstructionDescription() {
        return instructionDescription;
    }

    public void setInstructionDescription(String description) {
        this.instructionDescription = description;
    }

    public List<ContextDecision> getDecisions()
    {
        return decisions;
    }

    public void addDecision(ContextDecision decision)
    {
        if (decisions == null)
        {
            decisions = new ArrayList<ContextDecision>();
        }

        decisions.add(decision);
    }
}
