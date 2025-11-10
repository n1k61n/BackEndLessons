package org.example;

import org.example.cartype.ElectricCar;
import org.example.cartype.GasCar;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new GasCar("BMW", "M5", 2020, 68, 10.5));
        cars.add(new ElectricCar("TESLA", "Model S", 2025, 100, 17.5, 19));
        Scanner scanner = new Scanner(System.in);

        Car car = null;
        int choice = -1;
        do {
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
            System.out.println();

            try {
                choice = Integer.parseInt(choiceItem(scanner, "Secim edin: "));
                switch (choice) {
                    case 1 -> {
                        System.out.println("------Masin siyahisi-------");
                        cars.forEach(c -> c.carsInfo());
                        int indexCar = Integer.parseInt(choiceItem(scanner, "Maşını seç: "));
                        car = cars.get(indexCar - 1);
                        System.out.println(car);
                    }
                    case 2 -> {
                        if (car != null) {
                            car.start();
                            System.out.println(car);
                        } else
                            System.out.println("Masin secim etmemisiniz");
                    }
                    case 3 -> {
                        if (car != null) {
                            car.stop();
                            System.out.println(car);
                        } else
                            System.out.println("Masin secim etmemisiniz");

                    }
                    case 4 -> {
                        double km = Double.parseDouble(choiceItem(scanner, "Mesafeni seç: "));
                        car.drive(km);
                        System.out.println(car);
                    }
                    case 5 -> {
                        if (car instanceof GasCar g) {
                            double fuel = Double.parseDouble(choiceItem(scanner, "Ne qeder benzin varmaq isterdiniz: "));
                            g.refuel(fuel);
                            System.out.println(g);
                        }
                    }
                    case 6 ->{
                        if(car instanceof ElectricCar e) {
                            double charge = Double.parseDouble(choiceItem(scanner, "Ne qeder sarj etmek isterdiniz: "));
                            e.recharge(charge);
                            System.out.println(e);
                        }
                    }
                    case 7 ->{
                        car.enableAutopilot();
                        System.out.println(car);
                    }
                    case 8 ->{
                        car.disableAutopilot();
                        System.out.println(car);
                    }
                    case 9 ->{
                        System.out.println("0. Hamisini.");
                        System.out.println("1. Camera On/Off.");
                        System.out.println("2. Radar On/Off.");
                        System.out.println("3. Lidar On/Off.");
                        System.out.println("4. Lane Assist On/Off");
                        System.out.println("5. GPS On/Off.");
                        int i = Integer.parseInt(choiceItem(scanner, "Hansi radari qosaq: "));
                        car.sensorsControl(i);
                        System.out.println(car);
                    }
                    case 0 -> System.out.println("Programnan cixilir.");
                    default -> System.out.println("Sehv secim edilib!");
                }
            } catch (Exception e) {
                System.out.println("Duzgun secim edilmeyib!");
            }
        } while (choice != 0) ;
    }

    static String choiceItem(Scanner scanner, String message){
        System.out.print(message);
        return scanner.nextLine();
    }
}