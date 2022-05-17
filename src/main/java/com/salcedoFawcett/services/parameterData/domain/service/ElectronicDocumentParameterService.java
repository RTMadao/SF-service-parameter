package com.salcedoFawcett.services.parameterData.domain.service;

import com.salcedoFawcett.services.parameterData.persistence.entity.ElectronicDocumentParameter;
import com.salcedoFawcett.services.parameterData.persistence.repository.ElectronicDocumentParameterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ElectronicDocumentParameterService {
    @Autowired
    private ElectronicDocumentParameterRepository repository;

    public Optional<ElectronicDocumentParameter> getById(int id){
        return repository.getById(id);
    }
    public ElectronicDocumentParameter save(ElectronicDocumentParameter parameter){
        return repository.save(parameter);
    }
}
