package org.example;


public class Main {
    public static void main(String[] args) {

        Group bma4 = new Group();

        bma4.addStudent(new Student("Emin", 99));
        bma4.addStudent(new Student("Vusal", 70));
        bma4.addStudent(new Student("kamran", 100));

        bma4.showAll();
        bma4.getAverageGrde();
    }
}