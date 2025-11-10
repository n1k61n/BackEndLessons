package org.example;

public abstract class Pet {
    public String name;
    public abstract String play();

    public Pet(String name) {
        this.name = name;
    }
}
