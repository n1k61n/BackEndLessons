package org.example;



import java.util.*;
import java.time.*;

// ✅ Interface
interface Payable {
    double calculateFee();
}

// ✅ Abstract class
abstract class Vehicle implements Payable {
    protected String plateNumber;
    protected LocalDateTime entryTime;
    protected LocalDateTime exitTime;

    public Vehicle(String plateNumber, LocalDateTime entryTime) {
        this.plateNumber = plateNumber;
        this.entryTime = entryTime;
    }

    public void setExitTime(LocalDateTime exitTime) {
        this.exitTime = exitTime;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public abstract double getRatePerHour();

    @Override
    public double calculateFee() {
        if (exitTime.isBefore(entryTime)) {
            throw new IllegalExitException("❌ Exit time cannot be before entry time!");
        }
        long hours = Duration.between(entryTime, exitTime).toHours();
        if (hours == 0) hours = 1; // minimum 1 hour
        return hours * getRatePerHour();
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " | Plate: " + plateNumber +
                " | Entry: " + entryTime +
                (exitTime != null ? " | Exit: " + exitTime : "");
    }
}

// ✅ Different vehicle types
class Car extends Vehicle {
    public Car(String plateNumber, LocalDateTime entryTime) {
        super(plateNumber, entryTime);
    }

    @Override
    public double getRatePerHour() {
        return 2.0;
    }
}

class Motorcycle extends Vehicle {
    public Motorcycle(String plateNumber, LocalDateTime entryTime) {
        super(plateNumber, entryTime);
    }

    @Override
    public double getRatePerHour() {
        return 1.0;
    }
}

class Truck extends Vehicle {
    public Truck(String plateNumber, LocalDateTime entryTime) {
        super(plateNumber, entryTime);
    }

    @Override
    public double getRatePerHour() {
        return 3.0;
    }
}

// ✅ Custom Exception
class IllegalExitException extends RuntimeException {
    public IllegalExitException(String message) {
        super(message);
    }
}

// ✅ Main Parking Management System
public class ParkingSystem {
    private static List<Vehicle> parkedVehicles = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n🚗 PARKING MANAGEMENT SYSTEM");
            System.out.println("1. Yeni nəqliyyat daxil et");
            System.out.println("2. Çıxış et və ödəniş hesabla");
            System.out.println("3. Mövcud nəqliyyatları göstər");
            System.out.println("4. Çıx");
            System.out.print("Seçiminiz: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> addVehicle();
                case 2 -> exitVehicle();
                case 3 -> showVehicles();
                case 4 -> {
                    System.out.println("👋 Proqram bitdi!");
                    return;
                }
                default -> System.out.println("Yanlış seçim!");
            }
        }
    }

    private static void addVehicle() {
        System.out.print("Nəqliyyat növü (car/motorcycle/truck): ");
        String type = scanner.nextLine().toLowerCase();

        System.out.print("Nömrə daxil edin: ");
        String plate = scanner.nextLine();

        LocalDateTime now = LocalDateTime.now();
        Vehicle vehicle;

        switch (type) {
            case "car" -> vehicle = new Car(plate, now);
            case "motorcycle" -> vehicle = new Motorcycle(plate, now);
            case "truck" -> vehicle = new Truck(plate, now);
            default -> {
                System.out.println("❌ Yanlış növ!");
                return;
            }
        }

        parkedVehicles.add(vehicle);
        System.out.println("✅ Nəqliyyat əlavə edildi: " + vehicle);
    }

    private static void exitVehicle() {
        System.out.print("Çıxan nəqliyyatın nömrəsini daxil edin: ");
        String plate = scanner.nextLine();

        for (Vehicle v : parkedVehicles) {
            if (v.getPlateNumber().equalsIgnoreCase(plate)) {
                v.setExitTime(LocalDateTime.now());

                try {
                    double fee = v.calculateFee();
                    System.out.println("💰 Ödəniş məbləği: " + fee + " AZN");
                    parkedVehicles.remove(v);
                } catch (IllegalExitException e) {
                    System.out.println(e.getMessage());
                }
                return;
            }
        }
        System.out.println("❌ Bu nömrəli nəqliyyat tapılmadı!");
    }

    private static void showVehicles() {
        if (parkedVehicles.isEmpty()) {
            System.out.println("📭 Hazırda heç bir nəqliyyat yoxdur.");
        } else {
            System.out.println("🚘 Mövcud nəqliyyatlar:");
            for (Vehicle v : parkedVehicles) {
                System.out.println(" - " + v);
            }
        }
    }
}
