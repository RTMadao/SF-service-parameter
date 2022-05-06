package com.salcedoFawcett.services.parameterData.persistence.repository;

import com.salcedoFawcett.services.parameterData.persistence.crud.MandateCrudRepository;
import com.salcedoFawcett.services.parameterData.persistence.entity.Mandate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MandateRepository {
    @Autowired
    private MandateCrudRepository crudRepository;
    public List<Mandate> getAll(){
        return (List<Mandate>) crudRepository.findAll();
    }
    public Mandate save(Mandate mandate){
        return crudRepository.save(mandate);
    }
}
