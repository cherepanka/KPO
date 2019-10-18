package com.company;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class Main {

    public static void main(String[] args) throws IOException
    {
        Timetable timetable = new Timetable();
        timetable.subject("math");
        timetable.teachers("Popov Vasilii Viktorovich");

        Teachers teachers = new Teachers();
        teachers.number_of_pairs(5);
        teachers.subject("math");
        teachers.teachersName("Petrov Viktor Viktorovich");
        teachers.number_of_students(25);

        Subject subject = new Subject();
        subject.time(45);
        subject.classrooms(212);
        subject.subjectName("Math");

        System.out.println(teachers);
        serializeToXML (timetable);
        Timetable loadedSettings = deserializeFromXML();

        System.out.println(loadedSettings);

        System.out.println(subject);
        serializeToXML (timetable);

        System.out.println(timetable);
        serializeToXML (timetable);
    }

    private static void serializeToXML (Timetable timetable) throws IOException
    {
        FileOutputStream fos = new FileOutputStream("xml_file1.xml");
        XMLEncoder encoder = new XMLEncoder(fos);
        encoder.setExceptionListener( e -> System.out.println("Exception! :"+e.toString()) );
        encoder.writeObject(timetable);
        encoder.close();
        fos.close();
    }

    private static Timetable deserializeFromXML() throws IOException {
        FileInputStream fis = new FileInputStream("xml_file1.xml");
        XMLDecoder decoder = new XMLDecoder(fis);
        Timetable decodedSettings = (Timetable) decoder.readObject();
        decoder.close();
        fis.close();
        return decodedSettings;
    }
}