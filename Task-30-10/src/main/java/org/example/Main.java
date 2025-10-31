package org.example;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Car> cars = new ArrayList<>();
        cars.add(new GasCar("BMW", "M5", 2020, 20, 100));
        cars.add(new GasCar("BMW", "M5", 2020, 20, 100));
        int choice = 0;
        do{
            System.out.println("\nMENU:");
            System.out.println("1. Maşını seç.");
            System.out.println("2. Start.");
            System.out.println("3. Stop.");
            System.out.println("4. Drive  (km daxil et).");
            System.out.println("5. Refuel (yalnız GasCar)");
            System.out.println("6. Recharge (yalnız ElectricCar)");
            System.out.println("7. Enable Autopilot");
            System.out.println("8. Disable Autopilot");
            System.out.println("9. Sensorları dəyiş (məs: kamera/radar on/off)");
            System.out.println("0. Çıx");

            System.out.print("Secim edin: ");
            try {
                choice = scanner.nextInt();
            }catch(Exception e){
                System.out.println("Zəhmət olmasa düzgün rəqəm daxil edin.");
            }finally {
                scanner.nextLine();
            }
            switch (choice){
                case 1 -> {
                    System.out.println("------Masin siyahisi-------");
                    cars.forEach(car -> System.out.println(car));
                }
                case 2 -> {
                    System.out.println("Ne qeder benzin vuraq: ");
                    double fuel = scanner.nextDouble();
//                    car.refuel(fuel);
                }
                case 3 -> {
                    System.out.print("Ne qeder sarj edek.");
                    int sarj = scanner.nextInt();
//                    car.reWatt(sarj);
                }
                case 4 -> System.out.println();
                case 0 -> System.out.println("Programnan cixilir.");
                default -> System.out.println("Sehv secim edilib!");
            }
        }while(choice != 0);
    }
}