package org.example;

/*
Car adlı class yaz:
•	Sahələr: brand, model, speed
•	Metodlar:
o	setSpeed(double speed) → sürət mənfi ola bilməz
o	accelerate(double amount) → sürəti artır
o	brake(double amount) → sürəti azaldır (0-dan aşağı düşməsin)
o	getInfo() → məlumatı çap et

 */
public class Car {
    private String brand;
    private String model;
    private double speed;

    public Car(String brand, String model, int speed) {
        this.brand = brand;
        this.model = model;
        this.speed = setSpeed(speed);
    }

    public double setSpeed(double amount) {
        if (amount < 0) {
            System.out.println("Sürət mənfi ola bilməz");
        } else {
            speed += amount;
        }
        return speed;
    }

    public void accelerate(double amount){
        speed += amount;
    }

    public void brake(double amount){
        if(speed >= amount)
            speed -= amount;
        else
            System.out.println("sürəti 0-dan aşağı düşməsin");
    }

    public void getInfo(){
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "brand = " + brand + ", model = " + model + ", speed = " + speed;
    }
}
