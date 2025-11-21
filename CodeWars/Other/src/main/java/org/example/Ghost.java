package org.example;

import java.util.Random;

public class Ghost {
    // your code goes here
    String[] colors = {"white" , "yellow" , "purple" , "red"};
    String color;

    public Ghost(){
        this.color = colors[(int)(Math.random() * colors.length)];
    }

    public String getColor(){
        return this.color;
    }
}
