package org.example;

import java.util.ArrayList;

public class Group {
    ArrayList<Student> students = new ArrayList<>();



    public void addStudent(Student student){
        students.add(student);
    }

    public void showAll(){
        for(Student student : students){
            student.info();
        }
    }

    public void getAverageGrde(){
        int totalAvg = 0;
        for(Student student : students){
            totalAvg += student.grade;
        }
        System.out.println(totalAvg / students.size());
    }

}
