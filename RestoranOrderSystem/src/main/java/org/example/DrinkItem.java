package org.example;

import java.util.List;

// • DrinkItem: əlavə sahə → size (small, medium, large)
// o small → +0, medium → +1, large → +2 AZN
public class DrinkItem extends MenuItem{


    public DrinkItem(String name, double basePrice, ItemType itemType) {
        super(name, basePrice, itemType);
    }

    @Override
    public double calculatePrice() {
        return 0;
    }
}
