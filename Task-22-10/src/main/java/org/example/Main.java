package org.example;


import org.example.account.Account;
import org.example.account.CheckingAccount;
import org.example.account.FixedDepositAccount;
import org.example.account.SavingAccount;
import org.example.animal.Bird;
import org.example.animal.Cat;
import org.example.animal.Dog;
import org.example.payment.CashPayment;
import org.example.payment.CreditCardPayment;
import org.example.payment.PaypalPayment;
import org.example.shapes.Circle;
import org.example.shapes.Rectangle;
import org.example.shapes.Triangle;

import java.util.AbstractCollection;

public class Main {
    public static void main(String[] args) {
//
//        Bicycle bicycle = new Bicycle();
//        bicycle.move();
//        Plane plane = new Plane();
//        plane.move();
//        Car car = new Car();
//        car.move();
//        CreditCardPayment ccp = new CreditCardPayment();
//        ccp.pay();
//        PaypalPayment pp = new PaypalPayment();
//        pp.pay();
//        CashPayment cash = new CashPayment();
//        cash.pay();
//        Circle circle = new Circle();
//        circle.setRadius(5);
//        System.out.println("Dairenin sahesi " + circle.area());
//        Rectangle rec = new Rectangle(3, 4);
//        System.out.println("Duzbucaqin sahesi "+ rec.area());
//        Triangle triangle = new Triangle();
//        triangle.setHeight(6);
//        triangle.setWidth(8);
//        System.out.println("Ucbucaqin sahesi " + triangle.area());
//        Dog dog = new Dog();
//        dog.makeSound();
//        Cat cat = new Cat();
//        cat.makeSound();
//        cat.play();
//        dog.play();
//        Bird bird = new Bird();
//        bird.play();
        Account[] accounts = new Account[3];
        accounts[0] = new SavingAccount(1000);
        accounts[1] = new CheckingAccount(2000);
        accounts[2] = new FixedDepositAccount(3000);

        for (Account account : accounts){
            account.displayInterest();
        }

    }
}

