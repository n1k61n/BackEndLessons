package org.example.vehicle;

public class Car extends Vehicle {


    public Car(String brand, String model, String plateNumber) {
        super(brand, model, plateNumber);
    }

    @Override
    public double calculateFee() {
        return super.calculateFee() * 2;
    }
}
