package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bank manager = new Bank();
        Scanner scanner = new Scanner(System.in);

        int choice;
        while(true){
            System.out.println("\nBizim banka xos gelmisiniz.");
            System.out.println("1. Hesab yaratmaq.");
            System.out.println("2. Hesabi secin.");
            System.out.println("3. Butun hesablari goster.");
            System.out.println("4. Cixis");
            System.out.print("Seciminizi edin: ");

            choice = Integer.parseInt(scanner.next());

            switch (choice){
                case 1 -> manager.createAccount();
                case 2 -> {
                    Account selected = manager.selectAccount();
                    boolean exit = false;
                    do {
                        System.out.println("1. Balansa baxmaq.");
                        System.out.println("2. Balansa pul elave etmek.");
                        System.out.println("3. Basqa karta pul kocurtmek.");
                        System.out.println("4. Hesaban cix.");
                        System.out.print("Secim edin: ");
                        int select = Integer.parseInt(scanner.next());
                        switch (select) {
                            case 1 -> manager.showBalance(selected);
                            case 2 -> manager.addBalance(selected);
                            case 3 -> manager.sendMoney(selected);
                            case 4 -> {
                                System.out.println("Hesabdan cixdi.");
                                exit = true;
                            }
                            default -> System.out.println("Sehv secim etmisiniz.");
                        }
                    }while(!exit);
                }
                case 3 -> manager.showAccountsInfo();
                case 4 -> {
                    System.out.println("Programm baglandi.");
                    return;
                }
                default -> System.out.println("Sehv secim etmisiniz.");
            }
        }
    }

}