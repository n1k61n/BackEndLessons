package org.example;

import java.util.ArrayList;
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
        String removeProduct = scanner.nextLine();
        for(Product p : cart){
            if(p.name.equals(removeProduct)){
                cart.remove(p);
                System.out.println("Mehsul sebetden silindi.");
                break;
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
