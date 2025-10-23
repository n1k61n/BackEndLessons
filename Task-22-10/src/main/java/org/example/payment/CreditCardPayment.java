package org.example.payment;

public class CreditCardPayment extends Payment{
    @Override
    public void pay() {
        System.out.println("credit card pay");;
    }
}
