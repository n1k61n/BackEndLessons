package org.example;

public class Student {
    String name;
    int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public void info(){
        System.out.println("Adi: " + name + " Derecesi " + grade);
    }
}
