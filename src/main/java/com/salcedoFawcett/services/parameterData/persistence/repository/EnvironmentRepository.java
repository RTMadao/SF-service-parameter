package com.salcedoFawcett.services.parameterData.persistence.repository;

import com.salcedoFawcett.services.parameterData.persistence.crud.EnvironmentCrudRepository;
import com.salcedoFawcett.services.parameterData.persistence.entity.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EnvironmentRepository {
    @Autowired
    private EnvironmentCrudRepository crudRepository;
    public List<Environment> getAll(){
        return (List<Environment>) crudRepository.findAll();
    }
    public Environment save(Environment environment){
        return crudRepository.save(environment);
    }
}
