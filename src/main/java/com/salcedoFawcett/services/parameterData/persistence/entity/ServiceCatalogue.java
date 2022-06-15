package com.salcedoFawcett.services.parameterData.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "service_catalogue")
public class ServiceCatalogue {
    @Id
    private String id;
    private String service_name;

    public ServiceCatalogue(){}
    public ServiceCatalogue(String id, String service_name) {
        this.id = id;
        this.service_name = service_name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getService_name() {
        return service_name;
    }

    public void setService_name(String service_name) {
        this.service_name = service_name;
    }
}
