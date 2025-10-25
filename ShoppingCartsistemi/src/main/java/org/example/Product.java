package org.example;


/**
 * Məhsul sinifi — ad və qiymət saxlayır.
 */
public class Product {
    String name;
    double price;

    /**
     * Yeni məhsul yaradır.
     * @param name Məhsulun adı
     * @param price Məhsulun qiyməti
     */

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }


    public String toString(){
        return "Ad - "+ name + " | qiymeti - " + price + " AZN";
    }
}
