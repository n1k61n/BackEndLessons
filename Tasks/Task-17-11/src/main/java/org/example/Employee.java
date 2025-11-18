package org.example;

import lombok.Setter;

/*
3.Task – Real tətbiq səviyyəsində
Təsvir:
Employee class yaz:
•	private: name, salary
•	metodlar:
o	setSalary(double salary) → maaş 300-dən az olmasın
o	increaseSalary(double percent) → faizlə artırma funksiyası
o	getInfo() → məlumat çap et
Main nümunə:
Employee e = new Employee();
e.setName("Selcan");
e.setSalary(800);
e.increaseSalary(10);
e.getInfo();
Çıxış:
Ad: Selcan
Maaş: 880.0

 */
public class Employee {
    @Setter
    private String name;
    private double salary;

    public Employee() {
    }

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void setSalary(double salary){
        if (salary >= 300) {
            this.salary = salary;
        }
        else System.out.println("Maas 300 asagi olmasin");
    }
    public void increaseSalary(double percent){
        salary += salary * percent / 100;
    }

    public void getInfo(){
        System.out.printf("Ad: %s Mass: %s\n", name, salary);
    }

}
