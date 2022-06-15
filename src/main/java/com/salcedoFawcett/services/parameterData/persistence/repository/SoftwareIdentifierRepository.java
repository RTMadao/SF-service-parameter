package com.salcedoFawcett.services.parameterData.persistence.repository;

import com.salcedoFawcett.services.parameterData.persistence.crud.SoftwareIdentifierCrudRepository;
import com.salcedoFawcett.services.parameterData.persistence.entity.SoftwareIdentifier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class SoftwareIdentifierRepository {
    @Autowired
    private SoftwareIdentifierCrudRepository crudRepository;

    public Optional<SoftwareIdentifier> get(){
        return crudRepository.findFirstByOrderById();
    }
    public SoftwareIdentifier save(SoftwareIdentifier parameter){
        return crudRepository.save(parameter);
    }
}
