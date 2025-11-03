package org.example;

import java.util.ArrayList;

//Order: ArrayList<MenuItem> saxlayır, addItem(), calculateTotal(), showOrder().
public class Order {
    ArrayList<MenuItem> menuItems;

    public Order() {
        this.menuItems = new ArrayList<>();
    }

    public void addItem(MenuItem item){
        menuItems.add(item);
    }

    public double calculateTotal(){
        double total = 0;
        for(MenuItem item: menuItems){
            total += item.calculatePrice();
        }
        return total;
    }

    public void showOders(){
        menuItems.forEach(System.out::println);
    }

}
