package org.example.animal.student;

public class Student {
    private final String name;
    private final int grade;
    private final int age;

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public Student(String name, int grade, int age) {
        this.name = name;
        this.grade = grade;
        this.age = age;
    }

    public void getInfo(){
        System.out.print("Telebenin adi: " + this.name + ". Yasi " + this.age);
        System.out.println(". Qiymeti: " + this.grade);
    }
}
