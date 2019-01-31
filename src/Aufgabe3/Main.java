package Aufgabe3;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;


public class Main {
    public static void main(String[] args) throws JAXBException {
        File file = new File("src/Aufgabe2/weather.xml");
        JAXBContext jaxbContext = JAXBContext.newInstance(Aufgabe2.Weather.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        Aufgabe2.Weather w = (Aufgabe2.Weather) unmarshaller.unmarshal(file);
        System.out.println(w);

        Aufgabe5.Weather w2 = new Aufgabe5.Weather();  //Konstruktor
        w2.setId(w.getId());        // schreibt mir mein WetterObjekt zu JSON
        w2.setMain(w.getMain());
        w2.setDescription(w.getDescription());
        w2.setIcon(w.getIcon());
        JSONWriterObjectMapper jom = new JSONWriterObjectMapper();
        jom.writeWeatherToJson(w2);
    }
}