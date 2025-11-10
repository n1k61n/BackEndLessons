package org.example;

public class Employee {
    private String name;
    private double salary;

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        if (salary >= 300.0)
            this.salary = salary;
        else
        {
            System.out.println("Maas 300 az ola bilmez.");
        }
    }

    public void increaseSalary(double percent){
        this.salary += this.salary * percent / 100;
    }

    public void getInfo(){
        System.out.println("Ad: " + this.name);
        System.out.println("Maas: "+ this.salary);
    }
}
