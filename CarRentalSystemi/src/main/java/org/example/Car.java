package org.example;

abstract class Car {
    String brand;
    int year;
    boolean status;

    public Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
        this.status = false;
    }

    public String toString(){
        return "Brand: " + brand + ". Year: " + year;
    }
}
