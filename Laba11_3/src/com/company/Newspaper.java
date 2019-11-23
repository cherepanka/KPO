package com.company;

public class Newspaper implements Subcribers {

    private String newspaper;

    Newspaper(String name) {
        this.newspaper = name;
    }

    @Override
    public void update(String name) {
        System.out.println("Get " + newspaper +  " new newspapers " + name);

    }
}