/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package org.hbrs.se.ws20.uebung1.view;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * @author jsprin2s
 */
public class ClientTest {

    Client client = new Client();
    PrintStream old = System.out;

    public static void main(String[] args) {
        new ClientTest().startTest();
    }

    /**
     * runs tests
     */
    public void startTest() {
        if (test())
            System.out.println("Success");
        else
            System.err.println("Fail");

    }

    /**
     * runs different testCases
     * @return if all cases was successful
     */
    private boolean test() {

        return test(1020, "Das Ergebnis der Berechnung: Übersetzung der Zahl 1020 nicht möglich (1.0)")
                && test(-1, "Das Ergebnis der Berechnung: Übersetzung der Zahl -1 nicht möglich (1.0)")
                && test(0, "Das Ergebnis der Berechnung: Übersetzung der Zahl 0 nicht möglich (1.0)")
                && test(4, "Das Ergebnis der Berechnung: vier");


    }

    /**
     *
     * Catch the output to console and compares with expectedOutput
     *
     * @param input             the input value
     * @param expectedOutput    the output which is expected
     * @return                  returns if expected output equals output
     */

    private boolean test(int input, String expectedOutput) {

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        System.setOut(ps);
        client.display(input);

        System.out.flush();
        System.setOut(old);
        String output = baos.toString();

        return output.replace("\n", "").replace("\r", "").equals(expectedOutput);

    }



}

