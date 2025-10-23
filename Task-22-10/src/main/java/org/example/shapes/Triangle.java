package org.example.shapes;

public class Triangle extends Shape{
    private double width;
    private double height;

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double area() {
        return 0.5 * this.width * this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }


}
