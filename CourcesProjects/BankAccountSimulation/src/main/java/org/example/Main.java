package org.example;

//Bank Account Simulation
//Mövzu: encapsulation, method, switch-case
//Təsvir:
//BankAccount sinfi: ownerName, balance
//Metodlar:
//deposit(amount)
//withdraw(amount)
//showBalance()
//Menyu:
//1. Pul yatir
//2. Pul çıxar
//3. Balansı göstər
//4. Çıxış
//Hər əməliyyat switch-case ilə seçilir.
//📘 OOP prinsipi: Encapsulation
//📘 Yeni anlayış: Validation və sadə business logic

import java.util.Scanner;

public class Main {
    static void main() {
        boolean exit = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Xos gelmisiniz bizim banka.\nAdinizi soyleyerdiniz.");
        String name = scanner.nextLine();
        BankAccount ba = new BankAccount(name);
        int choice = 0;
        double amount = 0;
        while(exit){
            printMenu(name);
            choice = scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Ne qeder pul yatirmaq isterdiniz");
                    amount = scanner.nextDouble();
                    if (ba.deposit(amount))
                        System.out.println(amount + " pul yatirildi");
                    else
                        System.out.println("Yatirilacaq mebleg musbet olmalidir");
                    break;
                case 2:
                    System.out.println("Ne qeder pul cixatrmaq isterdiniz");
                    amount = scanner.nextDouble();
                    if(ba.withdraw(amount))
                        System.out.println(amount + " azn cixildi.");
                    else
                        System.out.println("Balansda kifayet qeder pul yoxdur.");
                    break;
                case 3:
                    System.out.print("Sizin hal hazirda balansda: ");
                    System.out.println(ba.showBalance());
                    break;
                case 4:
                    exit = false;
                    break;
                default:
                    System.out.println("Secim duzgun edilmemisdi");
            }
        }

    }

    static void printMenu(String costumer){
        System.out.println(costumer +" bey buyurun seciminizi edin:");
        System.out.println("1. Pul yatir");
        System.out.println("2. Pul çıxar");
        System.out.println("3. Balansı göstər");
        System.out.println("4. Çıxış");

    }
}
