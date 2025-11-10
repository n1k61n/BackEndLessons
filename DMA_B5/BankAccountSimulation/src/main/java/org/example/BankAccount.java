package org.example;


public class BankAccount {
    private String ownerName;
    private double balance;


    public BankAccount(String ownerName) {
        this.ownerName = ownerName;
    }

    public BankAccount(String ownerName, double balance) {
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public boolean deposit(double amount){
        if(amount > 0){
            this.balance += amount;
            return true;
        }
        return false;
    }

    public boolean withdraw(double amount){
        if(this.balance >= amount){
            this.balance -= amount;
            return true;
        }
        return false;
    }

    public String showBalance(){
        return this.ownerName + " bey " + this.balance + " manat var";
    }

}
