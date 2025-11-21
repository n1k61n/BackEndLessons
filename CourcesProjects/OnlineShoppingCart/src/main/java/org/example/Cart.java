package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Cart {
    List<Product> cart = new ArrayList<>();


//    addProduct()
    public void  addProduct(Scanner scanner){
        System.out.print("Mehsulun adini teyin edin: ");
        String name = scanner.next();

        System.out.print("Mehsulun qiyetini teyin edin: ");
        double price = scanner.nextDouble();
        cart.add(new Product(name, price));
        System.out.println("Mehsul sebete elave olundu.");
    }

//    removeProduct()
    public void removeProduct(Scanner scanner){
        System.out.print("Silinnen mehsulun adini daxil edin: ");
        String removeProduct = scanner.next();
        Iterator<Product> it = cart.iterator();
        while(it.hasNext()){
            Product p = it.next();
            if(p.name.equalsIgnoreCase(removeProduct)){
                it.remove();
                System.out.println("Mehsul sebetden silindi.");
            }
        }
    }

//    showCart()
    public void showCart(){
        System.out.println("Sebetde olan mehsullar.");
        for(Product product : cart){
            product.info();
        }
    }

//    getTotalPrice()
    public void getTotalPrice(){
        double total = 0;
        for(Product p : cart){
            total += p.price;
        }
        System.out.println("Umumi medleg: " + total);
    }
}
