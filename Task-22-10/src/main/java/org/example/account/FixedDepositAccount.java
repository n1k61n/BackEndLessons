package org.example.account;

public class FixedDepositAccount extends Account{
    public FixedDepositAccount(double balance) {
        super(balance);
    }

    @Override
    public double calculateInterest() {
        return balance * 0.1;
    }
}
