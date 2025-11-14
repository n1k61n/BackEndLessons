package org.example;



// Course sinfi: name, credits, Teacher və ArrayList<Student> saxlayır.
// *  Metod: showCourseInfo() → müəllim və tələbələrin siyahısını göstər.

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String name;
    private int credits;
    private Teacher teacher;
    List<Student> students = new ArrayList<>();



    public Course(String name, Teacher teacher, int credits) {
        this.name = name;
        this.teacher = teacher;
        this.credits = credits;
    }

    public void addStudent(Student student){
        students.add(student);
    }


    public void showCourseInfo(){
        System.out.printf("Kursun adi - %s, Muellim - %s,  credits - %s\n", name, teacher, credits);
        students.forEach(System.out::println);
    }
}
