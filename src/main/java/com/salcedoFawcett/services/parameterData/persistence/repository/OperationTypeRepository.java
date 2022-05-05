package com.salcedoFawcett.services.parameterData.persistence.repository;

import com.salcedoFawcett.services.parameterData.persistence.crud.OperationTypeCrudRepository;
import com.salcedoFawcett.services.parameterData.persistence.entity.OperationType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class OperationTypeRepository {
    @Autowired
    private OperationTypeCrudRepository crudRepository;

    public List<OperationType> getAll(){
        return (List<OperationType>) crudRepository.findAll();
    }
    public OperationType save(OperationType operationType){
        return crudRepository.save(operationType);
    }
}
