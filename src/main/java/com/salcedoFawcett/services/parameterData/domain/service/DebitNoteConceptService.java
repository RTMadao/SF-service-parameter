package com.salcedoFawcett.services.parameterData.domain.service;

import com.salcedoFawcett.services.parameterData.domain.model.DebitNoteConcept;
import com.salcedoFawcett.services.parameterData.domain.model.XMLReader.DataListXML;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.xml.sax.SAXException;

import javax.xml.bind.JAXBException;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class DebitNoteConceptService {
    @Autowired
    private ParameterFileService parameterFileService;

    public List<DebitNoteConcept> getList() {
        DataListXML data = null;
        try {
            data = parameterFileService.readXmlFile("classpath:parameter/xml/ConceptoNotaDebito-2.1.gc");
            return data.getRows().stream().map(row -> new DebitNoteConcept(row.getValues().get(0).getValue(),row.getValues().get(1).getValue())).collect(Collectors.toList());
        } catch (ParserConfigurationException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (SAXException e) {
            throw new RuntimeException(e);
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }
    }
}
