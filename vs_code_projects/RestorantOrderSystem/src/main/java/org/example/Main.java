package org.example;


import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
*  Task 4 – “Restoran Sifariş Sistemi” (Aggregation + Polymorphism + Enum +
* ArrayList)
* Təsvir:
* Restoranda menyuda müxtəlif növ yeməklər və içkilər var.
* Tələblər:
*  enum ItemType { FOOD, DRINK }
*  abstract class MenuItem: name, basePrice, abstract calculatePrice()
*  FoodItem: əlavə sahə → isVegetarian → əgər vegetarian isə 5% ucuz.
*  DrinkItem: əlavə sahə → size (small, medium, large)
* o small → +0, medium → +1, large → +2 AZN
*  Order: ArrayList<MenuItem> saxlayır, addItem(), calculateTotal(), showOrder().
*/

public class Main {
    public static void main(String[] args) {
        Order order = new Order();
        Scanner scanner  = new Scanner(System.in);
        String choice;
        do{
            System.out.println("Restoran Sifaris Menu");
            System.out.println("1. Yemek Sifaris.");
            System.out.println("2. Icki sifaris.");
            System.out.println("3. Sifaris goster.");
            System.out.println("4. Hesabi goster.");
            System.out.println("5. Cix.");
            System.out.print("Secim edin: ");
            choice  = scanner.next();
            switch (choice){
                case "1":
                    foodOrder(scanner, order);
                    break;
                case "2":
                    System.out.print("Icki adi: ");
                    String nameDrink = scanner.next();
                    System.out.print("Qiymeti: ");
                    double priceDrink = Double.parseDouble(scanner.next());
                    System.out.print("Olcusu small/medium/large: ");
                    String size = scanner.next();
                    order.addItem(nameDrink, priceDrink, size);
                    break;
                case "3":
                    System.out.println("-".repeat(20));
                    System.out.println("Sifarisleriniz: ");
                    order.showOrder();
                    System.out.println("-".repeat(20));
                    break;
                case "4":
                    System.out.println("-".repeat(20));
                    System.out.println("Cemi qiymet: " + order.calculateTotal());
                    System.out.println("-".repeat(20));
                    break;
                case "5":
                    System.out.println("Programdan cixis.");
                    break;
                default:
                    System.out.println("Sehv secim etmisiniz.");
            }

        }while(!choice.equals("5"));

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

