package org.example.animal;

public class Product {
    String name;
    private final double price;


    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void getInfo(){
        System.out.println("Mehsul: " + name + ", Qitmeti: " + price + " AZN");
    }
}
