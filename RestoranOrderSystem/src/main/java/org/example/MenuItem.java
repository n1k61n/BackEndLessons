package org.example;


//abstract class MenuItem: name, basePrice, abstract calculatePrice()
public abstract class MenuItem {
    private String name;
    private double basePrice;
    private ItemType itemType;



    public MenuItem(String name, double basePrice, ItemType itemType) {
        this.name = name;
        this.basePrice = basePrice;
        this.itemType = itemType;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public abstract  double calculatePrice();

    @Override
    public String toString() {
        return "MenuItem: "  +
                " " + name + '\'' +
                " " + basePrice;
    }
}
