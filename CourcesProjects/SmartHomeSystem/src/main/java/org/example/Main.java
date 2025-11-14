package org.example;

import org.example.devices.SmartFan;
import org.example.devices.SmartHeater;
import org.example.devices.SmartLight;
import org.example.exceptions.DeviceOverloadException;
import org.example.exceptions.InvalidOperationException;
import org.example.interfaces.Adjustable;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


// Main CLI
public class Main {
    private static final int POWER_LIMIT = 100;
    private static List<SmartDevice> devices = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        devices.add(new SmartLight("Living Room Light", 10));
        devices.add(new SmartHeater("Bedroom Heater", 30));
        devices.add(new SmartFan("Kitchen Fan", 20));


        while (true) {
            System.out.println("\n📱 Smart Home Menu:");
            for (int i = 0; i < devices.size(); i++) {
                SmartDevice  d = devices.get(i);
                System.out.printf("%d. %s (%s) - %s\n", i + 1, d.getName(), d.isOn() ? "On" : "Off", d.getStatus());
            }
            System.out.println("0. Exit");

            System.out.print("Select device: ");
            int choice = scanner.nextInt();
            if (choice == 0) break;
            if (choice < 1 || choice > devices.size()) continue;

            SmartDevice  device = devices.get(choice - 1);

            System.out.println("1. Turn On\n2. Turn Off\n3. Increase Level\n4. Decrease Level\n5. Show Total Power Usage");
            int action = scanner.nextInt();

            try {
                switch (action) {
                    case 1:
                        if (getTotalPowerUsage() + device.powerUsage > POWER_LIMIT)
                            throw new DeviceOverloadException("⚠️ Power limit exceeded!");
                        device.turnOn();
                        System.out.println("✅ Turned On");
                        break;
                    case 2:
                        device.turnOff();
                        System.out.println("✅ Turned Off");
                        break;
                    case 3:
                        if (device instanceof Adjustable)
                            ((Adjustable) device).increaseLevel();
                        break;
                    case 4:
                        if (device instanceof Adjustable)
                            ((Adjustable) device).decreaseLevel();
                        break;
                    case 5:
                        System.out.println("🔌 Total Power Usage: " + getTotalPowerUsage() + "W");
                        break;
                }
            } catch (DeviceOverloadException | InvalidOperationException e) {
                System.out.println("❌ Error: " + e.getMessage());
            }
        }

        System.out.println("👋 Çıxılır...");
        scanner.close();
    }

    private static int getTotalPowerUsage() {
        return devices.stream().mapToInt(SmartDevice ::getPowerUsage).sum();
    }
}
