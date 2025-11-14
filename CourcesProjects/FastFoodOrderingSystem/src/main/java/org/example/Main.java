package org.example;


//🍔 4. Fast Food Ordering System
//Mövzu: class, encapsulation, switch-case
//Təsvir:
//Siniflər:
//MenuItem (ad, qiymət)
//Order (sifariş siyahısı və ümumi məbləğ)
//Menyu:
// 1. Hamburger - 5 AZN
//2. Pizza - 8 AZN
//3. Cola - 2 AZN
//4. Hesabı göstər
//5. Çıxış
//İstifadəçi switch-case ilə menyudan seçim edir, sifariş ArrayList<MenuItem>-ə əlavə olunur.
//📘 OOP prinsipi: Object composition
//📘 Yeni anlayış: Real-life modeling


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static void main() {
        boolean exit = true;
        Scanner scanner = new Scanner(System.in);
        Order order = new Order();
        int choice;
        while(exit){
            printMenu();
            choice = scanner.nextInt();
            switch (choice){
                case 1:
                    order.addOrder(new MenuItem("Hamburger", 5));
                    break;
                case 2:
                    order.addOrder(new MenuItem("Pizza", 8));
                    break;
                case 3:
                    order.addOrder(new MenuItem("Cola", 2));
                    break;
                case 4:
                    printBill(order.orders);
                    break;
                case 5:
                    exit = false;
                    break;
                default:
                    System.out.println("Duz secim etmemisiniz.");

            }

        }

    }

    static void printBill(List<MenuItem> menuItems){
        int total = 0;
        for(MenuItem menuItem : menuItems){
            System.out.println(menuItem.item + " " + menuItem.price);
            total += menuItem.price;
        }
        System.out.println("Total price: " + total);
    }

    static void printMenu(){
        System.out.println("Seciminizi edin.");
        System.out.println("Menyu:");
        System.out.println("1. Hamburger - 5 AZN");
        System.out.println("2. Pizza - 8 AZN");
        System.out.println("3. Cola - 2 AZN");
        System.out.println("4. Hesabı göstər");
        System.out.println("5. Çıxış");
    }
}
