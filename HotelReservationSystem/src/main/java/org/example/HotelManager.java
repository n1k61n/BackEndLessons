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
        for (Room room : rooms) {
            room.showInfo();
        }
    }

    public void bookRoom(int roomNumber) {
        for (Room room : rooms) {
            if (room.getRoomNumber() == roomNumber) {
                room.bookRoom();
                return;
            }
        }
        System.out.println("Otaq tapılmadı.");
    }

    public void cancelBooking(int roomNumber) {
        for (Room room : rooms) {
            if (room.getRoomNumber() == roomNumber) {
                room.cancelBooking();
                return;
            }
        }
        System.out.println("Otaq tapılmadı.");
    }
}