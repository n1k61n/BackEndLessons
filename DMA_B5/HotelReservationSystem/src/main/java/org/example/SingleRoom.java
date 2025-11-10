package org.example;

class SingleRoom extends Room {
    public SingleRoom(int roomNumber) {
        super(roomNumber, 50.0);
    }

    @Override
    public void showInfo() {
        System.out.print("Single Room - ");
        super.showInfo();
    }
}
