package org.example;


public class Car {
    private String brand;
    private String model;
    private int year;
    private double fuelLevel;
    private double  distance;
    private int electric;

    public Car(String brand, String model, int year, double fuelLevel) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.fuelLevel = fuelLevel;
        this.electric = 20;
    }


    public String getBrand() {
        return brand;
    }

    public void drive(int distance){
        double moveDistance = calculateDistance(distance);
        if(moveDistance >= distance){
            this.distance += distance;
            double spentFuel = distance / 10.0;
            if(this.fuelLevel >= spentFuel){
                this.fuelLevel -= spentFuel;
            }
            else{
                int leftDistance = distance - (int)(this.fuelLevel * 10);
                this.fuelLevel = 0;
                if (leftDistance * 3 >= this.electric)
                    this.electric -= leftDistance * 3;
                else
                    System.out.println("Not enough gaz...");
            }
        }
        else {
            System.out.println("Not enough fuel!");
        }
    }

    private double calculateDistance(int distance){
        return this.fuelLevel * 10 + this.electric * 3;
    }

    public void reWatt(int watt){
        this.electric += watt;
    }

    public void refuel(double liters){
        this.fuelLevel += liters;
    }

    public String toString() {
        String info = "Brand: %s. Model: %s. Year: %d. Fuel level: %.2f. Watt: %d. Distance: %.2f";
        return String.format(info, brand, model, year, fuelLevel, electric, distance);
    }

}
