package org.example;

import java.util.List;
import java.util.Locale;

// • DrinkItem: əlavə sahə → size (small, medium, large)
// o small → +0, medium → +1, large → +2 AZN
public class DrinkItem extends MenuItem {
    private String size;

    public DrinkItem(String name, double basePrice, String size) {
        super(name, basePrice, ItemType.DRINk);
        this.size = size.toLowerCase();
    }


    @Override
    public double calculatePrice() {
        double price = basePrice;
        switch (size) {
            case "small" -> {
                price += 0;
            }
            case "medium" -> {
                price += 1;
            }
            case "large" -> {
                price += 2;
            }
            default -> {
                System.out.println("⚠️ Yanlış ölçü, small qəbul olunur.");
            }
        }
        return price;
    }

    @Override
    public String toString() {
        return name + " (" + size + ") — " + String.format("%.2f", calculatePrice()) + " AZN";
    }
}
