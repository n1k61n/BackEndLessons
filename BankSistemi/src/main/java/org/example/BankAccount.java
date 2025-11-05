package org.example;

public abstract class BankAccount {
    protected String ownerName;
    protected double balance;

    public BankAccount(String ownerName) {
        this.ownerName = ownerName;
    }

    public void deposit(double balance) {
        if (balance > 0) {
            this.balance += balance;
            System.out.println("Balans ugurla artirildi.");
        }
        else
            System.out.println("Balans sifir ve ya menfi ola bilmez.");
    }

    public void withdraw(double amount){
        if (amount > balance) {
            throw new NegativeBalaceException("Balansda kifayet qeder vesait yoxdur.");
        }
        balance -= amount;
    }


    public void showBalance() {
        System.out.println("Hesab - " + ownerName + ", balans - " + balance + " AZN.");
    }
}
