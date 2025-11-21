package org.example;

public class Manager extends Employee{
    private String department;


    public Manager(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    @Override
    public double calculateBonus() {
        return salary * 0.15;
    }


    @Override
    public String toString() {
        return "Manager{" +
                "department='" + department + '\'' +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
