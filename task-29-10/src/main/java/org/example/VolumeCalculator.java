package org.example;

public class VolumeCalculator{

    public int volume(int side){
        return (int)Math.pow(side, 3);
    }

    public int volume(int a, int b, int c){
        return a * b * c;
    }

    public double  volume(double radius){
        return 4 / 3.0 * Math.PI * Math.pow(radius, 3);
    }
}
