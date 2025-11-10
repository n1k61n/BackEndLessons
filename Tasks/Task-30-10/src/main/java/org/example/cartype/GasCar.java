package org.example.cartype;

import org.example.Car;
import org.example.CarType;
import org.example.interfaces.Refuelable;

/**
 * GasCar
 * Sahələr:
 * double fuelLiters, double tankCapacityLiters
 * double fuelConsumptionPer100Km (L/100km)
 * Xüsusi:
 * refuel(double liters) (kapasite limiti)
 * hasEnoughEnergyFor(km) → lazımi litr hesabla
 * consumeFor(km) → yanacaqdan çıx
 */

public class GasCar extends Car implements Refuelable {
    private double fuelLiters;
    private final double tankCapacityLiters;
    private final double fuelConsumptionPer100Km; //(L/100km)

    public GasCar(String brand, String model, int year, double tankCapacityLiters, double fuelConsumptionPer100Km) {
        super(brand, model, year);
        this.fuelLiters = tankCapacityLiters;
        this.tankCapacityLiters = tankCapacityLiters;
        this.fuelConsumptionPer100Km = fuelConsumptionPer100Km;
        this.carType = CarType.GAS;
    }

    public double refuel(double fuel) {
        if(carType == CarType.GAS) {
            if (fuel + this.fuelLiters <= tankCapacityLiters)
                this.fuelLiters += fuel;
            else
                System.out.println("Bak ancaq " + (tankCapacityLiters - this.fuelLiters));
        }
        else
            System.out.println("Masina ancaq benzin vurmaq olar!");

        return fuel;
    }

    @Override
    protected boolean hasEnoughEnergyFor(double km) {
        return (fuelLiters * fuelConsumptionPer100Km) >= km;
    }

    @Override
    protected void consumer(double km) {
        fuelLiters -= km / fuelConsumptionPer100Km ;
    }

    @Override
    public void drive(double km) {
        if(isRunning && hasEnoughEnergyFor(km)){
            consumer(km);
            odometerKm += km;
        }
        else if(!hasEnoughEnergyFor(km)) {
            System.out.println("Kifayet qeder yanacaq yoxdur.");
        }
        else System.out.println("Masin islek veziyetde deyil!");
    }

    @Override
    public String toString() {
        String info = super.toString() + "Yanacaq: %.2f. Mesafe: %.2f.\n";
        return String.format(info, id, brand, model, year, fuelLiters, odometerKm);
    }


}
