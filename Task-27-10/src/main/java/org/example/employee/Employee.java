package org.example.employee;

import org.example.Info;

public class Employee implements Info {
    private String name;
    private double baseSalary;
    private Rank rank;

    public Employee(String name, double baseSalary, Rank rank) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.rank = rank;
    }

    public double  calculateSalary(){
        return  baseSalary * rank.getMultiplier();
    }


    @Override
    public void showInfo() {
        System.out.println("Ad: " + name);
        System.out.println("Rütbə: " + rank);
        System.out.println("Maaş: " + calculateSalary());
        System.out.println("-".repeat(20));
    }

}
