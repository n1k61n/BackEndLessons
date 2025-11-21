package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bank {
    List<Account> accounts = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);


    public  void createAccount(){
        System.out.print("Adi qeyd edin: ");
        String name = scanner.next();
        System.out.print("Neqeder balansa vesait qoymaq istyirsiniz: ");
        double balance = Double.parseDouble(scanner.next());
        accounts.add(new Account(name, balance));
        System.out.println("Hesab yaradildi.");
    }

    public  void showBalance(Account account){
        if(account != null)
            System.out.printf("Balans - %s AZN\n", account.getBalance());
        else
            System.out.println("Bela hesab yoxdur.");

    }

    public void addBalance(Account account) {
        System.out.print("Neqeder balansa vesait qoymaq istyirsiniz: ");
        double money = Double.parseDouble(scanner.next());
        if(account != null){
            account.setBalance(money);
            System.out.println("Balance artirildi.");
        }
        else System.out.println("Bela hesab yoxdur.");

    }

    public void sendMoney(Account account){
        System.out.print("Kime gondereceyin adini  qeyd edin:");
        String sendName = scanner.next();
        Account sendAccount = findAccountByName(sendName);
        System.out.print("Ne qeder pul gonereceysiniz: ");
        double money = Double.parseDouble(scanner.next());
        if(account.getBalance() >= money){
            sendAccount.setBalance(money);
            System.out.println("Pul ugurla kocuruldu.");
            account.setBalance(-money);
        }
    }

    public void showAccountsInfo(){
        if(accounts.isEmpty()) {
            System.out.println("Hesablar yoxdur");
        }
        else{
            System.out.println("-----------Hesablar------------");
            accounts.forEach(account -> System.out.println(account));
        }
    }

    public Account selectAccount(){
        System.out.print("Hesaba daxil olun: ");
        String accountName = scanner.next();
        return findAccountByName(accountName);
    }

    private Account findAccountByName(String name){
        Account find = null;
        for(Account account: accounts){
            if(account.getName().equalsIgnoreCase(name)) {
                find = account;
                break;
            }
        }
        return find;
    }
}
