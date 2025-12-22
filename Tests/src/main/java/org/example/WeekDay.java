package org.example;

public enum WeekDay {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;


    public boolean weekend(){
        return this == SATURDAY || this == SUNDAY;
    }

}
