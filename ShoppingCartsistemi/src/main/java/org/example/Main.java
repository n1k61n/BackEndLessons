package org.example;


import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        Cart cart = new Cart();
        int choice;
        do {
            System.out.println("\n===== SHOPPING CART SYSTEM =====");
            System.out.println("1. Mehsul elave et.");
            System.out.println("2. Mehsulu sil.");
            System.out.println("3. Unumi qiymeti cixar.");
            System.out.println("4. Siyahini goster.");
            System.out.println("5. Cixis");
            System.out.print("Seçiminiz: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 1 -> cart.addProduct(scanner);
                case 2-> cart.removeProduct(scanner);
                case 3 -> cart.calculateTotal();
                case 4 -> cart.showAllProducts();
                case 5-> System.out.println("Programdan bitdi!");
                default -> System.out.println("Yalnis secim!");
            }
        }while(choice != 5);

    }
}
