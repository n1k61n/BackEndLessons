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
    public void markAsDone(Task task){
        task.setCompleted(true);
        System.out.println("Tapsirig tamamlandi");
    }

//showAllTasks()
    public void showAllTasks(){
        for(Task task : tasks)
            System.out.println(task.info());
    }

//deleteTask()
    public void deleteTask(Task task){
        if (tasks.remove(task))
            System.out.println("Tapsirig silindi.");
        else
            System.out.println("Tapsirig silinmedi.");
    }
}
