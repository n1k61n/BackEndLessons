package org.example;

import javax.xml.namespace.QName;

public class Product {
    private String name;
    private double price;
    private int stock;

    public Product(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void showInfo(){
        System.out.println("Adı: " + this.name);
        System.out.println("Qiyməti: " + this.price);
        System.out.println("Stok: " + this.stock);
    }

}
