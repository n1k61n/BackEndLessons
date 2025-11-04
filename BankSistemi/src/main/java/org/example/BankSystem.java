package org.example;


import java.util.Scanner;

class BankSystem {
    static boolean isBankAccount = false;

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        BankAccount ba = null;
        String choice;
        while (true) {
            System.out.println("Bank sistemi");
            System.out.println("1. Hesab yarat.");
            System.out.println("2. Yatir.");
            System.out.println("3. Cixar.");
            System.out.println("4. Balansi goster.");
            System.out.println("5. Cixis.");
            System.out.print("Seciminizi edin:");
            choice = scanner.next();
            switch (choice) {
                case "1" ->  {
                    isBankAccount = true;
                    ba = createBankAccount(scanner, ba);
                }
                case "2" ->  deposit(ba,scanner);
                case "3" ->  withDraw(ba,scanner);
                case "4"  -> {
                    if(ba != null) {
                        ba.showBalance();
                    }else System.out.println("Hesab yaratmamisan.");
                }
                case "5" -> {
                    System.out.println("Program bitdi");
                    return;
                }
                default -> System.out.println("Sehv secim etmisiniz");
            }
        }
    }

    static void withDraw(BankAccount ba, Scanner scanner) throws Exception {
        if(isBankAccount) {
            System.out.print("Ne qeder pul cixartmaq isteyirsiniz: ");
            double amount = Double.parseDouble(scanner.next());
            ba.withdraw(amount);
            System.out.println("Emeliyat ugurla bitdi.");
        }
        else System.out.println("Hesab yaratmamisan.");
    }

    static void deposit(BankAccount ba, Scanner scanner) {
        if(isBankAccount) {
            System.out.print("Neqeder balansa vesait qoymaq isteyirsiniz: ");
            double amount = Double.parseDouble(scanner.next());
            ba.deposit(amount);
            System.out.println("Balans artirildi.");
        }
        else System.out.println("Hesab yaratmamisan.");
    }

    static BankAccount createBankAccount(Scanner scanner, BankAccount ba) {
        System.out.print("Hansi nov hesab yaratmaq isteyirsiniz credit/yigim: ");
        String accountType = scanner.next();
        System.out.print("Adinizi daxil edin: ");
        String name = scanner.next();
        if (accountType.equalsIgnoreCase("credit")) {
            ba = new CreditAccount(name);
        } else if (accountType.equalsIgnoreCase("yigim")) {
            ba = new SavingAccount(name);
        } else
            System.out.println("Duz yazmadiniz.");
        return ba;
    }


}