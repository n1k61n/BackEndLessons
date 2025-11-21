package org.example;


/*
1.Task – Məhsul idarəetməsi
Təsvir:
Product class:
•	private sahələr: name, price, stock
•	metodlar:
o	setPrice(double price) → qiymət 0-dan kiçik ola bilməz
o	setStock(int stock) → stok mənfi ola bilməz
o	showInfo() → məhsul haqqında məlumatı çap et.
Nümunə:
Məhsul: Laptop
Qiymət: 1500.0
Stok: 5

 */
public class Product {
    private final String name;
    private double price;
    private int stock;

    public Product(String name, double price, int stock) {
        this.name = name;
        setPrice(price);
        setStock(stock);
    }

    public void showInfo() {
        System.out.printf("Mehsulun adi: %s, Qiymeti: %s, Stok: %s%n", name, price, stock);
    }

    public void setPrice(double price) {
        if (price < 0) {
            System.out.println(" qiymət 0-dan kiçik ola bilməz");
        } else {
            this.price = price;
        }
    }

    public void setStock(int stock) {
        if (stock < 0) System.out.println("stok mənfi ola bilməz");
        else this.stock = stock;
    }
}
