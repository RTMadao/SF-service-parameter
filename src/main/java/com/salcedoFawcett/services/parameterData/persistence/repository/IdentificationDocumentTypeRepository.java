package com.salcedoFawcett.services.parameterData.persistence.repository;

import com.salcedoFawcett.services.parameterData.persistence.crud.IdentificationDocumentTypeCrudRepository;
import com.salcedoFawcett.services.parameterData.persistence.entity.IdentificationDocumentType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class IdentificationDocumentTypeRepository {

    @Autowired
    private IdentificationDocumentTypeCrudRepository crudRepository;

    public List<IdentificationDocumentType> getAll(){
        return (List<IdentificationDocumentType>) crudRepository.findAll();
    }

    public Optional<IdentificationDocumentType> getById(int id){
        return crudRepository.findById(id);
    }

    public IdentificationDocumentType save(IdentificationDocumentType identificationDocumentType){
        return crudRepository.save(identificationDocumentType);
    }
}
