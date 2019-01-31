package Aufgabe3;

import Aufgabe5.Weather;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class JSONWriterObjectMapper {
    ObjectMapper objectMapper = new ObjectMapper(); //Konstruktor - Dateispeicherarten

    public void writeWeatherToJson(Weather w){
        try{
            String jsonString = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(w); //OBJECTMAPPER - um von JSON zu lesen und um nach JSON zu schreiben
            System.out.println("JSON String: " + jsonString);
        } catch(JsonGenerationException e){ //JsonGenerationException zeigt an, dass ein falsches JSON generiert wird
            e.printStackTrace();
        } catch (JsonMappingException e){   //wenn Attribute nicht übereinstimmen, Geprüfte Ausnahme, die verwendet wird, um fatale Probleme mit der Zuordnung von Inhalten zu signalisieren,
            e.printStackTrace();
        } catch (IOException e){        //Signalisiert, dass eine I/O-Ausnahme irgendeiner Art aufgetreten ist. Diese Klasse ist die allgemeine Klasse von Ausnahmen, die durch fehlgeschlagene oder unterbrochene I/O-Operationen verursacht werden.
            e.printStackTrace();        //I-Input, O-Output, dass was mit der Eingabe oder Ausgabe falsch ist - einlesen der WeatherSchnittstelle falsch gelaufen ist
        }
    }
}