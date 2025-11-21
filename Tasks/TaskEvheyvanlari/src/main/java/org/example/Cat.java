package org.example;

public class Cat extends Pet{
    public Cat(String name) {
        super(name);
    }

    @Override
    public String play() {
        return super.name + " " + "yumaqla oynayır.";
    }
}
