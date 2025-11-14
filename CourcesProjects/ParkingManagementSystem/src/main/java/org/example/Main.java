package org.example;




import org.example.vehicle.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Vehicle> vehicles = new ArrayList<>();
        int choice;
        while(true){
            System.out.println("\nMenu:");
            System.out.println("1. Yeni nəqliyyat daxil et.");
            System.out.println("2. Çıxış et və ödəniş hesabla");
            System.out.println("3. Mövcud nəqliyyatları göstər");
            System.out.println("4. Çıx");
            System.out.print("Secim et: ");

            choice = Integer.parseInt(scanner.nextLine());
            if(choice == 4) break;
            switch (choice){
                case 1:
                    System.out.println("Masinin brandini, modelini, nomresini ve novunu qeyd edin:");
                    String[] vehicleInfo = scanner.nextLine().split(" ");
                    if(vehicleInfo.length != 4) System.out.println( "Zəhmət olmasa 4 məlumat daxil edin: brand, model, nomre, nov.");
                    else {
                        String brand = vehicleInfo[0];
                        String model = vehicleInfo[1];
                        String plate = vehicleInfo[2];

                        int carType = Integer.parseInt(vehicleInfo[3]);
                        switch (carType) {
                            case 1 -> vehicles.add(new Car(brand, model, plate));
                            case 2 -> vehicles.add(new Truck(brand, model, plate));
                            case 3 -> vehicles.add(new Motorcycle(brand, model, plate));
                            default -> System.out.println("Sehv secim etmisiniz.");
                        }

                    }
                    break;
                case 2:
                    System.out.println("Cixan masinin ID-ni daxil edin.");
                    int id = Integer.parseInt(scanner.nextLine());
                    Iterator<Vehicle> it = vehicles.iterator();
                    while(it.hasNext()){
                        Vehicle selected =  it.next();
                        if(selected.getId() == id) {
                            it.remove();
                            System.out.println("Odenilmeli menleg: " + selected.calculateFee() + " AZN");
                            break;
                        }
                    }
                    break;
                case 3:
                    if(vehicles.isEmpty()) System.out.println("Parkovkada masin yoxdur.");
                    else vehicles.forEach(vehicle -> System.out.println(vehicle));
                    break;
                default:
                    System.out.println("Duzgin secim edilmeyib...");
            }


        }

        System.out.println("Program cixilir...");
        scanner.close();
    }
}