package Aufgabe1;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class ObjectMapperWeather {
    public Weather readJsonWithObjectMapper() throws IOException { //IO heißt : Input -Output. Also Ausnahme für alle Einlese und Ausgabefehler.

                ObjectMapper objectMapper = new ObjectMapper();
                /*stellt Methoden für JSON(=Dateispeicherart) lesung und schreibung zur Verfügung,
                beinhaltet readValue Methode, Klasse von Jackson API*/

        Weather emp = objectMapper.readValue(new File("src/Aufgabe1/weather.json"), Weather.class);
        /*schreibt Inhslt von JSON Datei ins Objekt, macht neues file,
        Name weil es in src ist, weather.class damit er auf die klasse zugreift*/

        return emp;

    }
}