package org.example;

import java.util.ArrayList;
import java.util.List;

public  class Car {
    private final String brand;
    private final String model;
    private final int year;


    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;

    }

    public  String  getInfo(){
        return brand + " " + model;
    }

    public  void rent(){
        System.out.println(brand + " " + model + " icareye goturuldu.");
    }

}
