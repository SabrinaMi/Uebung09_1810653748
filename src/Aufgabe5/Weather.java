package Aufgabe5;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Weather {
    private int id;
    private String main;
    private String description;
    private String icon;

    @JsonProperty("Identifikation")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @JsonIgnore
    public String getMain() {
        return main;
    }

    public void setMain(String main) {
        this.main = main;
    }

    @JsonProperty("Beschreibung")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("Bild")
    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();

        sb.append("\n----- Weather Information-----\n");

        sb.append("ID: " + getId() + "\n");

        sb.append("Main: " + getMain() + "\n");

        sb.append("Descriptiong: " + getDescription() + "\n");

        sb.append("Icon: " + getIcon() + "\n");

        sb.append("*****************************");

        return sb.toString();

    }
}