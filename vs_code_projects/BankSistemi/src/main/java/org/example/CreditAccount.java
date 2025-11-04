package org.example;

public class CreditAccount extends BankAccount {
    private static final double OVERDRAFT = 500.0;


    public CreditAccount(String ownerName) {
        super(ownerName);
    }


    @Override
    public void withdraw(double amount) {
        if (balance + OVERDRAFT < amount) {
            throw new IllegalArgumentException("Balansda kifaet qeder vesait yoxdur.");
        }
        balance -= amount;
    }
}
