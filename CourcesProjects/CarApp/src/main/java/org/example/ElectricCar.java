package org.example;



public class ElectricCar extends Car implements Rechargeable {
    private double batteryKWh;
    private double batteryCapacityKWh;
    private double consumptionKWhPer100Km;
    private int regenPercent;

    public ElectricCar(String brand, String model, int year, SensorSuite sensors,
                       double batteryCapacityKWh, double consumptionKWhPer100Km, int regenPercent) {
        super(brand, model, year, sensors);
        this.batteryCapacityKWh = batteryCapacityKWh;
        this.consumptionKWhPer100Km = consumptionKWhPer100Km;
        this.regenPercent = regenPercent;
        this.batteryKWh = batteryCapacityKWh * 0.6; // 60% dolu
    }

    @Override
    public boolean hasEnoughEnergyFor(double km) {
        double needed = km * consumptionKWhPer100Km / 100;
        return batteryKWh >= needed;
    }

    @Override
    protected void consumeFor(double km) {
        double used = km * consumptionKWhPer100Km / 100;
        batteryKWh -= used;
        double regen = used * regenPercent / 100.0;
        batteryKWh = Math.min(batteryCapacityKWh, batteryKWh + regen);
    }

    @Override
    public void recharge(double kWh) {
        if (kWh <= 0) throw new IllegalOperationException("Invalid recharge amount.");
        if (batteryKWh + kWh > batteryCapacityKWh)
            throw new IllegalOperationException("Battery overflow!");
        batteryKWh += kWh;
        System.out.println("Recharged " + kWh + " kWh. Current: " + batteryKWh + " kWh.");
    }

    @Override
    public String toString() {
        return super.toString() + " | Battery: " + batteryKWh + " kWh";
    }
}
