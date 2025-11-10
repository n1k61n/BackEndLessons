package org.example.bank;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Bank {
    List<BankAccount> bankAccounts = new ArrayList<>();


    public void addBankAccount(BankAccount bankAccount){
        bankAccounts.add(bankAccount);

    }


    public  void addDeposit(String name, double amount){
        for (BankAccount bankAccount : bankAccounts) {
            if (bankAccount.getOwnerName().equalsIgnoreCase(name)){
                bankAccount.deposit(amount);
            }
        }
    }

    public  void withDrawDeposit(String name, double amount){
        Iterator<BankAccount> iterator = bankAccounts.iterator();
        while(iterator.hasNext()){
            BankAccount account = iterator.next();
            if(account.getOwnerName().equalsIgnoreCase(name)){
                account.withdraw(amount);
                break;
            }
        }
    }




    public void showAllBankAccounts(){
        bankAccounts.forEach(bankAccount -> System.out.println(bankAccount));
    }
}
