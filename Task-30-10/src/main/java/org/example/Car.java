package org.example;


public class Car {
    private String brand;
    private String model;
    private int year;
    private double fuelLevel;
    private double  distance;
    private double battery;

    public Car(String brand, String model, int year, double fuel, double battery) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.fuelLevel = fuel;
        this.battery = battery;
    }


    public String getBrand() {
        return brand;
    }

    public void drive(double distance){
        double fromFuel = calculateDistanceFromFuel();
        double fromBattery = calculateDistanceFromBattery();
        double moveDistance = fromBattery + fromFuel;
        if(moveDistance >= distance){
            this.distance += distance;
            if(fromFuel >= distance){
                this.fuelLevel -= distance / 10.0;
            }else{
                double leftDistance = distance  - (this.fuelLevel * 10);
                this.fuelLevel -= this.fuelLevel;
                this.battery -= leftDistance / 3.0;
            }
        }
        else {
            System.out.println("Not enough fuel!");
        }
    }

    private double calculateDistanceFromFuel(){
        return this.fuelLevel * 10;
    }

    private double calculateDistanceFromBattery(){
        return this.battery * 2;
    }


    public void reWatt(int watt){
        this.battery += watt;
    }

    public void refuel(double liters){
        this.fuelLevel += liters;
    }

    public String toString() {
        String info = "Brand: %s. Model: %s. Year: %d. Fuel level: %.2f. Watt: %.2f. Distance: %.2f";
        return String.format(info, brand, model, year, fuelLevel, battery, distance);
    }

}
