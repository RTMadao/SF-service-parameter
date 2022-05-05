package com.salcedoFawcett.services.parameterData.domain.service;

import com.salcedoFawcett.services.parameterData.persistence.entity.InvoiceType;
import com.salcedoFawcett.services.parameterData.persistence.repository.InvoiceTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvoiceTypeService {
    @Autowired
    private InvoiceTypeRepository repository;
    public List<InvoiceType> getAll() {
        return repository.getAll();
    }
    public InvoiceType save(InvoiceType invoiceType){
        return repository.save(invoiceType);
    }
}
