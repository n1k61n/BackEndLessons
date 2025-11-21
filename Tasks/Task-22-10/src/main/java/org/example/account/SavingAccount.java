package org.example.account;

public class SavingAccount extends Account{
    public SavingAccount(double balance) {
        super(balance);
    }

    @Override
    public double calculateInterest() {
        return super.balance * 0.05;
    }
}
