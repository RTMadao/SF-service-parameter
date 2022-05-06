package com.salcedoFawcett.services.parameterData.persistence.repository;

import com.salcedoFawcett.services.parameterData.persistence.crud.ProductStandardCrudRepository;
import com.salcedoFawcett.services.parameterData.persistence.entity.ProductStandard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductStandardRepository {
    @Autowired
    private ProductStandardCrudRepository crudRepository;
    public List<ProductStandard> getAll(){
        return (List<ProductStandard>) crudRepository.findAll();
    }
    public ProductStandard save(ProductStandard productStandard){
        return crudRepository.save(productStandard);
    }
}
