package com.salcedoFawcett.services.parameterData.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "software_identifier")
public class SoftwareIdentifier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String softwareId;
    private String softwarePin;
    private String technicalKey;

    public SoftwareIdentifier() {}

    public String getSoftwareId() {
        return softwareId;
    }

    public void setSoftwareId(String softwareId) {
        this.softwareId = softwareId;
    }

    public String getSoftwarePin() {
        return softwarePin;
    }

    public void setSoftwarePin(String softwarePin) {
        this.softwarePin = softwarePin;
    }

    public String getTechnicalKey() {
        return technicalKey;
    }

    public void setTechnicalKey(String technicalKey) {
        this.technicalKey = technicalKey;
    }
}
