package AIT;

import javax.naming.Context;
import java.util.ArrayList;
import java.util.List;

public class Instruction {

    int     instructionID = -1;
    String  instructionDescription;
    List<ContextDecision> decisions;

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
