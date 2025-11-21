package org.example;

import java.util.ArrayList;
import java.util.List;

public final class StudentManager {
    static List<Student> telebeler = new ArrayList<>();


    public static void addStudent(Student student){
        telebeler.add(student);
    }

    public static boolean deleteStudent(Student student){
        if(student != null) {
            telebeler.remove(student);
            return true;
        }
        return false;
    }

    public static void showAllStudents(){
        System.out.println("Telebelerin siyahisi:");
        for (Student student : telebeler){
            System.out.println(student.getId() + ". " +student.getName() + " " +student.getSurname() + " " + student.getAge());
        }
    }

    public static Student findById(int id){
        for (Student student : telebeler){
            if (id == student.getId())
                return student;
        }
        return null;
    }
}
