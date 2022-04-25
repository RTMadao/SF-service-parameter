package com.salcedoFawcett.services.parameterData.persistence.repository;

import com.salcedoFawcett.services.parameterData.persistence.crud.TaxLevelCodeCrudRepository;
import com.salcedoFawcett.services.parameterData.persistence.entity.TaxLevelCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class TaxLevelCodeRepository {

    @Autowired
    private TaxLevelCodeCrudRepository crudRepository;

    public List<TaxLevelCode> getAll(){
        return (List<TaxLevelCode>) crudRepository.findAll();
    }

    public Optional<TaxLevelCode> getById(String id){
        return crudRepository.findById(id);
    }

    public TaxLevelCode save(TaxLevelCode taxLevelCode){
        return crudRepository.save(taxLevelCode);
    }
}
