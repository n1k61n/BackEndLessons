package org.example;

public abstract class MenuItem{
    private String name;
    protected double basePrice;

    public MenuItem(String name, double basePrice) {
        this.name = name;
        this.basePrice = basePrice;
    }

    public String getName() {
        return name;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public abstract void calculatePrice();

    @Override
    public String toString() {
        return "MenuItem{" +
                "name='" + name + '\'' +
                ", basePrice=" + basePrice +
                '}';
    }
}
