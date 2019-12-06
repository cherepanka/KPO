package com.company;


import javax.security.auth.Subject;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;


public class MarshalMain {
    public static void main(String[] args) {
        try {
            JAXBContext context = JAXBContext.newInstance( Subject.class );
            Marshaller m = context.createMarshaller();
            Subject st = new Subject() { // анонимный класс
                {
                    Subject.Name name = new Suject.Name( "Math", "Physics");
                    Subject s;
                    s = new Subject( "8.30", "TTp.1-16-1", "2454",  name );
                    this.add( s );     // добавление второго студента

                }
            };
            m.marshal( st, new FileOutputStream( "Response.xml" ) );
            m.marshal( st, System.out ); // копия на консоль
            System.out.println( "XML-файл создан" );
        } catch (FileNotFoundException e) {
            System.out.println( "XML-файл не может быть создан: " + e );
        } catch (JAXBException e) {
            System.out.println( "JAXB-контекст ошибочен " + e );
        }
    }
}