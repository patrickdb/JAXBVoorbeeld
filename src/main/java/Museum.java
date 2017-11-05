import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="MUSEUM")
public class Museum {

    String name;
    boolean childrenAllowed = false;
    String city;

    Exhibitions ex = new Exhibitions();

    @XmlElement(name = "EXHIBITIONS")
    public Exhibitions getEx() {
        return ex;
    }

    public void setEx(Exhibitions ex) {
        this.ex = ex;
    }

    @XmlElement(name = "NAME")
    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    @XmlElement(name = "CITY")
    public void setCity(String city) {
        this.city = city;
    }

    public String getCity()
    {
        return city;
    }

    @XmlAttribute(name = "children_allowed")
    public void setChildrenAllowed(boolean allowed)
    {
        this.childrenAllowed = allowed;
    }

    public boolean getChildrenAllowed()
    {
        return childrenAllowed;
    }
}
