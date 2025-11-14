package org.example;

import org.example.exceptions.DeviceOverloadException;
import org.example.interfaces.Switchable;

// Abstract Base Class
public abstract class SmartDevice implements Switchable {
    protected String name;
    protected boolean isOn;
    protected int powerUsage;

    public SmartDevice(String name, int powerUsage) {
        this.name = name;
        this.powerUsage = powerUsage;
        this.isOn = false;
    }

    public String getName() { return name; }
    public boolean isOn() { return isOn; }
    public int getPowerUsage() { return isOn ? powerUsage : 0; }

    public void turnOn() throws DeviceOverloadException {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
    }

    public abstract String getStatus();
}
