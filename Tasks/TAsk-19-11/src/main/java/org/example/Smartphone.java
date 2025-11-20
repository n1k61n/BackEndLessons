package org.example;

public class Smartphone extends Electronics{
    public Smartphone(String name, double basePrice) {
        super(name, basePrice);
    }


    @Override
    double calculatePrice() {
        return basePrice + CustomsDuty();
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "name='" + name + '\'' +
                ", basePrice=" + basePrice +
                '}';
    }
}
