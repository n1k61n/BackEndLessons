package org.example;

import java.io.Serial;
import java.io.Serializable;

public class Task implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private final int id;
    private final String name;
    private final String description;
    private boolean completed;
    private final int priority;

    public Task(int id, String name, String description, int priority) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.priority = priority;
        this.completed = false;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getDescription() { return description; }
    public int getPriority() { return priority; }

    public void setCompleted(boolean completed) { this.completed = completed; }

    @Override
    public String toString() {
        return String.format("[%d] %s (Prioritet: %d) - %s",
                id, name, priority, completed ? "Tamamlandı ✅" : "Gözləyir ⏳");
    }
}
