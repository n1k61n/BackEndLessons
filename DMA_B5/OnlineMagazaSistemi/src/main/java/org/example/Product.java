package org.example;



public class Product{
    protected String product;
    private double basePrice;

    public Product( String product, double basePrice) {
        this.product = product;
        this.basePrice = basePrice;
    }

    public double calculatePrice(){
        return basePrice;
    }


    public String showInfo(){
        return String.format("Mehsul - %s  qiymeti %.2f", product, calculatePrice());
    }
}
