package org.example;

public enum Month {
    JANUARI(1-31),
    FEBRUARY(1-28),
    MARCH(1-31),
    APRIL(1-30);


    public final int days;

    Month(int days) {
        this.days = days;
    }


}
