package org.example.items;

public abstract class MenuItem{
    private final String name;
    protected double basePrice;

    public MenuItem(String name, double basePrice) {
        this.name = name;
        this.basePrice = basePrice;
    }



    public abstract double calculatePrice();

    @Override
    public String toString() {
        return String.format("Yemek adi: %s Qiymeti: %s", name, basePrice);
    }
}
