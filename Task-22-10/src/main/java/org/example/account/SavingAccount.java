package org.example.account;

public class SavingAccount extends Account{

    public SavingAccount(double balance) {
        super(balance);
    }

    @Override
    public double calculateInterest() {
        return balance * 0.05;
    }
}
