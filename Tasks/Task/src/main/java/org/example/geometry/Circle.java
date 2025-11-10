package org.example.geometry;

public class Circle extends Shape {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double getArea(){
        return Math.PI * Math.pow(this.radius, 2);
    }

    @Override
    double getPerimeter(){
        return 2 * Math.PI * this.radius;
    }
}
