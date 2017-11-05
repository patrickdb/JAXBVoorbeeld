import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;

@XmlRootElement(name="EXHIBITIONS")
public class Exhibitions {

    @XmlElement(name="EXB")
    public String getExhibition() {
        return exhibition;
    }

    public void setExhibition(String exhibition) {
        this.exhibition = exhibition;
    }

    String exhibition;
}
