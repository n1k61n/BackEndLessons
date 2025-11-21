package org.example;

public class Car extends Vehicle implements Drivable{
    private final static double CONSUMPTION = 10;
    private boolean engine;

    public Car(String model, double fuel, double speed, double maxSpeed) {
        super(model, fuel, speed, maxSpeed);
        engine = false;
    }


    @Override
    public void refuel(double amount) {
        fuel += amount;
    }

    @Override
    public void start() {
        if(!engine){
            engine = true;
            System.out.println("Masin ise dusdu.");
        }
        else
            System.out.println("Masin artiq isleyir.");
    }

    @Override
    public void stop() {
        if(engine){
            engine = false;
            System.out.println("Masin dayandi.");
        }
        else
            System.out.println("Masin artiq dayanib.");
    }

    @Override
    public void drive(double distance) throws NotEnoughFuelEXCEPTION {
        if(distance / CONSUMPTION > fuel) {
            throw new NotEnoughFuelEXCEPTION("Yanacaq kifayət etmir!");
        }
        start();
        fuel -= distance / CONSUMPTION;
        stop();
    }
}

