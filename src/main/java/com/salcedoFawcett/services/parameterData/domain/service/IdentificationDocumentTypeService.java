package com.salcedoFawcett.services.parameterData.domain.service;

import com.salcedoFawcett.services.parameterData.persistence.entity.IdentificationDocumentType;
import com.salcedoFawcett.services.parameterData.persistence.repository.IdentificationDocumentTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class IdentificationDocumentTypeService {
    @Autowired
    private IdentificationDocumentTypeRepository repository;

    public List<IdentificationDocumentType> getAll() {
        return repository.getAll();
    }

    public Optional<IdentificationDocumentType> getById(int id){
        return repository.getById(id);
    }

    public IdentificationDocumentType save(IdentificationDocumentType identificationDocumentType){
        return repository.save(identificationDocumentType);
    }
}
