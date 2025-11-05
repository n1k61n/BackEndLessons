package org.example;

public abstract class Vehicle{
    protected String model;
    protected double fuel;
    protected double speed;
    private double maxSpeed;

    public Vehicle(String model, double fuel, double speed, double maxSpeed) {
        this.model = model;
        this.fuel = fuel;
        this.speed = speed;
        this.maxSpeed = maxSpeed;
    }

    public abstract void refuel(double amount);

    public void showInfo(){
        System.out.println("model= " + model + ", fuel= " + fuel +", speed= " + speed + ", maxSpeed= " + maxSpeed);
    }

}


