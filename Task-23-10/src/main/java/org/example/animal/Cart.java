package org.example.animal;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    List<Product> products = new ArrayList<>();


    public void addProduct(Product product){
        products.add(product);
    }

    public void removeProduct(String name){
        products.removeIf(product -> product.name.equals(name));
    }

    public void showAllProducts(){
        System.out.println("Sebetdeki mehsullar:");
        products.forEach(System.out::println);

    }

    public double calculateTotal(){
        double sum = 0;
        for(Product product : products){
            sum += product.getPrice();
        }


        return sum;
    }
}
