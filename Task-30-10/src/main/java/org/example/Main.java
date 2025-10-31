package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Car car = new Car("BMW", "M5", 2020, 10, 20);
        int choice = 0;
        do{
            System.out.println("\nMENU:");
            System.out.println("1. Mesafe sur.");
            System.out.println("2. Benzin vur.");
            System.out.println("3. Sarj et.");
            System.out.println("4. Melumati goster.");
            System.out.println("5. Cixis.");
            System.out.print("Secim edin: ");
            try {
                choice = scanner.nextInt();
                switch (choice){
                    case 1 -> {
                        System.out.println("Ne qeder mesafe surulecek: ");
                        int distance = scanner.nextInt();
                        car.drive(distance);
                    }
                    case 2 -> {
                        System.out.println("Ne qeder benzin vuraq: ");
                        double fuel = scanner.nextDouble();
                        car.refuel(fuel);
                    }
                    case 3 -> {
                        System.out.print("Ne qeder sarj edek.");
                        int sarj = scanner.nextInt();
                        car.reWatt(sarj);
                    }
                    case 4 -> System.out.println(car);
                    case 5 -> System.out.println("Programnan cixilir.");
                    default -> System.out.println("Sehv secim edilib!");
                }
            }catch(InputMismatchException e){
                System.out.println("Zəhmət olmasa düzgün rəqəm daxil edin.");
            }



        }while(choice != 5);



    }
}