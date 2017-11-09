package AIT;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

/**
 * The root of the tree were start is made to
 * generate adaptive instructions for refactoring procedures
 * based on specific context of code structure
 */
@XmlRootElement(name="AIT")
@XmlType(propOrder = {"refactorMechanic", "description", "allInstructions"})
public class AdaptiveInstructionTree {

    @XmlTransient
    EnumSet<CodeContext.CodeContextEnum> contextSet;

    String refactorMechanic;
    String description;
    List<Instruction> allInstructions = new ArrayList<Instruction>();

    @XmlElement(name="MECHANIC")
    public void setRefactorMechanic(String refactorMechanic) {
        this.refactorMechanic = refactorMechanic;
    }
    public String getRefactorMechanic() {
        return refactorMechanic;
    }

    @XmlElement(name = "DESCRIPTION")
    public void setDescription(String description) {
        this.description = description;
    }
    public String getDescription() {
        return description;
    }

    public EnumSet<CodeContext.CodeContextEnum> allUniqueCodeContextInTree()
    {
        return contextSet;
    }

    @XmlTransient
    public void setFirstInstruction(Instruction firstInstruction) {
        this.allInstructions.add(0, firstInstruction);
    }

    public Instruction getFirstInstruction() {
        return this.allInstructions.get(0);
    }

    @XmlElement(name = "INSTRUCTION")
    public List<Instruction> getAllInstructions()
    {
        return allInstructions;
    }

    public void setAllInstructions(List<Instruction> instructions)
    {
        this.allInstructions = instructions;
    }

    public void addInstruction(Instruction i) {
        allInstructions.add(i);
    }
}
