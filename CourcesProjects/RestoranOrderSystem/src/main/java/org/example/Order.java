package org.example;

import org.example.items.Drinkitem;
import org.example.items.FoodItem;
import org.example.items.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class Order {
    List<MenuItem> orders = new ArrayList<>();
    
    public void addItem(String name,double price, boolean isVegeterian){
       orders.add(new FoodItem(name,price, isVegeterian));
    }
    
    public void addItem(String name,double price, String size){
       orders.add(new Drinkitem(name, price, size));
    }
    
    public double calculateTotal(){
        double total = 0;
        for (MenuItem order : orders){
            total += order.calculatePrice();
        }
        return  total;
    }
    
    public void showOrder(){
        orders.forEach(order -> System.out.println(order));

    }
        
}
