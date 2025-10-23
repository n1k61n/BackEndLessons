package org.example.payment;

public class CashPayment extends Payment{
    @Override
    public void pay() {
        System.out.println("Cash pay");;
    }
}
