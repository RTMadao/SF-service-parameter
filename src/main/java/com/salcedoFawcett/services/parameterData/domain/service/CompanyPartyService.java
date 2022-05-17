package com.salcedoFawcett.services.parameterData.domain.service;

import com.salcedoFawcett.services.parameterData.persistence.entity.CompanyParty;
import com.salcedoFawcett.services.parameterData.persistence.repository.CompanyPartyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CompanyPartyService {
    @Autowired
    private CompanyPartyRepository repository;

    public Optional<CompanyParty> getById(int id){
        return repository.getById(id);
    }
    public CompanyParty save(CompanyParty party){
        return repository.save(party);
    }
}
