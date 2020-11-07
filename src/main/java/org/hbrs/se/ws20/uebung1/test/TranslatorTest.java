
package org.hbrs.se.ws20.uebung1.test;

import org.hbrs.se.ws20.uebung1.control.GermanTranslator;
import org.hbrs.se.ws20.uebung1.control.TranslatorFactory;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
/**
 * @author jsprin2s
 */

public class TranslatorTest {
    GermanTranslator translator = (GermanTranslator) TranslatorFactory.createGermanTranslator();

    @Test
    public void test1() {
        Assertions.assertEquals(translator.translateNumber(1020), "Übersetzung der Zahl 1020 nicht möglich (1.0)");
    }
    @Test
    public void test2() {
        Assertions.assertEquals(translator.translateNumber(-1), "Übersetzung der Zahl -1 nicht möglich (1.0)");
    }
    @Test
    public void test3() {
        Assertions.assertEquals(translator.translateNumber(0), "Übersetzung der Zahl 0 nicht möglich (1.0)");
    }
    @Test
    public void test4() {
        Assertions.assertEquals(translator.translateNumber(3), "drei");
    }

}

