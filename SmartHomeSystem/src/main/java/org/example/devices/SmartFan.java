package org.example.devices;

import org.example.SmartDevice;
import org.example.exceptions.InvalidOperationException;
import org.example.interfaces.Adjustable;
import org.example.interfaces.Switchable;

public class SmartFan extends SmartDevice implements  Adjustable {
    private int speed;

    public SmartFan(String name, int powerUsage) {
        super(name, powerUsage);
        this.speed = 0;
    }


    @Override
    public String getStatus() {
        return "Speed: " + speed;
    }

    @Override
    public void increaseLevel() throws InvalidOperationException {
        if(!isOn) throw new InvalidOperationException("Fan is Off!");
        speed += 1;
    }

    @Override
    public void decreaseLevel() throws InvalidOperationException {
        if(!isOn) throw new InvalidOperationException("Fan is off!");
        speed = Math.max(0, speed - 1);
    }

    @Override
    public void turnoff() {

    }
}
