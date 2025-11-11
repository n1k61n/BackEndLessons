package org.example;


import javax.sound.midi.Synthesizer;

public class Main {
    public static void main(String[] args) {
        Hex hex = new Hex(255);
        System.out.println(Hex.parse("200"));
    }
}

