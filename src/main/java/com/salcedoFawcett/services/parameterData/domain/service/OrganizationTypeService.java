package com.salcedoFawcett.services.parameterData.domain.service;

import com.salcedoFawcett.services.parameterData.persistence.entity.OrganizationType;
import com.salcedoFawcett.services.parameterData.persistence.repository.OrganizationTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrganizationTypeService {

    @Autowired
    private OrganizationTypeRepository repository;

    public List<OrganizationType> getAll() {
        return repository.getAll();
    }

    public Optional<OrganizationType> getById(String id){
        return repository.getById(id);
    }

    public OrganizationType save(OrganizationType organizationType){
        return repository.save(organizationType);
    }
}
