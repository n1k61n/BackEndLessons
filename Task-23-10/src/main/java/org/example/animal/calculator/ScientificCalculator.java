package org.example.animal.calculator;

public class ScientificCalculator extends Calculator {
    @Override
    public int add(int a, int b) {
        System.out.print("Log: " + a + " + " + b + " = ");
        return super.add(a, b);
    }

    @Override
    public double add(double a, double b) {
        System.out.print("Log: " + a + " + " + b + " = ");
        return super.add(a, b);
    }

    @Override
    public int add(int a, int b, int c) {
        System.out.print("Log: " + a + " + " + b + " + " + c + " = ");
        return super.add(a, b, c);
    }
}
