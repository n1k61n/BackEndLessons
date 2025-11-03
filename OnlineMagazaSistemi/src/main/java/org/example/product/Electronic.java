package org.example.product;

import org.example.Product;

// * •	Electronic: əlavə sahə → warrantyYears
// * o	calculatePrice → basePrice + warrantyYears * 70
public class Electronic  extends Product {
    private String name;
    private final int warrantyYears;

    public Electronic(String product, String name, double basePrice, int warrantyYears) {
        super(product, basePrice);
        this.warrantyYears = warrantyYears;
        this.name = name;
    }

    @Override
    public double calculatePrice() {
        return super.calculatePrice() + warrantyYears * 70;
    }

    @Override
    public String showInfo() {
        return  String.format("Mehsul - %s adi - %s  qiymeti %.2f", super.product, name,  calculatePrice());
    }
}
