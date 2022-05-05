package com.salcedoFawcett.services.parameterData.domain.model.XMLReader;

import javax.xml.bind.annotation.XmlElement;
import java.util.List;

public class DataRowXML {
    private List<DataValueXML> values;

    public List<DataValueXML> getValues() {
        return values;
    }
    @XmlElement(name = "Value")
    public void setValues(List<DataValueXML> values) {
        this.values = values;
    }
}
