package org.example.car;

import org.example.Info;

public class Car implements Info {
    private String brand;
    private String model;
    private double pricePerDay;
    private CarType type;

    public Car(String brand, String model, double pricePerDay, CarType type) {
        this.brand = brand;
        this.model = model;
        this.pricePerDay = pricePerDay;
        this.type = type;
    }

    public CarType getType() {
        return type;
    }

    @Override
    public void showInfo() {
        System.out.print("Marka: " + brand);
        System.out.print("\tModel: " + model);
        System.out.print("\tNov: " + type);
        System.out.println("\tGunluk qiymeti: " + pricePerDay);
    }
}
