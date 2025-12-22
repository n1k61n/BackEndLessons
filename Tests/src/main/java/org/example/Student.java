package org.example;


import java.util.Objects;

public class Student {
    private String name;
    private Level level;


    public Student(String name, Level level) {
        this.name = name;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public Level getLevel() {
        return level;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

}
