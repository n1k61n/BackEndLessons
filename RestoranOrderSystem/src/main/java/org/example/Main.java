package org.example;

import java.util.Scanner;

/**
 🔹 Task 4 –“Restoran Sifariş Sistemi”  (Aggregation + Polymorphism + Enum + ArrayList)
 Təsvir:
 Restoranda menyuda müxtəlif növ yeməklər və içkilər var.
 Tələblər:
 • enum ItemType { FOOD, DRINK }
 • abstract class MenuItem: name, basePrice, abstract calculatePrice()
 • FoodItem: əlavə sahə → isVegetarian → əgər vegetarian isə 5% ucuz.
 • DrinkItem: əlavə sahə → size (small, medium, large)
 o small → +0, medium → +1, large → +2 AZN
 • Order: ArrayList<MenuItem> saxlayır, addItem(), calculateTotal(), showOrder().
 • Main → menyu ilə yeməkləri və içkiləri əlavə et, sonra ümumi məbləği göstər. */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Order order = new Order();
        int choice = -1;

        do {
            System.out.println("Restoran Sifariş Sistemi");
            System.out.println("1. Sifaris et.");
            System.out.println("2. Sifarisi goster.");
            System.out.println("3. Qiymeti hesabla.");
            System.out.println("0. Cix.");
            System.out.println("---------------------------");
            choice  = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 1 ->{
                    System.out.println("-----------Menu------------");
                    System.out.println("Dolma - 5");
                    System.out.println("Xengel - 10");
                    System.out.println("Aş - 15");
                    System.out.println("Fanta");
                    System.out.println("Cola");
                    System.out.println("---------------------------");
                    System.out.print("Yemek yoxsa ickinin  daxil edin: ");
                    String name = scanner.nextLine();
                    System.out.print("qiymetini yaz: ");
                    double price = scanner.nextDouble();
                    order.addItem(new FoodItem(name, price, ItemType.FOOD));
                }
                case 2 -> {
                    System.out.println("Sifaris verilen yemekler...");
                    order.showOders();
                }
                case 3 -> {
                    double totalPrice = order.calculateTotal();
                    System.out.println("Cemi mebleg: " + totalPrice);
                }
                case 0 -> {
                    System.out.println("Program cixilir...");
                }
            }
        }while(choice != 0);

    }
}