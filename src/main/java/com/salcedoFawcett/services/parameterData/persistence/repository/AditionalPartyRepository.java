package com.salcedoFawcett.services.parameterData.persistence.repository;

import com.salcedoFawcett.services.parameterData.persistence.crud.AditionalPartyCrudRepository;
import com.salcedoFawcett.services.parameterData.persistence.entity.AditionalParty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class AditionalPartyRepository {
    @Autowired
    private AditionalPartyCrudRepository crudRepository;

    public List<AditionalParty> getAll(){
        return (List<AditionalParty>) crudRepository.findAll();
    }

    public Optional<AditionalParty> getById(int id){
        return crudRepository.findById(id);
    }

    public AditionalParty save(AditionalParty aditionalParty){
        return crudRepository.save(aditionalParty);
    }

    public boolean aditionalPartyExist(int id) {
        return crudRepository.existsById(id);
    }
}
