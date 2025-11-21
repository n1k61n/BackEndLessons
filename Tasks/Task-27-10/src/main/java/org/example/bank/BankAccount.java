package org.example.bank;

import org.example.Info;

public class BankAccount implements Info {
    private static int idCounter;
    private int id;
    private String ownerName;
    private double balance;
    private AccountType type;



    public BankAccount(String ownerName, double balance, AccountType type) {
        this.id = ++idCounter;
        this.ownerName = ownerName;
        this.balance = balance;
        this.type = type;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void deposit(double amount){
        this.balance += amount;
    }

    public void withdraw(double amount){
        if (this.balance >= amount )
            this.balance -= amount;
        else
            System.out.println("Balansda kifayet qeder vesait yoxdur.");
    }

    private String getInfoString() {
        return "ID: " + this.id +  " Name " + ownerName + ". Balance " + balance + " AZN." + " Type: " + type;
    }


    public String toString(){
        return getInfoString();
    }


    @Override
    public void showInfo() {
        System.out.println(getInfoString());
    }
}
