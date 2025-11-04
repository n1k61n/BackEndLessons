package org.example;

public class FoodItem extends MenuItem{
    private final boolean isVegetarian;


    public FoodItem(String name, double basePrice, boolean isVegetarian) {
        super(name, basePrice);
        this.isVegetarian = isVegetarian;
        this.basePrice = calculatePrice();
    }

    @Override
    public double calculatePrice() {
        if(isVegetarian){
            this.basePrice -= this.basePrice * 0.05;
        }
        return this.basePrice;
    }
}
