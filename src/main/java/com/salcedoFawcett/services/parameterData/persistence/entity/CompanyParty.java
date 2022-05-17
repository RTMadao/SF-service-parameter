package com.salcedoFawcett.services.parameterData.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "company_party")
public class CompanyParty {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String additionalAccountId;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "party_identification_id", referencedColumnName = "id")
    private PartyIdentification partyIdentification;
    private String partyName;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "phisical_address_id", referencedColumnName = "id")
    private Address phisicalAddress;
    private String registrationName;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "registration_address_id", referencedColumnName = "id")
    private Address registrationAddress;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "tax_scheme_id", referencedColumnName = "id")
    private TaxSchema taxScheme;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "tax_level_code_id", referencedColumnName = "id")
    private TaxLevelCode taxLevelCode;
    private String commercialRegistration;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "contact_id", referencedColumnName = "id")
    private ContactData contact;

    public CompanyParty(){}

    public CompanyParty(int id, String additionalAccountId, PartyIdentification partyIdentification, String partyName, Address phisicalAddress, String registrationName, Address registrationAddress, TaxSchema taxScheme, TaxLevelCode taxLevelCode, String commercialRegistration, ContactData contact) {
        this.id = id;
        this.additionalAccountId = additionalAccountId;
        this.partyIdentification = partyIdentification;
        this.partyName = partyName;
        this.phisicalAddress = phisicalAddress;
        this.registrationName = registrationName;
        this.registrationAddress = registrationAddress;
        this.taxScheme = taxScheme;
        this.taxLevelCode = taxLevelCode;
        this.commercialRegistration = commercialRegistration;
        this.contact = contact;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAdditionalAccountId() {
        return additionalAccountId;
    }

    public void setAdditionalAccountId(String additionalAccountId) {
        this.additionalAccountId = additionalAccountId;
    }

    public PartyIdentification getPartyIdentification() {
        return partyIdentification;
    }

    public void setPartyIdentification(PartyIdentification partyIdentification) {
        this.partyIdentification = partyIdentification;
    }

    public String getPartyName() {
        return partyName;
    }

    public void setPartyName(String partyName) {
        this.partyName = partyName;
    }

    public Address getPhisicalAddress() {
        return phisicalAddress;
    }

    public void setPhisicalAddress(Address phisicalAddress) {
        this.phisicalAddress = phisicalAddress;
    }

    public String getRegistrationName() {
        return registrationName;
    }

    public void setRegistrationName(String registrationName) {
        this.registrationName = registrationName;
    }

    public Address getRegistrationAddress() {
        return registrationAddress;
    }

    public void setRegistrationAddress(Address registrationAddress) {
        this.registrationAddress = registrationAddress;
    }

    public TaxSchema getTaxScheme() {
        return taxScheme;
    }

    public void setTaxScheme(TaxSchema taxScheme) {
        this.taxScheme = taxScheme;
    }

    public String getCommercialRegistration() {
        return commercialRegistration;
    }

    public void setCommercialRegistration(String commercialRegistration) {
        this.commercialRegistration = commercialRegistration;
    }

    public ContactData getContact() {
        return contact;
    }

    public void setContact(ContactData contact) {
        this.contact = contact;
    }

    public TaxLevelCode getTaxLevelCode() {
        return taxLevelCode;
    }

    public void setTaxLevelCode(TaxLevelCode taxLevelCode) {
        this.taxLevelCode = taxLevelCode;
    }
}
