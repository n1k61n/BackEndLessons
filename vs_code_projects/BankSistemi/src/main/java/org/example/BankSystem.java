package org.example;


import java.util.Scanner;

class BankSystem {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        BankAccount ba = null;
        while (true) {
            System.out.println("Bank sistemi");
            System.out.println("1. Hesab yarat.");
            System.out.println("2. Yatir.");
            System.out.println("3. Cixar.");
            System.out.println("4. Balansi goster.");
            System.out.println("5. Cixis.");
            System.out.print("Seciminizi edin:");
            int choice = Integer.parseInt(scanner.next());
            switch (choice) {
                case 1:
                    ba = createBankAccount();
                    break;
                case 2:
                    deposit(ba);
                    break;
                case 3:
                    withDraw(ba);
                    break;
                case 4:
                    ba.showBalance();
                    break;
                case 5:
                    System.out.println("Program bitdi");
                    return;
                default:
                    System.out.println("Sehv secim etmisiniz");
            }

        }

    }

    static void withDraw(BankAccount ba) throws Exception {
        System.out.print("Ne qeder pul cixartmaq isteyirsiniz: ");
        double amount = Double.parseDouble(scanner.next());
        ba.withdraw(amount);
        System.out.println("Emeliyat ugurla bitdi.");
    }

    static void deposit(BankAccount ba) {
        System.out.print("Neqeder balansa vesait qoymaq isteyirsiniz: ");
        double amount = Double.parseDouble(scanner.next());
        ba.deposit(amount);
        System.out.println("Balans artirildi.");
    }

    static BankAccount createBankAccount() {
        BankAccount ba = null;
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