package com.salcedoFawcett.services.parameterData.persistence.repository;

import com.salcedoFawcett.services.parameterData.persistence.crud.TaxSchemaCrudRepository;
import com.salcedoFawcett.services.parameterData.persistence.entity.TaxSchema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class TaxSchemaRepository {

    @Autowired
    private TaxSchemaCrudRepository crudRepository;

    public List<TaxSchema> getAll(){
        return (List<TaxSchema>) crudRepository.findAll();
    }

    public Optional<TaxSchema> getById(String id){
        return crudRepository.findById(id);
    }

    public TaxSchema save(TaxSchema taxSchema){
        return crudRepository.save(taxSchema);
    }
}
