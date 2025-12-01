package com.example.store;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class PayPalPaymentService implements PaymentServicxe{
    @Override
    public void processPayment(double amount) {
        System.out.println("PAYPAL");
        System.out.println("Amount: " + amount + " processed using Stripe.");
    }
}
