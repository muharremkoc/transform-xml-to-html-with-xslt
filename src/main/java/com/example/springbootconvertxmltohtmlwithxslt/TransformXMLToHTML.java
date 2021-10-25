package com.example.springbootconvertxmltohtmlwithxslt;

import javax.xml.transform.*;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class TransformXMLToHTML {
    public static void main(String[] args) {
        try {
            TransformerFactory tFactory=TransformerFactory.newInstance();

            Source xslDoc=new StreamSource("Yourpath:/filename.xslt");
            Source xmlDoc=new StreamSource("Yourpath:/filename.xml");

            String outputFileName="test.html";

            OutputStream htmlFile=new FileOutputStream(outputFileName);
            Transformer trasform=tFactory.newTransformer(xslDoc);
            trasform.transform(xmlDoc, new StreamResult(htmlFile));
        } catch (FileNotFoundException | TransformerFactoryConfigurationError | TransformerException e)
        {
            e.printStackTrace();
        }
    }
}

