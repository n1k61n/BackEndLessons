package org.example;

public abstract class Electronics  extends Product{
    public Electronics(String name, double basePrice) {
        super(name, basePrice);
    }


    public double CustomsDuty(){
        return this.basePrice * 0.05;
    }

}
