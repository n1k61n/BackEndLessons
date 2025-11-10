package org.example;

class SuiteRoom extends Room {
    public SuiteRoom(int roomNumber) {
        super(roomNumber, 150.0);
    }

    @Override
    public void showInfo() {
        System.out.print("Suite Room - ");
        super.showInfo();
    }
}
