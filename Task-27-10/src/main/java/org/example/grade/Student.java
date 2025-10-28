package org.example.grade;

import org.example.Info;

public class Student implements Info {
    private String name;
    private int score;
    private Grade grade;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
        this.grade = Grade.fromScore(score);
    }

    public int getScore() {
        return score;
    }

    public void showInfo(){
        System.out.print("Adi: " + name);
        System.out.print("\tBali: " + score);
        System.out.println("\tQiymeti: " + grade);
    }
}
