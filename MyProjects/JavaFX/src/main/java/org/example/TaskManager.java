package org.example;

import java.io.*;
import java.util.*;
import java.util.logging.*;

public class TaskManager {
    private HashMap<Integer, Task> tasks = new HashMap<>();
    private int nextId = 1;
    private final String FILE_NAME = "tasks.dat";
    private static final Logger logger = Logger.getLogger(TaskManager.class.getName());

    public TaskManager() {
        loadFromFile();
    }

    public void addTask(String name, String description, int priority) {
        Task task = new Task(nextId++, name, description, priority);
        tasks.put(task.getId(), task);
        saveToFile();
    }

    public void removeTask(int id) {
        tasks.remove(id);
        saveToFile();
    }

    public void completeTask(int id) {
        Task t = tasks.get(id);
        if (t != null) {
            t.setCompleted(true);
            saveToFile();
        }
    }

    public List<Task> getAllTasks() {
        List<Task> list = new ArrayList<>(tasks.values());
        list.sort(Comparator.comparing(Task::getPriority));
        return list;
    }

    private void saveToFile() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(tasks);
        } catch (IOException e) {
            logger.log(Level.SEVERE, "Fayla yazarkən xəta baş verdi", e);
        }
    }

    @SuppressWarnings("unchecked")
    private void loadFromFile() {
        File file = new File(FILE_NAME);
        if (!file.exists()) return;

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            Object obj = ois.readObject();
            if (obj instanceof HashMap) {
                tasks = (HashMap<Integer, Task>) obj;
                if (!tasks.isEmpty())
                    nextId = Collections.max(tasks.keySet()) + 1;
            }
        } catch (IOException | ClassNotFoundException e) {
            logger.log(Level.WARNING, "Fayl oxunarkən xəta: " + e.getMessage(), e);
        }
    }
}
