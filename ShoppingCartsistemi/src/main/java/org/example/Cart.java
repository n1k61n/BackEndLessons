package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Cart {
    ArrayList<Product> products = new ArrayList<>();

// addProduct(Product p)
    public void addProduct(Scanner scanner){
        System.out.print("Mehsulun adini yazin: ");
        String name = scanner.nextLine();
        System.out.print("Mehsulun qiymetini yazin: ");
        double price = scanner.nextDouble();
        products.add(new Product(name, price));
        System.out.println("Mehsul elave olundu.");
    }


//o removeProduct(String name)
    public void removeProduct(Scanner scanner){
        System.out.print("Silinen mehsulun adini yazin: ");
        String silinen = scanner.nextLine();
        if(products.removeIf(product -> product.name.equalsIgnoreCase(silinen)))
            System.out.println("Mehsul silindi");
        else
            System.out.println("Mehsul tapilmadi");
    }

//o calculateTotal() → ümumi qiymət
    public void calculateTotal(){
        double totalPrice = 0;
        for(Product product : products){
            totalPrice += product.price;
        }
        System.out.println("Umumi qiymet: " + totalPrice);
    }
//o showAllProducts()

    public void showAllProducts(){
        System.out.println("Sebetde olan mehsullar.");
        System.out.println("-".repeat(60));
        for(Product product : products){
            System.out.println(product);
        }
        System.out.println("-".repeat(60));
    }
}
