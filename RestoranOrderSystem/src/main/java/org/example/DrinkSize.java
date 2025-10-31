package org.example;

// • DrinkItem: əlavə sahə → size (small, medium, large)
// o small → +0, medium → +1, large → +2 AZN
public enum DrinkSize {
    SMALL(0), MEDIUM(1),LARGE(2);

    public final int size;

    DrinkSize(int size) {
        this.size = size;
    }
}
