package org.example;

/*
 * 4. Student sistemi
Təsvir:
Student adlı class yaz:
 Sahələr: name, age, grade
 Metodlar:
o setGrade(double grade) – qiymət 0–100 aralığında olmalıdır
o isPassed() – qiymət ≥ 50 olarsa true qaytarsın
o getInfo() – tələbənin məlumatını çap et
 */

import lombok.Getter;

public class Student {
    private String name;
    private int age;
    @Getter
    private int grade;

    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void setGrade(int grade){
        if(grade >= 0 && grade <= 100){
            this.grade = grade;
        }
        else{
            System.out.println("qiymət 0–100 aralığında olmalıdır");
        }
    }


    public boolean isPassed(int grade){
        return grade >= 50;
    }

    public String  getInfo(){
        return "Ad: %s Yasi: %s Qiymeti: %s".formatted(name, age, grade);
    }
}
