package com.company;

public class NotificationListener implements Subcribers {

    private String notification;

    public NotificationListener(String notification) {
        this.notification = notification;
    }

    public void update( String name) {
        System.out.println("Newspapers " + notification +  " new newspaper " + name);
    }
}