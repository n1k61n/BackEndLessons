package org.example;

import static org.junit.Assert.*;
import org.junit.Test;

public class EncodeSimpleTest {

    Leetspeak myEncoder = new Leetspeak();

    @Test
    public void simpleTest(){
        assertTrue("empty string", myEncoder.encode("").equals(""));
        assertTrue("abcdef string", myEncoder.encode("abcdef").equals("4bcd3f"));
    }
}