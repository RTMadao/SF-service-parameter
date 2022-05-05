package com.salcedoFawcett.services.parameterData.domain.service;

import com.salcedoFawcett.services.parameterData.persistence.entity.Environment;
import com.salcedoFawcett.services.parameterData.persistence.repository.EnvironmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnvironmentService {
    @Autowired
    private EnvironmentRepository repository;
    public List<Environment> getAll() {
        return repository.getAll();
    }
    public Environment save(Environment environment){
        return repository.save(environment);
    }
}
