package org.example;

import static org.junit.Assert.assertEquals;

public class Tester {
    public static void doTest(int n, String expected) {
        String actual = Kata.multiTable(n);
        assertEquals(expected, actual);
    }
}