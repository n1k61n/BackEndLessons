package org.example;

public class MenuItem {
    String item;
    int price;

    public MenuItem(String item, int price) {
        this.item = item;
        this.price = price;
    }

    public String menuItemInfo(){
        return this.item + " " + this.price;
    }
}
