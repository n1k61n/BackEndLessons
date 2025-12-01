package com.example.store;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class OrderService {

    private PaymentServicxe paymentService;

    public OrderService() {

    }

    @Autowired
    public void setPaymentService(PaymentServicxe paymentService) {
        this.paymentService = paymentService;
    }

    public void placeOrder(){
        paymentService.processPayment(10.0);
    }
}
