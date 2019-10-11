package com.company;

import javax.xml.validation.Validator;

public class Main {

    public static void main(String[] args) {

       SaxBuilder saxBuilder = new SaxBuilder();
       saxBuilder.saxParser();
       saxBuilder.builder( "xml_file1.xml" );
       System.out.println( saxBuilder.getTariffs());

    }
}
