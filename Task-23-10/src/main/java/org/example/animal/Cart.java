package org.example.animal;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    List<Product> products = new ArrayList<>();


    public void addProduct(Product product){
        products.add(product);
    }

    public void remveProduct(String name){
        for(Product product : products){
            if(product.name.equals(name)){
                products.remove(product);
                System.out.println("mehsul silindi.");
                return;
            }
        }
        System.out.println("Mehsul yoxdur " + name);
    }

    public void showAllProducts(){
        System.out.println("Sebetdeki mehsullar:");
        for(Product product : products){
            product.getInfo();
        }

    }

    public double calculateTotal(){
        double sum = 0;
        for(Product product : products){
            sum += product.getPrice();
        }
        return sum;
    }
}
