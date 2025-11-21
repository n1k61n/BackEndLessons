package org.example.cartype;


import org.example.Car;
import org.example.CarType;
import org.example.interfaces.Rechargeable;

/**
 * ElectricCar
 * Sahələr:
 * double batteryKWh, double batteryCapacityKWh
 * double consumptionKWhPer100Km (kWh/100km)
 * int regenPercent (fren zamanı bərpa % — opsional)
 * Xüsusi:
 * recharge(double kWh) (kapasite limiti)
 * hasEnoughEnergyFor(km) → lazımi kWh hesabla
 * consumeFor(km) → enerjidən çıx, istəsən regen tətbiq et (məs: drive() sonunda 3–5% geri qayıtsın)
 */
public class ElectricCar extends Car implements Rechargeable {
    private double batteryKWh;
    private double batteryCapacityKWh;
    private double consumptionKWhPer100Km; //(KWh / 100)
    private int regenPercent; //(fren zamanı bərpa % — opsional)

    public ElectricCar(String brand, String model, int year,  double batteryCapacityKWh, double consumptionKWhPer100Km, int regenPercent) {
        super(brand, model, year);
        this.batteryKWh = batteryCapacityKWh;
        this.batteryCapacityKWh = batteryCapacityKWh;
        this.consumptionKWhPer100Km = consumptionKWhPer100Km;
        this.regenPercent = regenPercent;
    }



    //lazımi kWh hesabla
    @Override
    protected boolean hasEnoughEnergyFor(double km) {
        return (batteryKWh * consumptionKWhPer100Km) >= km;
    }

    @Override
    protected void  consumer(double km) {
        batteryKWh -= km / batteryCapacityKWh;
    }

    @Override
    public void drive(double km) {
        if(isRunning && hasEnoughEnergyFor(km)){
            consumer(km);
            odometerKm += km;
        }
        else if(!hasEnoughEnergyFor(km)) {
            System.out.println("Kifayet qeder sarj yoxdur.");
        }
        else System.out.println("Masin islek veziyetde deyil!");
    }



    //Hər əməliyyatdan sonra cari statusu göstərin (yanacaq/batareya, odometr, autopilot).
    @Override
    public String toString() {
        String info = super.toString() + "Batareya: %.2f. Mesafe: %.2f. Avtopilot: %s\n";
        return String.format(info, id, brand, model, year, batteryCapacityKWh, odometerKm, autopilotOn ? "On":"Off");
    }


    public double recharge(double kWh) {
        if(carType == CarType.ELECTRIC) {
            if (batteryCapacityKWh <= (batteryKWh + kWh)) {
                batteryKWh += kWh;
            }else
                System.out.println("Kifaet qeder yer yoxdur. Ancaq: " + (batteryCapacityKWh - batteryKWh));
        }
        else
            System.out.println("Masini ancaq sarj etmek olar!");
        return 0;
    }
}
