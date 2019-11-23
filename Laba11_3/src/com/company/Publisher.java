package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Publisher {

    Map<String, List<Subcribers>> listeners = new HashMap<>();

    public Publisher(String... operations) {
        for (String operation : operations) {
            this.listeners.put(operation, new ArrayList<>());
        }
    }

    public void subscribe(String eventType, Subcribers listener) {
        List<Subcribers> users = listeners.get(eventType);
        users.add(listener);
    }


    public void notify(String eventType, String name) {
        List<Subcribers> users = listeners.get(eventType);
        for (Subcribers listener : users) {
            listener.update(name);
        }
    }
}