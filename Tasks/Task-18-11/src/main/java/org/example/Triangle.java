package org.example;

public class Triangle extends Shape {
    private double base;


    public Triangle(double base) {
        this.base = base;
    }

    @Override
    public double calculateArea() {
        return Math.sqrt(3) / 4 * base * base;
    }

    @Override
    public double calculatePerimetr() {
        return 3 * base;
    }
}
