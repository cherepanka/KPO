package com.company;

public class Main {

    public static void main(String[] args) {
        Mail mail = new Mail();
        mail.publish.subscribe("get", new Newspaper("Earth"));
        mail.publish.subscribe("send", new NotificationListener("article 5"));

        try {
            mail.get("Earth");
            mail.send();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    }
