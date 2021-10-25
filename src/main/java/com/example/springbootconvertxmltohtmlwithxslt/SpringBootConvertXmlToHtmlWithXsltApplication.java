package com.example.springbootconvertxmltohtmlwithxslt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.*;
import java.net.URL;

@SpringBootApplication
public class SpringBootConvertXmlToHtmlWithXsltApplication {



    public static void main(String[] args) {

        SpringApplication.run(SpringBootConvertXmlToHtmlWithXsltApplication.class, args);

    }


}
