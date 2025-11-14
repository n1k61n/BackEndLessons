package org.example;


import java.util.Scanner;
/**
 * Main class of the Car Rental System.
 * This class runs the application.
 */
public class Main {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CarManager manager = new CarManager();
        manager.addCar(new SportCar("Mercedes", 2000));
        manager.addCar(new SportCar("BMV", 2010));
        manager.addCar(new EconomCar("Honda", 2020));
        manager.addCar(new EconomCar("Toyota", 2015));
        manager.addCar(new SuvCar("Ford", 2005));
        int choice;
        do {
            System.out.println("======Car Rental System======");
            System.out.println("1. Maşın siyahısını göstər");
            System.out.println("2. Maşın icarəyə götür");
            System.out.println("3. Çıxış");
            System.out.print("Seciminizi edin: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 1 -> manager.showCars();
                case 2 -> manager.rentCar(scanner);
                case 3 -> System.out.println("Programm baglanir.");
                default -> System.out.println("Seciminiz sehvdir");
            }
        }while(choice != 3);
    }
}