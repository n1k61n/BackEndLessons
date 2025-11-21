package org.example.animal;

public class Product {
    String name;
    private  double price;


    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String toString(){
        return "Mehsul: " + name + ", Qitmeti: " + price + " AZN";
    }
}
