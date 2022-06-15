package com.salcedoFawcett.services.parameterData.persistence.repository;

import com.salcedoFawcett.services.parameterData.persistence.crud.ElectronicDocumentParameterCrudRepository;
import com.salcedoFawcett.services.parameterData.persistence.entity.ElectronicDocumentParameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class ElectronicDocumentParameterRepository {
    @Autowired
    private ElectronicDocumentParameterCrudRepository crudRepository;

    public Optional<ElectronicDocumentParameter> get(){
        return crudRepository.findFirstByOrderById();
    }
    public ElectronicDocumentParameter save(ElectronicDocumentParameter parameter){
        return crudRepository.save(parameter);
    }
}
