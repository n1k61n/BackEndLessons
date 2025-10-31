package org.example;

/**
 * Car (abstrakt)
 * Sahələr:
 * String brand, String model, int year
 * double odometerKm (ümumi yürüş)
 * boolean isRunning
 * boolean autopilotOn
 * SensorSuite sensors (sürücüsüz hərəkət üçün)
 * Metodlar (bəziləri abstrakt):
 * start(), stop() (Drivable-dan gəlir)
 * drive(double km) → alt siniflərdə sərfə görə override
 * enableAutopilot()/disableAutopilot() (AutopilotCapable)
 * protected abstract boolean hasEnoughEnergyFor(double km);
 * protected abstract void consumeFor(double km);
 */
public abstract class Car implements Drivable, AutopilotCapable{
    private String brand;
    private String model;
    private int year;
    private double odometerKm;
    private boolean isRunning;
    private boolean autopiloOn;
//    private SensorSuite sensors;
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

    protected abstract boolean hasEnoughEnergyFor(double km);

    public String getBrand() {
        return brand;
    }

    @Override
    public void start() {
        isRunning = true;
    }

    @Override
    public void stop() {
        isRunning = false;
    }

    public double drive(double distance){
        double fromFuel = calculateDistanceFromFuel();
        double fromBattery = calculateDistanceFromBattery();
        double moveDistance = fromBattery + fromFuel;
        if(moveDistance >= distance){
            this.distance += distance;
            if(fromFuel >= distance){
                this.fuelLevel -= distance / 10.0;
            }else{
                double leftDistance = distance  - calculateDistanceFromFuel();
                this.fuelLevel -= this.fuelLevel;
                this.battery -= leftDistance / 2.0;
            }
        }
        else {
            System.out.println("Not enough fuel!");
        }
        return fromFuel;
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


    @Override
    public void enableAutopilot() {
        autopiloOn = true;
    }

    @Override
    public void disableAutopilot() {
        autopiloOn = false;
    }
}
