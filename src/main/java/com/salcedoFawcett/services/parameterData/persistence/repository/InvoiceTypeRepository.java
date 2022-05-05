package com.salcedoFawcett.services.parameterData.persistence.repository;

import com.salcedoFawcett.services.parameterData.persistence.crud.InvoiceTypeCrudRepository;
import com.salcedoFawcett.services.parameterData.persistence.entity.InvoiceType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class InvoiceTypeRepository {
    @Autowired
    private InvoiceTypeCrudRepository crudRepository;
    public List<InvoiceType> getAll(){
        return (List<InvoiceType>) crudRepository.findAll();
    }
    public InvoiceType save(InvoiceType invoiceType){
        return crudRepository.save(invoiceType);
    }
}
