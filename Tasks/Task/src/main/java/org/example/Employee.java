package org.example;

import java.awt.*;

public class Employee {
    private String name;
    private double salary;

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void increaseSalary(double percent){
        this.salary += this.salary * percent / 100;
    }

    public void getInfo(){
        System.out.println("Ad: " + this.name);
        System.out.println("Maas: "+ this.salary);
    }
}
