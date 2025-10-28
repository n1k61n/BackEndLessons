package org.example.grade;

public enum Grade {
    A(90-100), B(80-89), C(70-79), D(60-69), F(0-60);


    public final int GRADE;

    Grade(int grade) {
        GRADE = grade;
    }


    public static Grade fromScore(int score) {
        if (score >= 90) return A;
        else if (score >= 80) return B;
        else if (score >= 70) return C;
        else if (score >= 60) return D;
        else return F;
    }
}
