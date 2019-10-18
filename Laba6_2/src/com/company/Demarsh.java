package com.company;

import javax.xml.bind.Unmarshaller;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Iterator;
import java.util.List;


public class Demarsh {

    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader( "timeTable.xml" );
            TimeTable timeTable = (TimeTable) Unmarshaller.unmarshal( TimeTable.class, reader );
            System.out.println( "TimeTable SubjectName: " + timeTable.getSubjectName() );
            System.out.println( "TimeTable Time: " + timeTable.getTime() );
            System.out.println( "TimeTable Classroom: " + timeTable.getClassroom() );
            List Subject = subject.getSubject();
            for (Iterator i = timeTable.iterator(); i.hasNext(); ) {
                TimeTable timeTable = (TimeTable) i.next();
                System.out.println( "Author: " + timeTable.getFirstName() + " " +
                        timeTable.getLastName() );
            }

            System.out.println();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

