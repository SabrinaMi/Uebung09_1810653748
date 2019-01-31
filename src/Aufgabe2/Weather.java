package Aufgabe2;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)       //XML-
@XmlRootElement                             //Sein Zweck ist es, ein Wurzelelement eindeutig mit einer Klasse zu verknüpfen.
public class Weather {
    @XmlAttribute(name = "id")              //Stellt ein Attribut dar. Gültige und voreingestellte Werte für das Attribut werden in einer Dokumententypdefinition (DTD) oder einem Schema definiert.
    private int id;
    @XmlElement(name = "main")              //Definieren Sie das XML-Element, das verwendet werden soll. Muss nur verwendet werden, wenn sich die neuNeu vom JavaBeans Name unterscheidet.
    private String main;
    @XmlElement(name = "description")
    private String description;
    //@XmlElement(name = "icon") //Aufgabe 4 - auskommentiert - somit erscheint icon nicht da es transient ist/sind
    @XmlTransient                              // kann auf der Typ-Ebene verwendet werden, um eine Klasse aus der Vererbungshierarchie auszuschließen, oder auf der Feld-/Eigenschafts-Ebene, um die Zuordnung eines Feldes/Eigenschaft aufzuheben.
    private String icon; //in der Ausgabe4 erscheint

    public Weather(){} //JACKSON braucht einen leeren Konstruktor
    public Weather(int id, String main, String description, String icon) { //Konstruktor aus den Attributen erstellt
        this.id = id;
        this.main = main;
        this.description = description;
        this.icon = icon;
    }

    public int getId() {
        return id;
    }               //getter and setter

    public void setId(int id) {
        this.id = id;
    }

    public String getMain() {
        return main;
    }

    public void setMain(String main) {
        this.main = main;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    @Override
    public String toString() {          //override des Strings - überschreiben der toString Methode

        StringBuilder sb = new StringBuilder();

        sb.append("\n----- Weather Information-----\n");

        sb.append("ID: " + id + "\n");

        sb.append("Main: " + main + "\n");

        sb.append("Descriptiong: " + description + "\n");

        sb.append("Icon: " + icon + "\n");

        sb.append("*****************************");

        return sb.toString();

    }
}