package org.example.market;

public class Product{
    private String name;
    private double price;
    private Category category;

    public Product(String name, double price, Category category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public Category getCategory() {
        return category;
    }

    public void getInfo(){
        System.out.print("Adi: " + name);
        System.out.print(" Qiymeti: " + price);
        System.out.println(" Kategoriyasi: " + category);
    }
}
