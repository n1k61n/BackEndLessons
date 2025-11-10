package org.example;

public class Product {
    private String name;
    private double price;
    private int stock;


    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        if (price >= 0.0)
            this.price = price;
        else
            System.out.println("qiymet 0-dan kicik ola bilmez.");
    }

    public void setStock(int stock) {
        if (stock > 0)
            this.stock = stock;
        else
            System.out.println("stok menfi ola bilmez");
    }

    public void showInfo(){
        System.out.println("Adı: " + this.name);
        System.out.println("Qiyməti: " + this.price);
        System.out.println("Stok: " + this.stock);
    }

}
