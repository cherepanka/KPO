package com.company;

import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

import java.io.IOException;
import java.util.ArrayList;

public class SaxBuilder {

    SaxParser saxParser = null;
    ArrayList<Tariffs> tariffs = null;
    XMLReader xmlReader = null;
    public void saxParser() {
        try {

            saxParser = new SaxParser();
            xmlReader=XMLReaderFactory.createXMLReader();
            xmlReader.setContentHandler( saxParser );

        } catch (
                SAXException e) {
            e.printStackTrace();
        }
    }
    public ArrayList<Tariffs> getTariffs(){
        return saxParser.getTariffs();
    }
    public void builder(String filename){
        try {
            xmlReader.parse( filename );
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        }
        tariffs = getTariffs();
    }

}
