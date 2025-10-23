package org.example;

class Room {
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

    public boolean isBooked() {
        return isBooked;
    }

    public void bookRoom() {
        if (!isBooked) {
            isBooked = true;
            System.out.println("Otaq rezerv olundu.");
        } else {
            System.out.println("Bu otaq artıq rezerv olunub.");
        }
    }

    public void cancelBooking() {
        if (isBooked) {
            isBooked = false;
            System.out.println("Rezerv ləğv olundu.");
        } else {
            System.out.println(" Bu otaq rezerv olunmayıb.");
        }
    }

    public void showInfo() {
        System.out.println("Otaq #" + roomNumber + " | Qiymət: " + price + "₼ | Status: " + (isBooked ? "Rezerv olunub 🛏️" : "Boş ✅"));
    }
}
