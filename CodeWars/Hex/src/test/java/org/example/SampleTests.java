package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

// TODO: Replace examples and use TDD development by writing your own tests

public class SampleTests {
    @Test
    public void SampleTests() {
        Hex FF = new Hex(255);
        assertEquals("0xFF",FF.toString());
        assertEquals(256 ,FF.valueOf() + 1);
        assertEquals( "0xFF",FF.toJSON());
        assertEquals(FF,new Hex(255));
        assertEquals("0xFE",FF.minus(1).toString());
        assertEquals("0x0",FF.minus(FF).toString());
        assertEquals("0xF",new Hex(10).plus(5).toString());
        assertEquals(32,Hex.parse("0x20"));
        assertEquals(512,Hex.parse("200"));

    }
}