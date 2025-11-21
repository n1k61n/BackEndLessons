package org.example;

import java.util.ArrayList;
import java.util.Scanner;

class HotelManager {
    private ArrayList<Room> rooms = new ArrayList<>();

    public HotelManager() {
        rooms.add(new SingleRoom(101));
        rooms.add(new DoubleRoom(102));
        rooms.add(new SuiteRoom(103));
        rooms.add(new SingleRoom(104));
        rooms.add(new DoubleRoom(105));
    }

    public void showAllRooms() {
        System.out.println("-".repeat(55));
        for (Room room : rooms) {
            room.showInfo();
        }
    }

    public void bookRoom(int roomNumber) {
        for (Room room : rooms) {
            if (room.getRoomNumber() == roomNumber) {
                if (!room.isBooked) {
                    room.isBooked = true;
                    System.out.println("Otaq rezerv olundu.");
                    break;
                }else{
                    System.out.println("Otaq rezerv olunub.");
                }
            }
        }
    }

    public void cancelBooking(int roomNumber) {
        for (Room room : rooms) {
            if (room.getRoomNumber() == roomNumber) {
                if(room.isBooked) {
                    room.isBooked = false;
                    System.out.println("Rezerv ləğv olundu.");
                    break;
                }else {
                    System.out.println("Rezerv ləğv olunmadi.");
                }
            }
        }
    }
}