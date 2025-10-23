package org.example.account;

public  class Account {
    protected double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public  double calculateInterest(){
        return 0;
    }

    public void displayInterest(){
        System.out.println("Faiz: " + calculateInterest());
    }
}
