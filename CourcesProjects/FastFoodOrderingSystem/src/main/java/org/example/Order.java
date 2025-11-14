package org.example;

import java.util.ArrayList;
import java.util.List;

public class Order {
    List<MenuItem> orders = new ArrayList<>();
    private int bill;



    public void addOrder(MenuItem order){
        orders.add(order);
        this.bill += order.price;
    }

    public int getBill() {
        return bill;
    }

}
