package com.salcedoFawcett.services.parameterData.domain.model;

public class PaymentMeans {
    private String id;
    private String name;
    public PaymentMeans(){}
    public PaymentMeans(String id, String name) {
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
