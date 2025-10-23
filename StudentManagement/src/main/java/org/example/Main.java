package org.example;


//2. Student Management System
//Mövzu: class, encapsulation, ArrayList, switch-case
//Təsvir:
//Student sinfi: id, name, surname, age
//StudentManager sinfi: tələbə siyahısı saxlayır və metodlar:
//addStudent()
//showAllStudents()
//findById()
//deleteStudent()
//Main metodunda menyu:
//1. Tələbə əlavə et
//2. Siyahını göstər
//3. ID ilə tap
//4. Sil
//5. Çıxış
//Seçimlər switch-case ilə idarə olunur.
//📘 OOP prinsipi: Encapsulation, Class separation
//📘 Yeni anlayış: Menu ilə idarəetmə


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while(true){
            printMenu();
            Scanner scanner = new Scanner(System.in);
            int userInput = scanner.nextInt();

            switch (userInput){
                case 1:
                    studentAdd();
                    break;
                case 2:
                    StudentManager.showAllStudents();
                    break;
                case 3:
                    findById();
                    break;
                case 4:
                    removeStudent();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Sehv menu secim etmisiniz.");
            }

        }
    }

    static void removeStudent(){
        System.out.println("Silinen Telebenin idisini daxil edin: ");
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();
        Student student =  StudentManager.findById(id);
        if(student != null && StudentManager.deleteStudent(student)){
            System.out.println("telebe ugurla silindi.");
        }
        else
            System.out.println("Telebe tapilmadi.");
        
    }

    static void findById(){
        System.out.println("Telebenin idisini daxil edin: ");
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();
        Student student = StudentManager.findById(id);
        System.out.println("Telebenin adi: "  + student.getName());
        System.out.println("Telebenin soyadi: " + student.getSurname());
        System.out.println("Telebenin yasi:" + student.getAge());
        System.out.println();
    }


    static void studentAdd(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Telebenin melumatlarini daxil edin.\n");
        System.out.println("Telebenin adi: ");
        String name = scanner.nextLine();
        System.out.println("Telebenin soyadi: ");
        String surname = scanner.nextLine();
        System.out.println("Telebenin yasi:");
        int age = scanner.nextInt();
        Student student = new Student(name, surname, age);
        StudentManager.addStudent(student);
    }


    static void printMenu(){
        System.out.println("1. Tələbə əlavə et");
        System.out.println("2. Siyahını göstər");
        System.out.println("3. ID ilə tap");
        System.out.println("4. Sil");
        System.out.println("5. Çıxış");
    }
}