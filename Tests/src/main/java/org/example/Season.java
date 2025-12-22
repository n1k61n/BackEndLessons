package org.example;

public enum Season {
    WINTER("Soyuq"),
    SPRING("Iliq"),
    SUMMER("Isti"),
    AUTUMN("Serin");

    private final String description;

    Season(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }


}
