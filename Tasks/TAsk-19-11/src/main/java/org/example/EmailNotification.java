package org.example;

public class EmailNotification implements Notification{
    @Override
    public String send() {
        return "Email notificatin";
    }
}
