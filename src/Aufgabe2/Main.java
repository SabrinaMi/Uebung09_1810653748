package Aufgabe2;

import Aufgabe1.ObjectMapperWeather;
import Aufgabe1.Weather;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args)  throws IOException, JAXBException { //
        ObjectMapperWeather omw = new ObjectMapperWeather(); //Der Jackson ObjectMapper kann JSON aus einer Zeichenkette, einem Stream oder einer Datei analysieren und ein Java-Objekt oder eine Objektgrafik erstellen, die das geparste JSON darstellt.  Das Parsen von JSON in Java-Objekte wird auch als Deserialisierung von Java-Objekten aus JSON bezeichnet.
        Weather w1 = omw.readJsonWithObjectMapper();

        Aufgabe2.Weather w = new Aufgabe2.Weather(w1.getId(), w1.getMain(), w1.getDescription(), w1.getIcon()); //Konstruktor
        JAXBContext jaxbContext = JAXBContext.newInstance(Aufgabe2.Weather.class); //

        Marshaller marshaller = jaxbContext.createMarshaller(); //Marshaller - JavaObjekt in XML umzuwandeln
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true); //unmarshalling - XML in JavaObjekte umwandeln
        marshaller.marshal(w, new File("src/Aufgabe2/weather.xml"));
        marshaller.marshal(w, System.out);
    }
}