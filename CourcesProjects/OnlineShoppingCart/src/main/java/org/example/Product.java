package org.example;

public class Product {
    String name;
    double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void info(){
        System.out.println("Mehsul: " + name + " | " + "Qiymeti: " + price + " AZN.");
    }
}
