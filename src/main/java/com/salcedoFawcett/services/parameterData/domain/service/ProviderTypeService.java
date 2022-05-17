package com.salcedoFawcett.services.parameterData.domain.service;

import com.salcedoFawcett.services.parameterData.persistence.entity.ProviderType;
import com.salcedoFawcett.services.parameterData.persistence.repository.ProviderTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProviderTypeService {
    @Autowired
    private ProviderTypeRepository repository;

    public List<ProviderType> getAll() {
        return repository.getAll();
    }
    public ProviderType save(ProviderType providerType){
        return repository.save(providerType);
    }
}
