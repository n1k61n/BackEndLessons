package org.example;

public class SMSNotification implements Notification {
    @Override
    public String send() {
        return "SMS notification";
    }
}
