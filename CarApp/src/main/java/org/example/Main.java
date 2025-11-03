package org.example;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new GasCar("BMW", "M5", 2020, new SensorSuite(true, true, true, true, true), 60, 10));
        cars.add(new ElectricCar("Tesla", "Model 3", 2022, new SensorSuite(true, true, true, true, true), 75, 15, 5));

        Scanner sc = new Scanner(System.in);
        Car selected = null;

        while (true) {
            System.out.println("""
                    ==== CAR MENU ====
                    1) Maşını seç
                    2) Start
                    3) Stop
                    4) Drive
                    5) Refuel (yalnız GasCar)
                    6) Recharge (yalnız ElectricCar)
                    7) Enable Autopilot
                    8) Disable Autopilot
                    9) Sensor dəyiş
                    0) Çıx
                    """);

            System.out.print("Seçim: ");
            int choice = sc.nextInt();

            try {
                switch (choice) {
                    case 1 -> {
                        for (int i = 0; i < cars.size(); i++)
                            System.out.println(i + ") " + cars.get(i));
                            System.out.print("Index seç: ");
                            selected = cars.get(sc.nextInt());
                    }
                    case 2 -> selected.start();
                    case 3 -> selected.stop();
                    case 4 -> {
                        System.out.print("Km: ");
                        selected.drive(sc.nextDouble());
                    }
                    case 5 -> {
                        if (selected instanceof GasCar g) {
                            System.out.print("Liters: ");
                            g.refuel(sc.nextDouble());
                        } else System.out.println("Bu maşın benzinli deyil!");
                    }
                    case 6 -> {
                        if (selected instanceof ElectricCar e) {
                            System.out.print("kWh: ");
                            e.recharge(sc.nextDouble());
                        } else System.out.println("Bu maşın elektrikli deyil!");
                    }
                    case 7 -> selected.enableAutopilot();
                    case 8 -> selected.disableAutopilot();
                    case 9 -> {
                        System.out.print("Sensor adı (camera/radar/lidar/gps/laneassist): ");
                        String sName = sc.next();
                        System.out.print("Yeni status (true/false): ");
                        boolean sStatus = sc.nextBoolean();
                        selected.sensors.setSensor(sName, sStatus);
                    }
                    case 0 -> {
                        System.out.println("Çıxılır...");
                        return;
                    }
                    default -> System.out.println("Yanlış seçim!");
                }
            } catch (Exception e) {
                System.out.println("Xəta: " + e.getMessage());
            }

            if (selected != null) selected.printStatus();
            System.out.println("----------------------");
        }
    }
}
