package org.example;

class DoubleRoom extends Room {
    public DoubleRoom(int roomNumber) {
        super(roomNumber, 80.0);
    }

    @Override
    public void showInfo() {
        System.out.print("Double Room - ");
        super.showInfo();
    }
}
