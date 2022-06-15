package com.salcedoFawcett.services.parameterData.domain.service;

import com.salcedoFawcett.services.parameterData.persistence.entity.Certificate;
import com.salcedoFawcett.services.parameterData.persistence.repository.CertificateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CertificateService {
    @Autowired
    private CertificateRepository repository;
    public List<Certificate> getAll(){
        return repository.getAll();
    }
    public Optional<Certificate> getByEntity(String entity){
        return repository.getByEntity(entity);
    }
    public Certificate save(Certificate certificate){
        return repository.save(certificate);
    }
}
