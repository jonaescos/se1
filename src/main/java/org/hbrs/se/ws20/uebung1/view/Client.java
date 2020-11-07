package org.hbrs.se.ws20.uebung1.view;

import org.hbrs.se.ws20.uebung1.control.Translator;
import org.hbrs.se.ws20.uebung1.control.TranslatorFactory;

class Client {

    /*
     * Methode zur Ausgabe einer Zahl auf der Console
     */
    public void display(int aNumber) {
        // In dieser Methode soll die Methode translateNumber
        // mit dem übergegebenen Wert der Variable aNumber
        // aufgerufen werden.
        // Strenge Implementierung gegen das Interface Translator gewuenscht!
        Translator germanTranslator = TranslatorFactory.createGermanTranslator();
        String number = germanTranslator.translateNumber(aNumber);
        System.out.println("Das Ergebnis der Berechnung: " + number);

    }

    public static void main(String[] args) {
        new Client().display(1);
        new Client().display(2);
        new Client().display(-1);
        new Client().display(0);
        new Client().display(10);
        new Client().display(11);
    }


}




