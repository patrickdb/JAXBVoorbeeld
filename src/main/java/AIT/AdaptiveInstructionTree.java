package AIT;

import javax.xml.bind.annotation.*;
import java.util.EnumSet;

/**
 * The root of the tree were start is made to
 * generate adaptive instructions for refactoring procedures
 * based on specific context of code structure
 */
@XmlRootElement(name="AIT")
@XmlType(propOrder = {"refactorMechanic", "description", "firstInstruction"})
public class AdaptiveInstructionTree {

    @XmlTransient
    EnumSet<CodeContext.CodeContextEnum> contextSet;

    @XmlElement(name="MECHANIC")
    String refactorMechanic;

    @XmlElement(name = "DESCRIPTION")
    String description;

    @XmlElement(name = "INSTRUCTION")
    Instruction firstInstruction;

    public String getRefactorMechanic() {
        return refactorMechanic;
    }

    public void setRefactorMechanic(String refactorMechanic) {
        refactorMechanic = refactorMechanic;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        description = description;
    }

    public EnumSet<CodeContext.CodeContextEnum> allUniqueCodeContextInTree()
    {
        return contextSet;
    }

    public void setFirstInstruction(Instruction firstInstruction) {
        this.firstInstruction = firstInstruction;
    }
}
