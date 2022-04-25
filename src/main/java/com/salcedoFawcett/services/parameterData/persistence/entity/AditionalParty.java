package com.salcedoFawcett.services.parameterData.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "aditional_costumer_party")
public class AditionalParty {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String registrationName;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="party_identification_id", referencedColumnName = "id")
    private PartyIdentification partyIdentification;
    private int partecipationPercent;
    private String corporateRegistrationScheme;

    public AditionalParty() {
    }

    public AditionalParty(int id, String registrationName, PartyIdentification partyIdentification, int partecipationPercent, String corporateRegistrationScheme) {
        this.id = id;
        this.registrationName = registrationName;
        this.partyIdentification = partyIdentification;
        this.partecipationPercent = partecipationPercent;
        this.corporateRegistrationScheme = corporateRegistrationScheme;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRegistrationName() {
        return registrationName;
    }

    public void setRegistrationName(String registrationName) {
        this.registrationName = registrationName;
    }

    public PartyIdentification getPartyIdentification() {
        return partyIdentification;
    }

    public void setPartyIdentification(PartyIdentification partyIdentification) {
        this.partyIdentification = partyIdentification;
    }

    public int getPartecipationPercent() {
        return partecipationPercent;
    }

    public void setPartecipationPercent(int partecipationPercent) {
        this.partecipationPercent = partecipationPercent;
    }

    public String getCorporateRegistrationScheme() {
        return corporateRegistrationScheme;
    }

    public void setCorporateRegistrationScheme(String corporateRegistrationScheme) {
        this.corporateRegistrationScheme = corporateRegistrationScheme;
    }
}
