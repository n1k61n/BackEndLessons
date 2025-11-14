package org.example.interfaces;

import org.example.exceptions.DeviceOverloadException;

public interface Switchable{
    void turnOn() throws DeviceOverloadException;
    void turnoff();
    
}
