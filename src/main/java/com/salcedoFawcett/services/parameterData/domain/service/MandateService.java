package com.salcedoFawcett.services.parameterData.domain.service;

import com.salcedoFawcett.services.parameterData.persistence.entity.Mandate;
import com.salcedoFawcett.services.parameterData.persistence.repository.MandateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MandateService {
    @Autowired
    private MandateRepository repository;
    public List<Mandate> getAll() {
        return repository.getAll();
    }
    public Mandate save(Mandate mandate){
        return repository.save(mandate);
    }
}
