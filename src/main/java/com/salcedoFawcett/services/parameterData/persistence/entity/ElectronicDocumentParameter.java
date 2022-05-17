package com.salcedoFawcett.services.parameterData.persistence.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "electronic_document_parameter")
public class ElectronicDocumentParameter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int invoiceAuthorization;
    private Date authorizationPeriodStartDate;
    private Date authorizationPeriodEndDate;
    private String authorizedInvoicesPrefix;
    private int authorizedInvoicesFrom;
    private int authorizedInvoicesTo;

    public ElectronicDocumentParameter() {}

    public ElectronicDocumentParameter(int id, int invoiceAuthorization, Date authorizationPeriodStartDate, Date authorizationPeriodEndDate, String authorizedInvoicesPrefix, int authorizedInvoicesFrom, int authorizedInvoicesTo) {
        this.id = id;
        this.invoiceAuthorization = invoiceAuthorization;
        this.authorizationPeriodStartDate = authorizationPeriodStartDate;
        this.authorizationPeriodEndDate = authorizationPeriodEndDate;
        this.authorizedInvoicesPrefix = authorizedInvoicesPrefix;
        this.authorizedInvoicesFrom = authorizedInvoicesFrom;
        this.authorizedInvoicesTo = authorizedInvoicesTo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getInvoiceAuthorization() {
        return invoiceAuthorization;
    }

    public void setInvoiceAuthorization(int invoiceAuthorization) {
        this.invoiceAuthorization = invoiceAuthorization;
    }

    public Date getAuthorizationPeriodStartDate() {
        return authorizationPeriodStartDate;
    }

    public void setAuthorizationPeriodStartDate(Date authorizationPeriodStartDate) {
        this.authorizationPeriodStartDate = authorizationPeriodStartDate;
    }

    public Date getAuthorizationPeriodEndDate() {
        return authorizationPeriodEndDate;
    }

    public void setAuthorizationPeriodEndDate(Date authorizationPeriodEndDate) {
        this.authorizationPeriodEndDate = authorizationPeriodEndDate;
    }

    public String getAuthorizedInvoicesPrefix() {
        return authorizedInvoicesPrefix;
    }

    public void setAuthorizedInvoicesPrefix(String authorizedInvoicesPrefix) {
        this.authorizedInvoicesPrefix = authorizedInvoicesPrefix;
    }

    public int getAuthorizedInvoicesFrom() {
        return authorizedInvoicesFrom;
    }

    public void setAuthorizedInvoicesFrom(int authorizedInvoicesFrom) {
        this.authorizedInvoicesFrom = authorizedInvoicesFrom;
    }

    public int getAuthorizedInvoicesTo() {
        return authorizedInvoicesTo;
    }

    public void setAuthorizedInvoicesTo(int authorizedInvoicesTo) {
        this.authorizedInvoicesTo = authorizedInvoicesTo;
    }
}
