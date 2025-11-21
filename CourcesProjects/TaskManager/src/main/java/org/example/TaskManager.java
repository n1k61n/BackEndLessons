package org.example;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    List<Task> tasks = new ArrayList<>();

    //addTask()
    public void addTask(Task task){
        tasks.add(task);
        System.out.println("Tapsiriq elave olundu.");
    }

    //markAsDone()
    public void markAsDone(int id){
        for(Task task : tasks) {
            if(task.getId() == id) {
                task.setCompleted(true);
                System.out.println("Tapsirig tamamlandi");
                return;
            }
        }
    }

//showAllTasks()
    public void showAllTasks(){
        for(Task task : tasks)
            System.out.println(task.info());
        System.out.println("-".repeat(20));
    }

//deleteTask()
    public void deleteTask(int id){
        for(Task task : tasks){
            if (task.getId() == id){
                tasks.remove(task);
                System.out.println("Tapsiriq silindi.");
                return;
            }
        }
        System.out.println("Tapsiriq tapilmadi.");
    }
}
