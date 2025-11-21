package org.example;

public class FoodProduct extends Product{
    private int expiryDays;



    public FoodProduct(String name, double basePrice, int expiryDays) {
        super(name, basePrice);
        this.expiryDays = expiryDays;
    }

    @Override
    public double calculatePrice() {
        if(expiryDays < 5)
            return getBasePrice() * 0.9;
        else
            return getBasePrice();
    }

    @Override
    public String toString() {
        return super.toString() + "\tistifadə tarixinə " + expiryDays +  " gün qalib";
    }
}
