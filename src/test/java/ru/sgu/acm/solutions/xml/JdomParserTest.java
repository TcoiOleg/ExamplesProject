package ru.sgu.acm.solutions.xml;

import org.jdom.Document;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

/**
 * User: 1
 * Date: 29.07.15
 */
public class JdomParserTest {

    @Test
    public void testParser() throws JDOMException, IOException {
        String path = "/src/main/resources/ru/sgu/acm/solutions/xml/config/executorConfiguration.xml";
        SAXBuilder saxBuilder = new SAXBuilder();
        File xmlFile = new File(System.getProperty("user.dir") + path);
        Document xmlDocument = saxBuilder.build(xmlFile);
        System.out.println("root text " + xmlDocument.getRootElement().getValue());
        System.out.println("child text " + xmlDocument.getRootElement().getChild("eee").getText());
        System.out.println("child value" + xmlDocument.getRootElement().getChild("dsf").getValue());
    }
}
