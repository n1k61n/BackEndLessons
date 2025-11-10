package org.example.shapes;

public class Circle extends Shape{
    private double radius;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * this.radius * this.radius;
    }
}
