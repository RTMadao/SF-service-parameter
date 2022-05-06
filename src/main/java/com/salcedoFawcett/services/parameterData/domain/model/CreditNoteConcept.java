package com.salcedoFawcett.services.parameterData.domain.model;

public class CreditNoteConcept {
    private String id;
    private String name;
    public CreditNoteConcept(){}
    public CreditNoteConcept(String id, String name) {
        this.id = id;
        this.name = name;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
