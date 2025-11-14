package org.example;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Səbət sinifi — məhsulları əlavə/silmə və ümumi məbləği hesablamaq üçün.
 */
public class Cart {
    ArrayList<Product> products = new ArrayList<>();

    /**
     * Scanner vasitəsilə məhsul əlavə edir.
     * @param scanner İstifadəçi girişini oxumaq üçün
     */
    public void addProduct(Scanner scanner){
        System.out.print("Mehsulun adini yazin: ");
        String name = scanner.nextLine();
        System.out.print("Mehsulun qiymetini yazin: ");
        double price = scanner.nextDouble();
        products.add(new Product(name, price));
        System.out.println("Mehsul elave olundu.");
    }


    /**
     * Scanner vasitəsilə məhsulu silir.
     * @param scanner İstifadəçi girişini oxumaq üçün
     */
    public void removeProduct(Scanner scanner){
        System.out.print("Silinen mehsulun adini yazin: ");
        String silinen = scanner.nextLine();
        if(products.removeIf(product -> product.name.equalsIgnoreCase(silinen)))
            System.out.println("Mehsul silindi");
        else
            System.out.println("Mehsul tapilmadi");
    }

    /**
     * Səbətdəki məhsulların ümumi qiymətini hesablayır.
     */
    public void calculateTotal(){
        double totalPrice = 0;
        for(Product product : products){
            totalPrice += product.price;
        }
        System.out.println("Umumi qiymet: " + totalPrice);
    }

    /**
     * Bütün məhsulları ekrana çıxarır.
     */
    public void showAllProducts(){
        System.out.println("Sebetde olan mehsullar.");
        System.out.println("-".repeat(60));
        products.forEach(p -> System.out.println(p));
        System.out.println("-".repeat(60));
    }
}
