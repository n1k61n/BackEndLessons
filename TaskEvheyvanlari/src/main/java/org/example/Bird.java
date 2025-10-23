package org.example;

public class Bird extends Pet{

    public Bird(String name) {
        super(name);
    }

    @Override
    public String play() {
        return super.name + " " + "oxuyur və uçur.";
    }
}
