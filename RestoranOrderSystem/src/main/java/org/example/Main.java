package org.example;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Order order = new Order();
        int choice;

        do {
            System.out.println("---------------------------");
            System.out.println("Restoran Sifariş Sistemi");
            System.out.println("1. Yemek Sifaris et.");
            System.out.println("2. Icki Sifarisi et.");
            System.out.println("3. Sifarisi goster.");
            System.out.println("4. Qiymeti hesabla.");
            System.out.println("5. Cix.");
            System.out.println("---------------------------");
            choice  = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 1 ->{
                    System.out.println("---------Yemek Menu----------");
                    System.out.println("Dolma - 5");
                    System.out.println("Xengel - 8");
                    System.out.println("Aş - 12");
                    System.out.println("Kabab - 14");
                    System.out.println("Pelmen - 4");
                    System.out.println("---------------------------");
                    System.out.print("Yemek daxil edin: ");
                    String name = scanner.nextLine();
                    System.out.print("qiymetini yaz: ");
                    double price = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Vegetariandirmi? (yes/no): ");
                    boolean isVeg = scanner.nextLine().equalsIgnoreCase("yes");
                    order.addItem(new FoodItem(name, price, isVeg));
                }
                case 2 ->{
                    System.out.println("---------Icki Menu----------");
                    System.out.println("Fanta");
                    System.out.println("Cola");
                    System.out.println("Sprayt");
                    System.out.println("---------------------------");
                    System.out.print("Icki daxil edin: ");
                    String name = scanner.nextLine();
                    System.out.print("Əsas qiymət: ");
                    double drinkPrice = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Ölçü (small/medium/large): ");
                    String size = scanner.nextLine();
                    scanner.nextLine();
                    order.addItem(new DrinkItem(name, drinkPrice, size));
                }
                case 3 -> {
                    System.out.println("Sifaris verilen yemekler...");
                    order.showOders();
                }
                case 4 -> {
                    double totalPrice = order.calculateTotal();
                    System.out.println("Cemi mebleg: " + totalPrice);
                }
                case 5 -> {
                    System.out.println("Program cixilir...");
                }
            }
        }while(choice != 5);

    }
}