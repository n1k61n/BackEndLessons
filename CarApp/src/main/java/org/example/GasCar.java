package org.example;


public class GasCar extends Car implements Refuelable {
    private double fuelLiters;
    private double tankCapacityLiters;
    private double fuelConsumptionPer100Km;

    public GasCar(String brand, String model, int year, SensorSuite sensors,
                  double tankCapacityLiters, double fuelConsumptionPer100Km) {
        super(brand, model, year, sensors);
        this.tankCapacityLiters = tankCapacityLiters;
        this.fuelConsumptionPer100Km = fuelConsumptionPer100Km;
        this.fuelLiters = tankCapacityLiters * 0.5; // yarı dolu
    }

    @Override
    public boolean hasEnoughEnergyFor(double km) {
        double needed = km * fuelConsumptionPer100Km / 100;
        return fuelLiters >= needed;
    }

    @Override
    protected void consumeFor(double km) {
        double used = km * fuelConsumptionPer100Km / 100;
        fuelLiters -= used;
    }

    @Override
    public void refuel(double liters) {
        if (liters <= 0) throw new IllegalOperationException("Invalid refuel amount.");
        if (fuelLiters + liters > tankCapacityLiters)
            throw new IllegalOperationException("Tank overflow!");
        fuelLiters += liters;
        System.out.println("Refueled " + liters + " L. Current: " + fuelLiters + " L.");
    }

    @Override
    public String toString() {
        return super.toString() + " | Fuel: " + fuelLiters + "L";
    }
}
