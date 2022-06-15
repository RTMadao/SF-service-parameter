package com.salcedoFawcett.services.parameterData.persistence.repository;

import com.salcedoFawcett.services.parameterData.persistence.crud.ServiceCatalogueCrudRepository;
import com.salcedoFawcett.services.parameterData.persistence.entity.ServiceCatalogue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ServiceCatalogueRepository {
    @Autowired
    private ServiceCatalogueCrudRepository crudRepository;

    public List<ServiceCatalogue> getAll(){
        return (List<ServiceCatalogue>) crudRepository.findAll();
    }
    public Optional<ServiceCatalogue> getById(String serviceId){
        return crudRepository.findById(serviceId);
    }
    public ServiceCatalogue save(ServiceCatalogue service){
        return crudRepository.save(service);
    }
    public boolean delete(String serviceId) {
        if (crudRepository.existsById(serviceId)) {
            crudRepository.deleteById(serviceId);
            return true;
        }
        return false;
    }
}
