package org.example.animal.teacher;

public class Teacher {
     String name;
     String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }



    public String toString(){
        return name + " " + subject;
    }
}
