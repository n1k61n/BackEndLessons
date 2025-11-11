package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TaskManager taskManager = new TaskManager();
        taskManager.readFromFile();
        String choice;
        do {
            System.out.println("1. Tapşırıqları əlavə et");
            System.out.println("2. Tapşırıqları sil");
            System.out.println("3. Tapşırıqları goster");
            System.out.println("4. Tapşırıqları tamamla");
            System.out.println("5. Tapşırıqları prioriteta gore sirala");
            System.out.println("6. Tapşırıqları fayla yaz");
            System.out.println("7. Tapşırıqları fayldan oxu");
            System.out.println("0. Cixis");
            System.out.print("Secim edin: ");
            choice = scanner.nextLine();
            switch (choice){
                case "1" -> taskManager.addTask(scanner);
                case "2" -> taskManager.deleteTask(scanner);
                case "3" -> taskManager.showTasks();
                case "4" -> taskManager.completedTask(scanner);
                case "5" -> taskManager.sortByPriority();
                case "6" -> taskManager.writeFile();
                case "7" -> taskManager.readFromFile();
                case "0" -> {
                    taskManager.writeFile();
                    System.out.println("Program bitdi!");
                }
            }
        }while(!choice.equals("0"));
    }
}


