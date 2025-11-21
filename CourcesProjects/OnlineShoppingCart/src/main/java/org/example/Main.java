package org.example;

/*
Online Shopping Cart
Mövzu: class, composition, switch-case
Təsvir:
Siniflər:
Product → name, price
Cart → ArrayList<Product> və metodlar:
addProduct()
removeProduct()
showCart()
getTotalPrice()
Menyu:
 1. Məhsul əlavə et
2. Məhsul sil
3. Səbəti göstər
4. Ümumi məbləği göstər
5. Çıxış
📘 OOP prinsipi: Composition (Cart içində Product obyektləri)
📘 Yeni anlayış: Dynamic list management, loop + switch-case*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        Cart cart = new Cart();
        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1. Məhsul əlavə et");
            System.out.println("2. Məhsul sil");
            System.out.println("3. Səbəti göstər");
            System.out.println("4. Ümumi məbləği göstər");
            System.out.println("5. Çıxış");
            System.out.print("Seciminizi edin: ");

            choice = scanner.nextInt();
            switch (choice){
                case 1 -> cart.addProduct(scanner);
                case 2 -> cart.removeProduct(scanner);
                case 3 -> cart.showCart();
                case 4 -> cart.getTotalPrice();
                case 5 ->  System.out.println("Programdan cixilir....");
                default -> System.out.println("Secim duzgun edilmeyib.");
            }
        }while (choice != 5);
    }
}
