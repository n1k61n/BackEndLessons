package org.example.geometry;

public class Rectangle extends Shape{
    private final double width;
    private final double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    double getArea(){
        return this.width  * this.height;
    }

    @Override
    double getPerimeter(){
        return 2 * (this.width + this.height);
    }
}
