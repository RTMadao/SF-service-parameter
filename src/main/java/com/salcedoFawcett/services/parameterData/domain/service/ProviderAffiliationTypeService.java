package com.salcedoFawcett.services.parameterData.domain.service;

import com.salcedoFawcett.services.parameterData.persistence.entity.ProviderAffiliationType;
import com.salcedoFawcett.services.parameterData.persistence.repository.ProviderAffiliationTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProviderAffiliationTypeService {
    @Autowired
    private ProviderAffiliationTypeRepository repository;

    public List<ProviderAffiliationType> getAll() {
        return repository.getAll();
    }
    public ProviderAffiliationType save(ProviderAffiliationType type){
        return repository.save(type);
    }
}
