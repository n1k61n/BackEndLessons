package org.example;

public class CreditAccount extends BankAccount {
    private static final double overdraft = 500.0;


    public CreditAccount(String ownerName) {
        super(ownerName);
    }


    @Override
    public void withdraw(double amount) {
        if (balance + overdraft < amount) {
            throw new IllegalArgumentException("Balansda kifaet qeder vesait yoxdur.");
        }
        balance -= amount;
    }
}
