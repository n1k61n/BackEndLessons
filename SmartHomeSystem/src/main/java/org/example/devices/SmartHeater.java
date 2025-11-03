package org.example.devices;

import org.example.SmartDevice ;
import org.example.exceptions.InvalidOperationException;
import org.example.interfaces.Adjustable;

public class SmartHeater extends SmartDevice  implements Adjustable {
    private int temperature;

    public SmartHeater(String name, int powerUsage) {
        super(name, powerUsage);
        this.temperature = 20;
    }

    @Override
    public void increaseLevel() throws InvalidOperationException {
        if(!isOn) throw new InvalidOperationException("Heater is Off!");
        temperature += 1;
    }

    @Override
    public void decreaseLevel() throws InvalidOperationException {
        if(!isOn) throw new InvalidOperationException("Heater is off!");
        temperature -= 1;
    }

    @Override
    public String getStatus() {
        return "Temperature: " + temperature + "°C";
    }

    @Override
    public void turnoff() {

    }
}
