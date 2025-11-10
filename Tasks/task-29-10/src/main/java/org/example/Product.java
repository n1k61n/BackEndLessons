package org.example;


import java.util.Comparator;

public class Product   {
    private String name;
    private double basePrice;

    public Product(String name, double basePrice) {
        this.name = name;
        this.basePrice = basePrice;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public double calculatePrice(){
        return basePrice;
    }




    public String toString(){
        return String.format("Mehsulun adi: %s \tQiymeti: %.2f", name, basePrice);
    }


}
