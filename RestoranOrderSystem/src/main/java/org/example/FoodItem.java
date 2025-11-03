package org.example;

import java.util.List;

// • FoodItem: əlavə sahə → isVegetarian → əgər vegetarian isə 5% ucuz.
public class FoodItem extends MenuItem {
    private boolean isVegetarian;

    public FoodItem(String name, double basePrice, boolean isVegetarian) {
        super(name, basePrice, ItemType.FOOD);
        this.isVegetarian = isVegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        isVegetarian = vegetarian;
    }


    @Override
    public double calculatePrice() {
        return isVegetarian ? basePrice * 0.95 : basePrice;
    }

    @Override
    public String toString() {
        String vegan = isVegetarian ? "Vegetarian" : "Non-Vegetarian";
        return super.toString() + " [" + vegan + "]";
    }
}
