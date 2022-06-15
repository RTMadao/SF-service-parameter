package com.salcedoFawcett.services.parameterData.domain.service;

import com.salcedoFawcett.services.parameterData.persistence.entity.ServiceCatalogue;
import com.salcedoFawcett.services.parameterData.persistence.repository.ServiceCatalogueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceCatalogueService {
    @Autowired
    private ServiceCatalogueRepository repository;

    public List<ServiceCatalogue> getAll() {
        return repository.getAll();
    }
    public Optional<ServiceCatalogue> getById(String serviceId){
        return repository.getById(serviceId);
    }
    public ServiceCatalogue save(ServiceCatalogue service){
        return repository.save(service);
    }
    public boolean delete(String serviceId){
        return repository.delete(serviceId);
    }
}
