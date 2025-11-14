package org.example.items;

public class Drinkitem extends MenuItem {
    private String size;

    public Drinkitem(String name, double basePrice, String size) {
        super(name, basePrice);
        this.size = size;
        this.basePrice = calculatePrice();
    }

    @Override
    public double calculatePrice() {
        switch (size){
            case "small":
                break;
            case "medium":
                basePrice += 1;
                break;
            case "large":
                basePrice += 2;
                break;
        }
        return basePrice;
    }
}
