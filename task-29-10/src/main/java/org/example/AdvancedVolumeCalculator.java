package org.example;

public class AdvancedVolumeCalculator extends VolumeCalculator{


    @Override
    public double volume(double radius){
        System.out.println("Həcm hesablandı.");
        return super.volume(radius);
    }
    
}
