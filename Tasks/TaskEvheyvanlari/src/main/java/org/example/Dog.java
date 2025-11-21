package org.example;

public class Dog extends Pet{

    public Dog(String name) {
        super(name);
    }

    @Override
    public String play() {
        return super.name + " " + "topla oynayır.";
    }
}
