package org.example.vehicle;

public class Truck extends Vehicle {


    public Truck(String brand, String model, String plateNumber) {
        super(brand, model, plateNumber);
    }

    @Override
    public double calculateFee() {
        return super.calculateFee() * 3;
    }
}
