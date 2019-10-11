package com.company;

import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.File;
import java.io.IOException;

public class Validation {

        public static void main(String[] args) {
            String language = XMLConstants.W3C_XML_SCHEMA_NS_URI;
            String fileName = "xml_file1.xml";
            String schemaName = "xml_file2.xsd";
            Schema schema = null;
            SchemaFactory factory = SchemaFactory.newInstance(language);
            try {
                // создание схемы
                schema = factory.newSchema(new File(schemaName));
                // создание валидатора на основе схемы
                Validator validator = schema.newValidator();
                // проверка документа
                Source source = new StreamSource(fileName);
                validator.validate(source);
                System.out.println("Валидация выполнена " + fileName);
            } catch (SAXException e) {
                System.err.println("Валидация не выполнена " + fileName + " ошибка  "
                        + e.getMessage());
            } catch (IOException e) {
                System.err.print(fileName + " валидация не ввыполнена " + e.getMessage());
            }
        }

    }
