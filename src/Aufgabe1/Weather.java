package Aufgabe1;


public class Weather {
    private int id;                 //Eigenschaften-Attribute die wir von der Internetseite heraus lesen
    private String main;
    private String description;
    private String icon;

    public int getId() {
        return id;
    }   //getter und setter mit rechterMaustaste Generate - getter und Setter

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
    public String toString() {              //ich überschreibe die toString Methode mit override

        StringBuilder sb = new StringBuilder();     //hiermit bilde/baue ich einen String

        sb.append("\n----- Weather Information-----\n"); //was neues zum Stringbuilder hinzufügen

        sb.append("ID: " + getId() + "\n"); //  \n kennzeichnet einen Zeilenumbruch

        sb.append("Main: " + getMain() + "\n");

        sb.append("Descriptiong: " + getDescription() + "\n");

        sb.append("Icon: " + getIcon() + "\n");

        sb.append("*****************************");

        return sb.toString(); //Rückgabe des StringBuilder

    }
}