package com.salcedoFawcett.services.parameterData.persistence.repository;

import com.salcedoFawcett.services.parameterData.persistence.crud.ProviderAffiliationTypeCrudRepository;
import com.salcedoFawcett.services.parameterData.persistence.entity.ProviderAffiliationType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProviderAffiliationTypeRepository {
    @Autowired
    private ProviderAffiliationTypeCrudRepository crudRepository;

    public List<ProviderAffiliationType> getAll(){
        return (List<ProviderAffiliationType>) crudRepository.findAll();
    }
    public ProviderAffiliationType save(ProviderAffiliationType parameter){
        return crudRepository.save(parameter);
    }
}
