package org.example;

public class VolumeCalculator{

    int volume(int side){
        return (int)Math.pow(side, 3);
    }

    int volume(int a, int b, int c){
        return a * b * c;
    }

    double  volume(double radius){
        return 4 / 3.0 * Math.PI * volume(3);
    }
}
