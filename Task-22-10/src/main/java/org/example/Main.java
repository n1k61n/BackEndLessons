package org.example;


import org.example.account.CheckingAccount;
import org.example.account.FixedDepositAccount;
import org.example.account.SavingAccount;

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

        double balance = 2000;
        SavingAccount savingAccount = new SavingAccount(balance);
        CheckingAccount checkingAccount = new CheckingAccount(balance);
        FixedDepositAccount fixedDepositAccount = new FixedDepositAccount(balance);

        System.out.println(savingAccount.calculateInterest());
        System.out.println(checkingAccount.calculateInterest());
        System.out.println(fixedDepositAccount.calculateInterest());

    }
}

