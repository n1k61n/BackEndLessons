package org.example;

public class ElectricCar extends Car{

    public ElectricCar(String brand, String model, int year, double fuel, double battery) {
        super(brand, model, year, fuel, battery);
    }

    @Override
    protected boolean hasEnoughEnergyFor(double km) {

        return false;
    }
}
