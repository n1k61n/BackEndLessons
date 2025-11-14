package org.example.devices;


import org.example.SmartDevice;
import org.example.exceptions.InvalidOperationException;
import org.example.interfaces.Adjustable;

public class SmartLight extends SmartDevice implements Adjustable {
    private int brightness;

    public SmartLight(String name, int powerUsage) {
        super(name, powerUsage);
        this.brightness = 0;
    }

    public void increaseLevel() throws  InvalidOperationException{
        if(!isOn) throw new InvalidOperationException("Light is off!");
        brightness += 10;
    }

    @Override
    public void decreaseLevel() throws InvalidOperationException {
        if(!isOn) throw new InvalidOperationException("Light is off!");
        brightness = Math.max(0, brightness - 10);
    }



    @Override
    public String getStatus() {
        return "Brightness: " + brightness;
    }


    @Override
    public void turnoff() {

    }
}
