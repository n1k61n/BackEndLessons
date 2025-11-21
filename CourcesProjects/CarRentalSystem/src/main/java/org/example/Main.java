package org.example;

import java.util.Scanner;

//3. Car Rental System
//Mövzu: inheritance, polymorphism, switch-case
//Təsvir:
//Siniflər:
//Car (əsas sinif)
//EconomyCar, SportCar, SUV (miras alır)
//Main menyu:
//1. Maşın siyahısını göstər
//2. Maşın icarəyə götür
//3. Çıxış
public class Main {
    static Car[] cars = {
            new EconomyCar("Toyota", "Yaris", 2015),
            new SportCar("Ferrari", "488", 2020),
            new SuvCar("Jeep", "Wrangler", 2025)
    };
    public static void main(String[] args) {
        boolean exit = false;
        while(!exit){
            printMenu();
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    printListofCar();
                    break;
                case 2:
                    rentCar();
                    break;
                case 3:
                    exit = true;
                    System.out.println("Çıxılır...");
                    break;

                default:
                    System.out.println("Yanlış seçim.");
                    break;
            }
        }

    }

    static void rentCar(){
        System.out.print("Maşın nömrəsini daxil edin (1-" + cars.length + "): ");
        Scanner scanner = new Scanner(System.in);
        int index = scanner.nextInt();
        scanner.nextLine(); // buffer təmizlənməsi

        if (index >= 1 && index <= cars.length) {
            cars[index - 1].rent(); // Polymorphism burada işə düşür
        } else {
            System.out.println("Yanlış seçim.");
        }
    }

    static void printListofCar(){
        System.out.println("\nMaşınlar:");
        for (int i = 0; i < cars.length; i++) {
            System.out.println((i + 1) + ". " + cars[i].getInfo());
        }
    }


    static void printMenu(){
        System.out.println("Main menu:");
        System.out.println("1. Maşın siyahısını göstər");
        System.out.println("2. Maşın icarəyə götür");
        System.out.println("3. Çıxış");
    }
}