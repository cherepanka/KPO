package com.company;

public class Mail {
    public Publisher publish;
    private String name;

    public Mail() {
        this.publish = new Publisher("get", "send");
    }

    public void get(String name) {
        this.name = name;
        publish.notify("get", name);
    }

    public void send() throws Exception {
        if (this.name != null) {
            publish.notify("send", name);
        }
    }
}