import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name ="MUSEUMS")
public class Museums {

    List<Museum> museums;

    @XmlElement(name = "MUSEUM")
    public void setMuseums(List <Museum> allMuseums)
    {
        this.museums = allMuseums;
    }

    public List<Museum> getMuseums()
    {
        return museums;
    }

    public void add(Museum museum)
    {
        if (museums == null)
        {
            museums = new ArrayList<Museum>();
        }

        museums.add(museum);
    }

}
