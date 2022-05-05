package com.salcedoFawcett.services.parameterData.domain.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.salcedoFawcett.services.parameterData.domain.model.Unit;
import com.salcedoFawcett.services.parameterData.domain.model.XMLReader.DataListXML;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;
import org.xml.sax.SAXException;


import javax.xml.bind.*;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLStreamException;
import java.io.*;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UnitService {

    @Autowired
    private ParameterFileService parameterFileService;

    @Autowired
    private ResourceLoader resourceLoader;

    public List<Unit> getXMLList() throws JAXBException, IOException, XMLStreamException, ParserConfigurationException, SAXException {
        DataListXML data = parameterFileService.readXmlFile("classpath:parameter/xml/UnidadesMedida-2.1.gc");
        return data.getRows().stream().map(row -> new Unit(row.getValues().get(0).getValue(),row.getValues().get(1).getValue())).collect(Collectors.toList());
    }

    public void generateJsonFile(){
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            objectMapper.writeValue(new File(resourceLoader
                    .getResource("classpath:parameter/json/UnidadesMedida-2.1.json")
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

    public List<Unit> getList() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        File file = resourceLoader
                .getResource("classpath:parameter/json/UnidadesMedida-2.1.json")
                .getFile();

        return objectMapper.readValue(file, new TypeReference<List<Unit>>(){});
    }
}
