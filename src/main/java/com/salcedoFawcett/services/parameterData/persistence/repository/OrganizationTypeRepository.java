package com.salcedoFawcett.services.parameterData.persistence.repository;

import com.salcedoFawcett.services.parameterData.persistence.crud.OrganizationTypeCrudRepository;
import com.salcedoFawcett.services.parameterData.persistence.entity.OrganizationType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class OrganizationTypeRepository {

    @Autowired
    private OrganizationTypeCrudRepository crudRepository;

    public List<OrganizationType> getAll(){
        return (List<OrganizationType>) crudRepository.findAll();
    }

    public Optional<OrganizationType> getById(String id){
        return crudRepository.findById(id);
    }

    public OrganizationType save(OrganizationType organizationType){
        return crudRepository.save(organizationType);
    }
}
