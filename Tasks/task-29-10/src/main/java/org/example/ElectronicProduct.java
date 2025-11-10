package org.example;



public class ElectronicProduct extends Product{
    public int warrantyYears;

    public ElectronicProduct(String name, double basePrice, int warrantyYears) {
        super(name, basePrice);
        this.warrantyYears = warrantyYears;
    }


    @Override
    public double calculatePrice() {
        return getBasePrice() + warrantyYears * 50;
    }


    @Override
    public String toString() {
        return super.toString() +"\t" +warrantyYears + " zəmanət ili";
    }
}
