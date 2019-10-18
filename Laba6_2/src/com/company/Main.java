package com.company;


import javax.xml.bind.helpers.AbstractMarshallerImpl;
import java.io.FileWriter;


public class Main {


    private static AbstractMarshallerImpl Marshaller;

    public static void main(String[] args) {
        try {
            TimeTable timeTable = new TimeTable("Math", "8:30", "G-212");
            FileWriter writer = new FileWriter("timetable.xml");
            Marshaller.marshal(timeTable, writer);
        } catch (Exception e) {
            System.err.println(e.getMessage());
            e.printStackTrace(System.err);
        }
    }

    public static void setMarshaller(AbstractMarshallerImpl marshaller) {
        Marshaller = marshaller;
    }
}
