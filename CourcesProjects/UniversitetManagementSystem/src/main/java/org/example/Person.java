package org.example;

public abstract class Person{
    private String name;
    private int age;
    private Department department;


    public Person(String name, int age, Department department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Department getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return  name + ", age - " + age +", department - " + department;
    }
}
