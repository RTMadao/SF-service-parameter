package com.salcedoFawcett.services.parameterData.domain.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.salcedoFawcett.services.parameterData.domain.model.PaymentMeans;
import com.salcedoFawcett.services.parameterData.domain.model.XMLReader.DataListXML;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;
import org.xml.sax.SAXException;

import javax.xml.bind.JAXBException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLStreamException;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PaymentMeansService {
    @Autowired
    private ParameterFileService parameterFileService;
    @Autowired
    private ResourceLoader resourceLoader;
    public List<PaymentMeans> getXMLList() throws JAXBException, IOException, XMLStreamException, ParserConfigurationException, SAXException {
        DataListXML data = parameterFileService.readXmlFile("classpath:parameter/xml/MediosPago-2.1.gc");
        return data.getRows().stream().map(row -> new PaymentMeans(row.getValues().get(0).getValue(),row.getValues().get(1).getValue())).collect(Collectors.toList());
    }
    public void generateJsonFile(){
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            objectMapper.writeValue(new File(resourceLoader
                    .getResource("classpath:parameter/json/MediosPago-2.1.json")
                    .getURI()),this.getXMLList());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        } catch (XMLStreamException e) {
            throw new RuntimeException(e);
        } catch (ParserConfigurationException e) {
            throw new RuntimeException(e);
        } catch (SAXException e) {
            throw new RuntimeException(e);
        }
    }
    public List<PaymentMeans> getList() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        File file = resourceLoader
                .getResource("classpath:parameter/json/MediosPago-2.1.json")
                .getFile();
        return objectMapper.readValue(file, new TypeReference<List<PaymentMeans>>(){});
    }
}
