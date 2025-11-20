package org.example;

abstract class Electronics  extends Product{
    Electronics(String name, double basePrice) {
        super(name, basePrice);
    }


    double CustomsDuty(){
        return this.basePrice * 0.05;
    }

}
