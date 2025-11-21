package org.example;

public final class NotificationFactory{
    public static Notification getNotification(String type){
        if(type == null)
            throw new IllegalArgumentException();
        if(type.equals("EMAIL")){
            return new EmailNotification();
        }
        if(type.equals("SMS")){
            return new SMSNotification();
        }
        return null;
    }
}
