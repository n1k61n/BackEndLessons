package org.example;


//abstract class MenuItem: name, basePrice, abstract calculatePrice()
public abstract class MenuItem {
    protected String name;
    protected double basePrice;
    protected ItemType type;



    public MenuItem(String name, double basePrice, ItemType type) {
        this.name = name;
        this.basePrice = basePrice;
        this.type = type;
    }


    public abstract  double calculatePrice();

    @Override
    public String toString() {
        return name + " (" + type + ") - " + String.format("%.2f AZN", calculatePrice());
    }
}
