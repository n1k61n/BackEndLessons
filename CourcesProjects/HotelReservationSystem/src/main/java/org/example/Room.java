package org.example;

abstract class Room {
    protected int roomNumber;
    protected double price;
    protected boolean isBooked;

    public Room(int roomNumber, double price) {
        this.roomNumber = roomNumber;
        this.price = price;
        this.isBooked = false;
    }

    public int getRoomNumber() {
        return roomNumber;
    }




    public void showInfo() {
        System.out.println("Otaq #" + roomNumber + " | Qiymət: " + price + "₼ | Status: " + (isBooked ? "Rezerv olunub 🛏️" : "Boş ✅"));
        System.out.println("-".repeat(55));
    }
}
