package org.example;

public class FoodItem extends MenuItem{
    private boolean isVegetarian;


    public FoodItem(String name, double basePrice, boolean isVegetarian) {
        super(name, basePrice);
        this.isVegetarian = isVegetarian;
    }

    @Override
    public void calculatePrice() {
        if(isVegetarian){
            basePrice -= basePrice * 0.05;
        }
    }
}
