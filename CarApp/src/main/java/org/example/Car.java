package org.example;


public abstract class Car implements Drivable, AutopilotCapable {
    private String brand;
    private String model;
    private int year;
    private double odometerKm;
    protected boolean isRunning;
    protected boolean autopilotOn;
    protected SensorSuite sensors;

    protected Car(String brand, String model, int year, SensorSuite sensors) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.sensors = sensors;
        this.odometerKm = 0;
        this.isRunning = false;
        this.autopilotOn = false;
    }

    public abstract boolean hasEnoughEnergyFor(double km);
    protected abstract void consumeFor(double km);

    @Override
    public void start() {
        if (!isRunning) {
            isRunning = true;
            System.out.println(model + " started.");
        } else {
            throw new IllegalOperationException("Car is already running.");
        }
    }

    @Override
    public void stop() {
        if (isRunning) {
            isRunning = false;
            autopilotOn = false;
            System.out.println(model + " stopped.");
        } else {
            throw new IllegalOperationException("Car is not running.");
        }
    }

    @Override
    public void drive(double km) {
        if (!isRunning)
            throw new IllegalOperationException("Car must be started before driving.");

        double distance = km;
        if (autopilotOn) distance *= 0.95; // 5% daha səmərəli

        if (!hasEnoughEnergyFor(distance))
            throw new org.example.InsufficientEnergyException("Not enough fuel or battery.");

        consumeFor(distance);
        odometerKm += km;
        System.out.println(model + " drove " + km + " km.");
    }

    @Override
    public void enableAutopilot() {
        if (!isRunning) throw new IllegalOperationException("Start the car first!");
        if (!sensors.allOk()) throw new IllegalOperationException("Sensors not ready!");
        autopilotOn = true;
        System.out.println(model + " autopilot enabled.");
    }

    @Override
    public void disableAutopilot() {
        autopilotOn = false;
        System.out.println(model + " autopilot disabled.");
    }

    public void printStatus() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return brand + " " + model + " (" + year + ") | " +
                "Odometer: " + odometerKm + " km | " +
                "Running: " + isRunning + " | Autopilot: " + autopilotOn +
                " | " + sensors;
    }
}
