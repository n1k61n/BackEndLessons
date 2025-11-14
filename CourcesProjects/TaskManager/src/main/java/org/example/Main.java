package org.example;


//1. To-Do Task Manager
//Mövzu: class, ArrayList, encapsulation, switch-case
//Təsvir:
//Task sinfi yaradın:
//id
//        title
//completed (boolean)
//TaskManager sinfi:
//addTask()
//markAsDone()
//showAllTasks()
//deleteTask()
//Menyu:
//1. Yeni tapşırıq əlavə et
//2. Bütün tapşırıqları göstər
//3. Tapşırığı tamamlandı kimi işarələ
//4. Tapşırığı sil
//5. Çıxış
//Seçimlər switch-case ilə idarə olunur.
//📘 OOP prinsipi: Encapsulation, Class interaction
//📘 Yeni anlayış: Task idarəetmə, boolean flag

import java.util.List;
import java.util.Scanner;

public class Main {
    static int ID = 0;
    public static void main(String[] args) {
        boolean exit = true;
        Scanner scanner = new Scanner(System.in);
        TaskManager tm = new TaskManager();
        int id;
        while(exit){
            showMenu();
            System.out.println("Secim edin");
            int input = scanner.nextInt();
            switch (input){
                case 1:
                    String title = scanner.nextLine();
                    tm.addTask(new Task(++ID, title, false));
                    break;
                case 2:
                    tm.showAllTasks();
                    break;
                case 3:
                    System.out.println("Tamamlanan tapsirigin id-ni daxil edin.");
                    id = scanner.nextInt();
                    tm.markAsDone(id);
                    break;
                case 4:
                    System.out.println("Silinen tapsirigin id-ni daxil edin.");
                    id = scanner.nextInt();
                    tm.deleteTask(id);
                    break;
                case 5:
                    exit = false;
                    break;
                default:
                    System.out.println("Secim duzgun edilmeyib.");
            }
        }
    }


    static void showMenu(){
        String[] lst = {"Yeni tapşırıq əlavə et",
                "Bütün tapşırıqları göstər",
                "Tapşırığı tamamlandı kimi işarələ",
                "Tapşırığı sil", "Çıxış"};
        Menu menu = new Menu(List.of(lst));
        menu.printMenu();

    }
}