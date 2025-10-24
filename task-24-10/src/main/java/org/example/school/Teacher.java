package org.example.school;

public class Teacher {
    String name;
    String subject;


    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public void info(){
        System.out.println(name + " - " + subject);
    }
}
