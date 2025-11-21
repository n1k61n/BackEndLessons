package org.example;

public class Student {
    private int id;
    private String name;
    private Grade grade;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Grade getGrade() {
        return this.grade;
    }

    public void setGrade(int grade) {
        if(grade >=90  && grade <= 100)
            this.grade = Grade.A;
        else if(grade >=80  && grade <= 89)
            this.grade = Grade.B;
        else if(grade >=70 && grade <= 79)
            this.grade = Grade.C;
        else if(grade >=60 && grade <= 69)
            this.grade = Grade.D;
        else if(grade >=50 && grade <= 59)
            this.grade = Grade.E;
        else
            this.grade = Grade.F;


    }
}
