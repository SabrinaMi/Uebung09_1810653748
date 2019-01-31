package Aufgabe1;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException { //IO heißt : Input -Output. Also Ausnahme für alle Einlese und Ausgabefehler.

        ObjectMapperWeather omw = new ObjectMapperWeather();  //neuen ObjectMapperWeather Konstruktor machen
        System.out.println(omw.readJsonWithObjectMapper());     //omw mit readJason ausprinten
    }
}