package com.salcedoFawcett.services.parameterData.domain.service;

import com.salcedoFawcett.services.parameterData.domain.model.XMLReader.DataListXML;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

@Service
public class ParameterFileService {

    @Autowired
    private ResourceLoader resourceLoader;

    public DataListXML readXmlFile(String filePath) throws ParserConfigurationException, IOException, SAXException, JAXBException {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder = dbf.newDocumentBuilder();
        Document document = docBuilder.parse(resourceLoader.getResource(filePath).getInputStream());

        JAXBContext jaxbContext   = JAXBContext.newInstance( DataListXML.class );
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

        Node node = document.getElementsByTagName("SimpleCodeList").item(0);

        JAXBElement<DataListXML> data = jaxbUnmarshaller.unmarshal(node, DataListXML.class);

        return data.getValue();
    }
}
