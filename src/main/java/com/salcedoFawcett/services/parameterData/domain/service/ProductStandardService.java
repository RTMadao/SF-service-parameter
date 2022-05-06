package com.salcedoFawcett.services.parameterData.domain.service;

import com.salcedoFawcett.services.parameterData.persistence.entity.ProductStandard;
import com.salcedoFawcett.services.parameterData.persistence.repository.ProductStandardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductStandardService {
    @Autowired
    private ProductStandardRepository repository;
    public List<ProductStandard> getAll() {
        return repository.getAll();
    }
    public ProductStandard save(ProductStandard productStandard){
        return repository.save(productStandard);
    }
}
