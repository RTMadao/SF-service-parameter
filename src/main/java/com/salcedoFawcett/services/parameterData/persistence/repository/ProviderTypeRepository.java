package com.salcedoFawcett.services.parameterData.persistence.repository;

import com.salcedoFawcett.services.parameterData.persistence.crud.ProviderTypeCrudRepository;
import com.salcedoFawcett.services.parameterData.persistence.entity.ProviderType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProviderTypeRepository {
    @Autowired
    private ProviderTypeCrudRepository crudRepository;

    public List<ProviderType> getAll(){
        return (List<ProviderType>) crudRepository.findAll();
    }
    public ProviderType save(ProviderType parameter){
        return crudRepository.save(parameter);
    }
}
