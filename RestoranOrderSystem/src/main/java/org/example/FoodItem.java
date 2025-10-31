package org.example;

import java.util.List;

// • FoodItem: əlavə sahə → isVegetarian → əgər vegetarian isə 5% ucuz.
public class FoodItem extends MenuItem {
    private boolean isVegetarian;

    public FoodItem(String name, double basePrice, ItemType itemType) {
        super(name, basePrice, itemType);
    }


    public void setVegetarian(boolean vegetarian) {
        isVegetarian = vegetarian;
    }

    @Override
    public double calculatePrice() {
        return 0;
    }
}
