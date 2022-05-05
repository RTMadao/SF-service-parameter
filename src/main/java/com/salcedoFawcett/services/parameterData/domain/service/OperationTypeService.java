package com.salcedoFawcett.services.parameterData.domain.service;

import com.salcedoFawcett.services.parameterData.persistence.entity.OperationType;
import com.salcedoFawcett.services.parameterData.persistence.repository.OperationTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OperationTypeService {

    @Autowired
    private OperationTypeRepository repository;

    public List<OperationType> getAll() {
        return repository.getAll();
    }
    public OperationType save(OperationType operationType){
        return repository.save(operationType);
    }
}
