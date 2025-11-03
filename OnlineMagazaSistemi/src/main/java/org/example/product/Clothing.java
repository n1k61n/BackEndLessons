package org.example.product;


import org.example.Product;
import org.example.Season;

//Clothing: əlavə sahə → size, season
// * o	calculatePrice → Əgər season = "Winter" → +10%, əks halda eyni
public class Clothing extends Product {
    private int size;
    private Season season;

    public Clothing(String product, double basePrice, int size, Season season) {
        super(product, basePrice);
        this.size = size;
        this.season = season;
    }

    @Override
    public double calculatePrice() {
        double result = super.calculatePrice();
        if (season == Season.WINTER)
            result += result * 0.1;
        return result;
    }

    @Override
    public String showInfo() {
        return super.showInfo() + " olcusu: " + size + " sezon " + season;
    }
}
