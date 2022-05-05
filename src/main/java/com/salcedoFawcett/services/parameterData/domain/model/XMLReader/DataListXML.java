package com.salcedoFawcett.services.parameterData.domain.model.XMLReader;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "SimpleCodeList")
public class DataListXML {
    private List<DataRowXML> rows;

    public List<DataRowXML> getRows() {
        return rows;
    }
    @XmlElement(name = "Row")
    public void setRows(List<DataRowXML> rows) {
        this.rows = rows;
    }
}
