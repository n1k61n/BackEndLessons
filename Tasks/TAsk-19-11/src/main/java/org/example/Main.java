package org.example;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        User user = new User("Orxan", "orxan@gmail.com", "12345");
//        user.setPassword();
//        System.out.println(user);
//        Smartphone iphone = new Smartphone("Iphone", 2000);
//        DataContainer<Integer> dataInt = new DataContainer<>();
//        dataInt.setData(5);
//        DataContainer<Double> dataOub = new DataContainer<>();
//        dataOub.setData(2.3);
//
//        System.out.println(dataOub);
//        System.out.println(dataInt);

//        Smartphone samsung = new Smartphone("Samsung", 1599);
//        samsung.setBasePrice(samsung.calculatePrice());
//        System.out.println(samsung);

//        SMSNotification sms = (SMSNotification) NotificationFactory.getNotification("SMS");
//        EmailNotification emailNotification = (EmailNotification) NotificationFactory.getNotification(("EMAIL"));

        List<Book> books = new ArrayList<>();
        books.add(new Book("Java", 300));
        books.add(new Book("Python", 200));
        books.add(new Book("C++", 100));

        System.out.println(books.toString());
        Collections.sort(books);
        System.out.println(books.toString());
    }
}

