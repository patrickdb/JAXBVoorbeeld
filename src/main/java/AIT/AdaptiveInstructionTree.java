package AIT;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.EnumSet;

/**
 * The root of the tree were start is made to
 * generate adaptive instructions for refactoring procedures
 * based on specific context of code structure
 */
@XmlRootElement(name="AIT")
public class AdaptiveInstructionTree {

    EnumSet<CodeContext.CodeContextEnum> contextSet;

    public String getRefactorMechanic() {
        return RefactorMechanic;
    }

    public void setRefactorMechanic(String refactorMechanic) {
        RefactorMechanic = refactorMechanic;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public EnumSet<CodeContext.CodeContextEnum> allUniqueCodeContextInTree()
    {
        return contextSet;
    }

    @XmlElement(name="MECHANIC")
    String RefactorMechanic;

    @XmlElement(name = "DESCRIPTION")
    String Description;

    public void setFirstInstruction(Instruction firstInstruction) {
        this.firstInstruction = firstInstruction;
    }

    // @XmlElement(name = "INSTRUCTION")
    Instruction firstInstruction;
}
