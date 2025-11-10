package org.example;

public class Order{
    private static  int idCounter;
    private  int id;
    private String customerName;
    private OrderStatus status;

    public Order(String customerName, OrderStatus status) {
        this.id = ++idCounter;
        this.customerName = customerName;
        this.status = status;
    }

    public void updateStatus(OrderStatus newStatus){
        this.status = newStatus;
    }
    public void printStatus(){
        System.out.println(this.status);
    }

    public String toString(){
        return String.format("Order #%d\t Name: %s \tstatus to %s",id, customerName, status);
    }

}
