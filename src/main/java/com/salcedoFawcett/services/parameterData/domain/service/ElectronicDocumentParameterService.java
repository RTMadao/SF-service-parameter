package com.salcedoFawcett.services.parameterData.domain.service;

import com.salcedoFawcett.services.parameterData.persistence.entity.ElectronicDocumentParameter;
import com.salcedoFawcett.services.parameterData.persistence.repository.ElectronicDocumentParameterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ElectronicDocumentParameterService {
    @Autowired
    private ElectronicDocumentParameterRepository repository;

    public Optional<ElectronicDocumentParameter> get(){
        return repository.get();
    }
    public ElectronicDocumentParameter save(ElectronicDocumentParameter parameter){
        return repository.save(parameter);
    }
    public Optional<Integer> getLastAuthorizedInvoices(){
        return repository.get().map(ElectronicDocumentParameter::getAuthorizedInvoicesLastUsed);
    }
    public Optional<Integer> getLastCreditNoteID(){
        return repository.get().map(ElectronicDocumentParameter::getCreditNoteIdLastUsed);
    }
    public Optional<Integer> getLastApplicationIDResponse(){
        return repository.get().map(ElectronicDocumentParameter::getApplicationIdResponseLastUsed);
    }
    public Optional<Integer> getLastAttachedDocumentID(){
        return repository.get().map(ElectronicDocumentParameter::getAttachedDocumentIdLastUsed);
    }
    public Optional<Integer> getLastDebitNoteID(){
        return repository.get().map(ElectronicDocumentParameter::getDebitNoteIdLastUsed);
    }
    public Optional<ElectronicDocumentParameter> updateLastCreditNoteID(){
        return  this.repository.get().map(invoiceID -> {
            invoiceID.setCreditNoteIdLastUsed(invoiceID.getCreditNoteIdLastUsed()+1);
            return repository.save(invoiceID);
        });
    }
    public Optional<ElectronicDocumentParameter> updateLastInvoiceID(){
        return  this.repository.get().map(invoiceID -> {
            invoiceID.setAuthorizedInvoicesLastUsed(invoiceID.getAuthorizedInvoicesLastUsed()+1);
            return repository.save(invoiceID);
        });
    }
    public Optional<ElectronicDocumentParameter> updateLastDebitNote(){
        return  this.repository.get().map(invoiceID -> {
            invoiceID.setDebitNoteIdLastUsed(invoiceID.getDebitNoteIdLastUsed()+1);
            return repository.save(invoiceID);
        });
    }
    public Optional<ElectronicDocumentParameter> updateLastApplicationResponseID(){
        return  this.repository.get().map(invoiceID -> {
            invoiceID.setApplicationIdResponseLastUsed(invoiceID.getApplicationIdResponseLastUsed()+1);
            return repository.save(invoiceID);
        });
    }
    public Optional<ElectronicDocumentParameter> updateAttachedDocumentID(){
        return  this.repository.get().map(invoiceID -> {
            invoiceID.setAttachedDocumentIdLastUsed(invoiceID.getAttachedDocumentIdLastUsed()+1);
            return repository.save(invoiceID);
        });
    }
}
