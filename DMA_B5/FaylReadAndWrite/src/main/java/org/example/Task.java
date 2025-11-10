package org.example;

import java.io.Serial;
import java.io.Serializable;

public class Task implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    private final int id;
    private final String name;
    private final String descriptions;
    private boolean completed;

    public Task(int id, String name, String descriptions){
        this.id = id;
        this.name = name;
        this.descriptions = descriptions;
        this.completed = false;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDesction() {
        return descriptions;
    }
}
