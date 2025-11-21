package org.example;

public class Circle extends Shape{
    private double radius;


    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }



    @Override
    public double calculatePerimetr() {
        return 2 * Math.PI * radius;
    }
}
