import AIT.AdaptiveInstructionTree;
import AIT.CodeContext;
import AIT.ContextDecision;
import AIT.Instruction;

import javax.naming.Context;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.EnumSet;
import java.util.Set;

import static AIT.CodeContext.CodeContextEnum.method_single_declaration;

public class JAXBtestje {

    protected void MakeDT()
    {
        AdaptiveInstructionTree tree = new AdaptiveInstructionTree();
        tree.setDescription("... Remember your code is for a human first and a computer second. Humans need good names....");
        tree.setRefactorMechanic("Rename Method");

        Instruction i1 = new Instruction(1, "De naam van methode $method in class $class willen we renamen");
        ContextDecision d1 = new ContextDecision();
        d1.setContextType(method_single_declaration);
        Instruction i2 = new Instruction(2, "Maak een nieuwe methode aan met een verbeterde naam in class $class");
        d1.setInstructionResult(i2);
        i1.addDecision(d1);
        tree.setFirstInstruction(i1);
    }

    public static void main(String[] args) throws JAXBException {

        JAXBtestje t = new JAXBtestje();
        t.MakeDT();

        // Create some single museums
        Museum m1 = new Museum();
        m1.setName("De Pont");
        m1.setCity("Tilburg");
        m1.setChildrenAllowed(true);
        m1.getEx().setExhibition("nu en later");

        Museum m2 = new Museum();
        m2.setName("Krullemuller");
        m2.setCity("Veluwe");
        m2.setChildrenAllowed(true);
        m2.getEx().setExhibition("toen en later");

        // Create a list of museums
        Museums museumList = new Museums();
        museumList.add(m1);
        museumList.add(m2);

        // Serialize a single museum object to oneMuseum.xml
        JAXBContext jaxbContext = JAXBContext.newInstance( Museum.class );
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

        jaxbMarshaller.setProperty( Marshaller.JAXB_FORMATTED_OUTPUT, true );

        jaxbMarshaller.marshal( m1, new File( "oneMuseum.xml" ) );
        jaxbMarshaller.marshal( m1, System.out );

        // Serialize a list of museum objects to museums.xml
        jaxbContext = JAXBContext.newInstance( Museums.class );
        jaxbMarshaller = jaxbContext.createMarshaller();

        jaxbMarshaller.setProperty( Marshaller.JAXB_FORMATTED_OUTPUT, true );

        jaxbMarshaller.marshal( museumList, new File( "museums.xml" ) );
        jaxbMarshaller.marshal( museumList, System.out );

        // Parse XML with 1 museum defintion
        JAXBContext jc = JAXBContext.newInstance(Museum.class);

        Unmarshaller unmarshaller = jc.createUnmarshaller();
        Museum loadedMuseum = (Museum) unmarshaller.unmarshal(new File("oneMuseum.xml"));

        System.out.println(loadedMuseum.getName() + "," + loadedMuseum.getCity());

        // Parse XML with multiple museum definitions
        jc = JAXBContext.newInstance(Museums.class);
        unmarshaller = jc.createUnmarshaller();
        Museums loadedMuseumList = (Museums) unmarshaller.unmarshal(new File("museums.xml"));

        System.out.println("List of museums:");
        for(Museum museum : loadedMuseumList.getMuseums()) {
            System.out.println(museum.getName() + "," + museum.getCity());
        }

    }
}
