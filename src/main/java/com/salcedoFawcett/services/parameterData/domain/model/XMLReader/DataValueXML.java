package com.salcedoFawcett.services.parameterData.domain.model.XMLReader;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

public class DataValueXML {
    private String ColumnRef;
    private String value;

    public String getColumnRef() {
        return ColumnRef;
    }
    @XmlAttribute(name = "ColumnRef")
    public void setColumnRef(String columnRef) {
        ColumnRef = columnRef;
    }

    public String getValue() {
        return value;
    }

    @XmlElement(name = "SimpleValue")
    public void setValue(String value) {
        this.value = value;
    }
}
