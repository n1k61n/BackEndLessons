package org.example.payment;

public class PaypalPayment extends Payment{
    @Override
    public void pay() {
        System.out.println("Paypal pay");;
    }
}
