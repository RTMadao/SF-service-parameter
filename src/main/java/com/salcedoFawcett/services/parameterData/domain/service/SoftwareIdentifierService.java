package com.salcedoFawcett.services.parameterData.domain.service;

import com.salcedoFawcett.services.parameterData.persistence.entity.SoftwareIdentifier;
import com.salcedoFawcett.services.parameterData.persistence.repository.SoftwareIdentifierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SoftwareIdentifierService {
    @Autowired
    private SoftwareIdentifierRepository repository;

    public Optional<SoftwareIdentifier> get(){
        return repository.get();
    }
    public SoftwareIdentifier save(SoftwareIdentifier party){
        return repository.save(party);
    }
}
