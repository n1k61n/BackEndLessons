package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Order order = new Order();
        Scanner scanner  = new Scanner(System.in);
        String choice;
        do{
            System.out.println("\nRestoran Sifaris Menu");
            System.out.println("1. Yemek Sifaris.");
            System.out.println("2. Icki sifaris.");
            System.out.println("3. Sifaris goster.");
            System.out.println("4. Hesabi goster.");
            System.out.println("5. Cix.");
            System.out.print("Secim edin: ");
            choice  = scanner.next();
            switch (choice){
                case "1" -> foodOrder(scanner, order);
                case "2" -> drinkOrder(scanner, order);
                case "3" -> showOrder(order);
                case "4" -> System.out.println("Cemi qiymet: " + order.calculateTotal());
                case "5" -> System.out.println("Programdan cixis.");
                default  -> System.out.println("Sehv secim etmisiniz.");
            }
        }while(!choice.equals("5"));
    }




    static void showOrder(Order order){
        System.out.println("-".repeat(20));
        System.out.println("Sifarisleriniz: ");
        order.showOrder();
        System.out.println("-".repeat(20));
    }
    static void drinkOrder(Scanner scanner, Order order){
        System.out.print("Icki adi: ");
        String nameDrink = scanner.next();
        System.out.print("Qiymeti: ");
        double priceDrink = Double.parseDouble(scanner.next());
        System.out.print("Olcusu small/medium/large: ");
        String size = scanner.next();
        order.addItem(nameDrink, priceDrink, size);
    }


    static void foodOrder(Scanner scanner, Order order) throws NumberFormatException {
        System.out.print("Yemek  adi: ");
        String nameFood = scanner.next();
        System.out.print("Qiymeti: ");
        double priceFood = Double.parseDouble(scanner.next());
        System.out.print("Vegeterian yemeyidi yes/no: ");
        String yesNo = scanner.next();
        order.addItem(nameFood, priceFood, yesNo.equalsIgnoreCase("yes") ? true : false);

    }
}

