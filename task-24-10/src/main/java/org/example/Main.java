package org.example;


import org.example.school.School;
import org.example.school.Teacher;

public class Main {
    public static void main(String[] args) {

//        Group bma4 = new Group();
//
//        bma4.addStudent(new Student("Emin", 99));
//        bma4.addStudent(new Student("Vusal", 70));
//        bma4.addStudent(new Student("kamran", 100));
//
//        bma4.showAll();
//        bma4.getAverageGrde();

        School sc47 = new School();
        sc47.addTeacher(new Teacher("Sema", "Fizika"));
        sc47.addTeacher(new Teacher("Senan", "Informatika"));
        sc47.addTeacher(new Teacher("Tebriz", "Kimya"));

//        sc47.showAllTeachers();

        sc47.removeTeacher("Senan");
        sc47.showAllTeachers();





    }
}