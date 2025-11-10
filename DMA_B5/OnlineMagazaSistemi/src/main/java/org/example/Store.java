package org.example;

import org.example.product.Book;
import org.example.product.Clothing;
import org.example.product.Electronic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// * •	Store sinfi → ArrayList<Product> saxlayır, addProduct() və showAllProducts() metodları var.
public class Store {
    List<Product> products = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);



    public void addProduct(){
        System.out.print("Mehsulun novunu secin elektronika/kitab/paltar: ");
        String product = scanner.next().toLowerCase();
        switch (product){
            case "elektronika" -> {
                System.out.print("Elektronika adi: ");
                String name = scanner.next().toLowerCase();
                System.out.print("Qiymetini: ");
                double price = Double.parseDouble(scanner.next());
                System.out.print("Qarantiya il: ");
                int year = Integer.parseInt(scanner.next());
                products.add(new Electronic(product, name, price, year));
            }
            case "kitab" -> {
                System.out.print("Muellifi: ");
                String author = scanner.next();
                System.out.print("Qiymetini: ");
                double price = Double.parseDouble(scanner.next());
                System.out.println("endirim %");
                int percent = Integer.parseInt(scanner.next());
                products.add(new Book(product,  price, author, percent));

            }
            case "paltar" -> {
                System.out.print("Qiymetini: ");
                double price = Double.parseDouble(scanner.next());
                System.out.print("Olcu: ");
                int size = Integer.parseInt(scanner.next());
                System.out.println("Movsumu secin winter/autumn/summer/spring");
                String season = scanner.next();
                Season setSeason = Season.getSeason(season);
                products.add(new Clothing(product, price, size, setSeason));
            }
            default -> System.out.println("Sehv secim etmisiniz.");
        }
    }

    public void showAllProducts(){
        System.out.println("\n-------Butun mehsullar----------");
        products.forEach(product -> System.out.println(product.showInfo()));
        System.out.println("-".repeat(55));
    }
}
