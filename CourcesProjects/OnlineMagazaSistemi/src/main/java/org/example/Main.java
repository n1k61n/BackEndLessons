package org.example;


import java.util.Scanner;

/**
 * Task 1 – “Online Mağaza Sistemi” (Inheritance + Polymorphism + ArrayList + Override)
 * Təsvir:
 * Bir onlayn mağazada 3 növ məhsul satılır: Book, Clothing, Electronic.
 * Hər məhsul Product sinfindən miras alır və qiymət hesablaması fərqlidir.
 * Tələblər:
 * •	Product: name, basePrice, calculatePrice(), showInfo()
 * •	Book: əlavə sahə → author, discountPercent
 * o	calculatePrice → basePrice * (1 - discountPercent/100)
 * •	Clothing: əlavə sahə → size, season
 * o	calculatePrice → Əgər season = "Winter" → +10%, əks halda eyni
 * •	Electronic: əlavə sahə → warrantyYears
 * o	calculatePrice → basePrice + warrantyYears * 70
 * •	Store sinfi → ArrayList<Product> saxlayır, addProduct() və showAllProducts() metodları var.
 * •	Main → menyu ilə məhsul əlavə et və göstər.
 */




public class Main {
    public static void main(String[] args) {
        Store mag = new Store();
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Menyu");
            System.out.println("1. Mehsul elave et.");
            System.out.println("2. Butun mehsullari goster.");
            System.out.println("3. Cixis");
            System.out.print("Secim edin: ");
            try {
                int choice = Integer.parseInt(scanner.next());
                switch (choice) {
                    case 1 -> mag.addProduct();
                    case 2 -> mag.showAllProducts();
                    case 3 -> {
                        System.out.println("Programm bitdi.");
                        return;
                    }
                }

            }catch (Exception e)
            {
                System.out.println(e.getMessage());
            }
        }


    }
}