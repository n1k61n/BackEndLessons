package org.example;

public interface Drivable{
    void start();
    void stop();
    void drive(double distance) throws NotEnoughFuelEXCEPTION;
}
