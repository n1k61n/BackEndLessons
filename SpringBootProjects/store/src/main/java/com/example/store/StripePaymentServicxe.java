package com.example.store;

public class StripePaymentServicxe implements PaymentServicxe {
    @Override
    public void processPayment(double amount){
        System.out.println("Stripe");
        System.out.println("Amount: " + amount + " processed using Stripe.");
    }


}
