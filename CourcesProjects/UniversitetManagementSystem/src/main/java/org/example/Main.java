package org.example;


/**
 * �
 * � Task 3 – “Universitet İdarə Sistemi” (Composition + Enum + Polymorphism)
 * Təsvir:
 * Universitetdə tələbələr və müəllimlər var.
 * Hər kəsin “rolu” və “department” var (enum ilə).
 * Tələblər:
 *  enum Department { IT, BUSINESS, LAW }
 *  abstract class Person: name, age, department
 *  Student və Teacher → Person-dan miras alır.
 *  Course sinfi: name, credits, Teacher və ArrayList<Student> saxlayır.
 *  Metod: showCourseInfo() → müəllim və tələbələrin siyahısını göstər.
 *  Main → bir neçə obyekt yarat və kurs məlumatını ekrana çıxar.
 */

public class Main {
    public static void main(String[] args) {
        Teacher teacher  = new Teacher("Senan", 34, Department.IT) ;
        Course course = new Course("informatika", teacher, 300);
        course.addStudent(new Student("Tunar", 15, Department.IT));
        course.addStudent(new Student("Orxan", 15, Department.IT));
        course.addStudent(new Student("Kenan", 15, Department.IT));
        course.addStudent(new Student("Mikail", 15, Department.IT));
        course.showCourseInfo();
    }
}



