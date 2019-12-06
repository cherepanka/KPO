package com.company;

import javax.security.auth.Subject;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.FileNotFoundException;
import java.io.FileReader;


public class UnMarshalMain {
    public static void main(String[] args) {
        try {
            JAXBContext jc = JAXBContext.newInstance( SubjectRepository.class );
            Unmarshaller u = jc.createUnmarshaller();
            FileReader reader = new FileReader( "Response.xml" );
            Subject subject = (Subject) u.unmarshal( reader );
            System.out.println(subject);
        } catch (JAXBException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}