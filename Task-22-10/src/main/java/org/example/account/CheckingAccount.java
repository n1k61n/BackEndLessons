package org.example.account;

public class CheckingAccount extends Account{
    public CheckingAccount(double balance) {
        super(balance);

    }

    @Override
    public double calculateInterest() {
        return super.balance * 0.02;
    }

}
