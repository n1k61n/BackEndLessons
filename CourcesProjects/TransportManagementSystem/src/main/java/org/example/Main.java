package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Vehicle vehicle;

    public static void main(String[] args) throws NotEnoughFuelEXCEPTION {
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("--- Transport Sistemi ---");
            System.out.println("1. Avtomobil əlavə et");
            System.out.println("2. Avtobus əlavə et");
            System.out.println("3. Velosiped əlavə et");
            System.out.println("4. Bütün nəqliyyatları göstər");
            System.out.println("5. Sürmək");
            System.out.println("6. Yanacaq əlavə et");
            System.out.println("0. Çıxış");
            System.out.print("Secim edin: ");

            String choice = scanner.next();
            switch (choice){
                case "1":
                    System.out.print("Masinin modelini daxil edin: ");
                    String model = scanner.next();
                    System.out.print("yanacaq daxil edin: ");
                    double  fuel = Double.parseDouble(scanner.next());
                    System.out.print("Sureti daxil edin: ");
                    double speed = Double.parseDouble(scanner.next());
                    vehicle = new Car(model, fuel, speed, 250);
                    System.out.println("Masin ugurla elave edildi.");
                    vehicles.add(vehicle);
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    vehicles.forEach(Vehicle::showInfo);
                    break;
                case "5":
                    System.out.print("Mesafeni dexil edin: ");
                    double km = Double.parseDouble(scanner.next());
                    if(vehicle instanceof Car car){
                        car.drive(km);
                    }else{
                        System.out.println("Masin secilmeyib.");
                    }
                    break;
                case "6":
                    System.out.print("Ne qeder yanacaq: ");
                    if(vehicle instanceof Car car){
                        double refuel = scanner.nextDouble();
                        car.refuel(refuel);
                    }
                    break;
                case "0":
                    System.out.println("Program bitdi..");
                    return;
                default:
                    System.out.println("Sehv secim etmisiniz..");
            }
        }
    }
}


