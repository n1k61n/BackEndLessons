package org.example;

public enum DayOfWeek {
    MON, TUE, WEN, THUR, FRI, SAT, SUN;

    public static DayOfWeek getDayOfWeek(int day) {
        return DayOfWeek.values()[day-1];
    }
}
