package com.salcedoFawcett.services.parameterData.persistence.repository;

import com.salcedoFawcett.services.parameterData.persistence.crud.PartyIdentificationCrudRepository;
import com.salcedoFawcett.services.parameterData.persistence.entity.PartyIdentification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class PartyIdentificationRepository{
    @Autowired
    private PartyIdentificationCrudRepository crudRepository;

    public List<PartyIdentification> getAll(){
        return (List<PartyIdentification>) crudRepository.findAll();
    }

    public Optional<PartyIdentification> getById(int id){
        return crudRepository.findById(id);
    }

    public PartyIdentification save(PartyIdentification partiIdentification){
        return crudRepository.save(partiIdentification);
    }

    public boolean partyIdentificationExist(int id) {
        return crudRepository.existsById(id);
    }
}
