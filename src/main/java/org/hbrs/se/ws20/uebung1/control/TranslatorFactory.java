package org.hbrs.se.ws20.uebung1.control;
/**
 * @author jsprin2s
 */
public class TranslatorFactory {
    /**
     *
     * @return GemanTranslator
     */
    public static Translator createGermanTranslator() {
        return new GermanTranslator();
    }
}
