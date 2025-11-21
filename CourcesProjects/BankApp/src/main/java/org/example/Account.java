package org.example;

public class Account {
    private final String name;
    private double balance;
    private final long cartNumber;


    public Account(String name, double balance) {
        this.name = name;
        this.balance = balance;
        this.cartNumber = (long) (Math.random() * 10000000000000000L);
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance += balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", balance=" + balance +
                ", cartNumber=" + cartNumber +
                '}';
    }
}
