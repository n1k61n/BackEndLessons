package org.example.product;


import org.example.Product;

public class Book extends Product {
    private String author;
    private int discountPercent;

    public Book(String product, double basePrice, String author, int discountPercent) {
        super(product, basePrice);
        this.author = author;
        this.discountPercent = discountPercent;
    }

    public int getDiscountPercent() {
        return discountPercent;
    }


    @Override
    public double calculatePrice() {
        return super.calculatePrice() * (1 - (double) discountPercent / 100);
    }

    @Override
    public String showInfo() {
        return super.showInfo() + " Muellif: " + author;
    }
}
