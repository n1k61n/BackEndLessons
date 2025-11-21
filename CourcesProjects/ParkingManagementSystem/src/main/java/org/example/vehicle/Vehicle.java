package org.example.vehicle;




import org.example.interfaces.Payable;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class Vehicle implements Payable {
    protected static int idCounter = 1;
    protected int id;
    protected String brand;
    protected String model;
    protected String plateNumber;
    protected LocalDateTime entryTime;
    protected LocalDateTime exitTime;

    public Vehicle(String brand, String model, String plateNumber)
    {
        this.id = idCounter++;
        this.brand = brand;
        this.model = model;
        this.plateNumber = plateNumber;
        this.entryTime = LocalDateTime.now();
    }

    public int getId() {
        return id;
    }

    @Override
    public double calculateFee() {
        this.exitTime = LocalDateTime.now();
        return exitTime.getHour() - entryTime.getHour() + 1;
    }

    @Override
    public String toString() {
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDate = entryTime.format(myFormatObj);
        return id + ": "  + brand + " " + model + " " + plateNumber + " Giris vaxti: " + formattedDate ;
    }
}
