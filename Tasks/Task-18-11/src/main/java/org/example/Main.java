package org.example;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(4));
        shapes.add(new Triangle(5));

        for(Shape shape : shapes){
            System.out.println(shape.calculateArea());
            System.out.println(shape.calculatePerimetr());
        }

    }
}