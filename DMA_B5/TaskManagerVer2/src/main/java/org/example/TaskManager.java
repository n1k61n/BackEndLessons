package org.example;

import java.io.*;
import java.util.*;

public class TaskManager {
    private Map<Integer, Task> tasks = new HashMap<>();
    private int nextId = 1;
    private final String FILE_NAME = "task.dat";

    public void addTask(Scanner scanner) {
        System.out.print("Tapşırığın adını qeyd edin: ");
        String name = scanner.nextLine();
        System.out.println("Tapşırığın mətnini qeyd edin (bitirmək üçün 'end' yazın):");
        StringBuilder description = new StringBuilder();

        while (true) {
            String line = scanner.nextLine();
            if (line.equalsIgnoreCase("end")) {
                break;
            }
            description.append(line).append("\n");
        }

        Task task = new Task(nextId++, name, description.toString());
        tasks.put(task.getId(), task);
        System.out.println("Tapşırıq uğurla əlavə olundu.");
    }

    public void showTasks() {
        if (tasks.isEmpty()) {
            System.out.println("Tapşırıq siyahısı boşdur.");
            return;
        }
        System.out.println("-".repeat(20));
        System.out.println(" Tapşırıqlar siyahısı:");
        for (Map.Entry<Integer, Task> entry : tasks.entrySet()) {
            System.out.println(entry.getValue().getId() + ": " + entry.getValue().getName() + "\n-> " + entry.getValue().getDesction() + "Tamalanib: " + (entry.getValue().isCompleted() ? "He\n" : "Yox\n"));
        }
        System.out.println("-".repeat(20));

    }

    public void deleteTask(Scanner scanner) {
        System.out.print("Silinəcək tapşırığın Id-ni qeyd edin: ");
        int id = Integer.parseInt(scanner.nextLine());
        if (tasks.containsKey(id)) {
            tasks.remove(id);
            System.out.println("Tapşırıq silindi.");
        } else {
            System.out.println("Bu adda tapşırıq tapılmadı.");
        }
    }

    public void completedTask(Scanner scanner) {
        System.out.print("Tamamlamak istediyiniz tapşırığın Id-ni qeyd edin: ");
        int id = Integer.parseInt(scanner.nextLine());
        Task task = tasks.get(id);
        if(task != null){
            task.setCompleted(true);
            System.out.println("Tapsiriq tamaalandi.");
        }
    }

    public void sortByPriority() {
        List<Task> list = new ArrayList<>(tasks.values());
//        list.sort(Comparator.comparing(task -> task.isCompleted()));
        System.out.println(" Tapşırıqlar prioritetə görə sıralandı.");
    }

    public void writeFile() {
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(FILE_NAME))){
            out.writeObject(tasks);
            System.out.println("Tapsirig ugyrla yazildi");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void readFromFile() {
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            tasks = (HashMap<Integer, Task>) in.readObject();
            System.out.println("Tapsiriglar ugurla yuklendi.");
        }catch(FileNotFoundException e) {
            System.out.println("Yeni fayl yaradilacaq.");
        }catch (Exception  e){
            System.out.println(e.getMessage());
        }
    }
}
