package com.salcedoFawcett.services.parameterData.persistence.repository;

import com.salcedoFawcett.services.parameterData.persistence.crud.CertificateCrudRepository;
import com.salcedoFawcett.services.parameterData.persistence.entity.Certificate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class CertificateRepository {
    @Autowired
    private CertificateCrudRepository crudRepository;
    public List<Certificate> getAll(){
        return (List<Certificate>) crudRepository.findAll();
    }
    public Optional<Certificate> getByEntity(String entity){
        return crudRepository.findByEntity(entity);
    }
    public Certificate save(Certificate certificate){
        return crudRepository.save(certificate);
    }
}
