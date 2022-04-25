package com.salcedoFawcett.services.parameterData.persistence.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "identification_document_type")
public class IdentificationDocumentType {

    @Id
    private int id;
    private String name;

    public IdentificationDocumentType(){}

    public IdentificationDocumentType(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
