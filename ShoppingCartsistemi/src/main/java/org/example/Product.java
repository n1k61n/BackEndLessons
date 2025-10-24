package org.example;

public class Product {
    String name;
    double price;


    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }


    public String toString(){
        return "Ad - "+ name + " | qiymeti - " + price + " AZN";
    }
}
