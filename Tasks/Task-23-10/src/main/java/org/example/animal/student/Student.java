package org.example.animal.student;

public class Student {
    private  String name;
    private  int grade;
    private  int age;

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public Student(int grade, String name) {
        this.grade = grade;
        this.name = name;
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
