package com.company;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;

public class SaxParser extends DefaultHandler {

    private ArrayList<Tariffs> tariffs = null;
    private Tariffs current = null;

    public SaxParser(){
        tariffs = new ArrayList<Tariffs>();
    }
    public ArrayList<Tariffs> getTariffs(){
        return tariffs;
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        if ("tariffs".equals( localName )){
            current = new Tariffs();
            current.setTarrifName(attributes.getValue( 0 ));
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if ("tariffs".equals( localName )){
            tariffs.add(current);
        }
    }
}
