package org.hbrs.se.ws20.uebung1.control;

import java.util.HashMap;
import java.util.Map;


public class GermanTranslator implements Translator {

    public String date = "Okt/2020"; // Default-Wert
    private Map<Integer, String> numberMap = new HashMap<Integer, String>() {{
        put(1, "eins");
        put(2, "zwei");
        put(3, "drei");
        put(4, "vier");
        put(5, "fünf");
        put(6, "sechs");
        put(7, "sieben");
        put(8, "acht");
        put(9, "neun");
        put(10, "zehn");
    }};

    /**
     * Methode zur Übersetzung einer Zahl in eine String-Repraesentation
     */
    public String translateNumber(int number) {
        // [ihr Source Code aus Übung 1-2]
        if (number > 10 || number < 1) {
            return "Übersetzung der Zahl " + number + " nicht möglich (" + version + ")";
        }
        return numberMap.get(number);
    }

    /**
     * Objektmethode der Klasse GermanTranslator zur Ausgabe einer Info.
     */
    public void printInfo() {
        System.out.println("GermanTranslator v1.9, erzeugt am " + this.date);
    }

    /**
     * Setzen des Datums, wann der Uebersetzer erzeugt wurde (Format: Monat/Jahr (Beispiel: Nov/2020))
     * Das Datum sollte system-intern gesetzt werden und nicht von externen View-Klassen
     */
    public void setDate(String date) {
        this.date = date;
    }

}
