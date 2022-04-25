package com.salcedoFawcett.services.parameterData.domain.service;

import com.salcedoFawcett.services.parameterData.persistence.entity.TaxSchema;
import com.salcedoFawcett.services.parameterData.persistence.repository.TaxSchemaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaxSchemaService {

    @Autowired
    private TaxSchemaRepository taxSchemaRepository;

    public List<TaxSchema> getAll() {
        return taxSchemaRepository.getAll();
    }

    public Optional<TaxSchema> getById(String id){
        return taxSchemaRepository.getById(id);
    }

    public TaxSchema save(TaxSchema taxSchema){
        return taxSchemaRepository.save(taxSchema);
    }

}
