package com.company;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Sonnet {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sonnet(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    public Sonnet() {
        super();
    }
}
