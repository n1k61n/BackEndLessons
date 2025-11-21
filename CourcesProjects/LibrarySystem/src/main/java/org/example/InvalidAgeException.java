package org.example;

// Custom checked exception
public class InvalidAgeException extends Exception {
    // Constructor with a message
    public InvalidAgeException(String message) {
        super(message);
    }
}
