package org.example.interfaces;

import org.example.exceptions.InvalidOperationException;

public interface Adjustable{
    void increaseLevel() throws InvalidOperationException;
    void decreaseLevel() throws InvalidOperationException;
}
