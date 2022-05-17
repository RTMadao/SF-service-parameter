package com.salcedoFawcett.services.parameterData.persistence.repository;

import com.salcedoFawcett.services.parameterData.persistence.crud.CompanyPartyCrudRepository;
import com.salcedoFawcett.services.parameterData.persistence.entity.CompanyParty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class CompanyPartyRepository {
    @Autowired
    private CompanyPartyCrudRepository crudRepository;

    public Optional<CompanyParty> getById(int id){
        return crudRepository.findById(id);
    }
    public CompanyParty save(CompanyParty parameter){
        return crudRepository.save(parameter);
    }
}
