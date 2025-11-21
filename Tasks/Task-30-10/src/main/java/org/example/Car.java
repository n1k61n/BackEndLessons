package org.example;

import org.example.interfaces.AutopilotCapable;
import org.example.interfaces.Drivable;
import org.example.stuffs.SensorSuite;

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

public abstract class Car  implements Drivable, AutopilotCapable {
    private static int idCounter = 1;
    protected int id;
    protected String brand;
    protected String model;
    protected int year;
    protected double odometerKm;
    protected boolean isRunning;
    protected boolean autopilotOn;
    protected SensorSuite sensors;
    protected CarType carType;

    public Car(String brand, String model, int year) {
        this.id = idCounter++;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.sensors = new SensorSuite();
    }



    protected abstract boolean hasEnoughEnergyFor(double km);
    protected abstract void consumer(double km);
    public abstract void drive(double km);



    public void sensorsControl(int i)
    {
        switch (i){
            case 0 ->{
                sensors.setCameraOk(true);
                sensors.setRadarOk(true);
                sensors.setLidarOk(true);
                sensors.setLaneAssistOk(true);
                sensors.setGpsOk(true);
            }
            case 1 -> sensors.sensorCameraOnOff();
            case 2 -> sensors.sensorRadarOnOff();
            case 3 -> sensors.sensorLidarOnOff();
            case 4 -> sensors.sensorLaneAssistOnOff();
            case 5 -> sensors.sensorGpsOnOff();
            default -> System.out.println("Secim sehvdir!");
        }
        if(!sensors.allOK()) autopilotOn = false;
    }


    @Override
    public void enableAutopilot() {
        if(sensors.allOK() && !autopilotOn) {
            autopilotOn = true;
            System.out.println("Avtopilot quruldu.");
        }
        else {
            autopilotOn = false;
            System.out.println("Avtopilot artiq isleyir!");
        }
    }

    @Override
    public void disableAutopilot() {
        if(autopilotOn) {
            autopilotOn = false;
            System.out.println("Avtopilot sondu.");
        }
        else
            System.out.println("Avtopilot artiq sonludu!");
    }

    @Override
    public void start() {
        if(!isRunning) {
            isRunning = true;
            System.out.println("Masin ise dusdu.");
        }
        else
            System.out.println("Masin artiq isleyir!");
    }

    @Override
    public void stop() {
        if(isRunning) {
            isRunning = false;
            System.out.println("Masin sondu.");
        }
        else
            System.out.println("Masin artiq sonlidu!");
    }


    public void carsInfo(){
        String info = "%s. Brand: %s. Model: %s. Il: %d.\n";
        System.out.printf(info, id, brand, model, year);
    }

    public String toString() {
        return  "%s. Brand: %s. Model: %s. Il: %s. ";
    }



}
