package org.example;

public class SavingAccount extends BankAccount {
    private static final double RATE = 0.05;

    public SavingAccount(String ownerName) {
        super(ownerName);
    }

    public void addInterest() {
        balance += balance * RATE;
    }


}
