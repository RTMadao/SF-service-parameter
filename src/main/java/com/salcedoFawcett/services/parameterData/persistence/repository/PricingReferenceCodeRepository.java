package com.salcedoFawcett.services.parameterData.persistence.repository;

import com.salcedoFawcett.services.parameterData.persistence.crud.PricingReferenceCodeCrudRepository;
import com.salcedoFawcett.services.parameterData.persistence.entity.PricingReferenceCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PricingReferenceCodeRepository {
    @Autowired
    private PricingReferenceCodeCrudRepository crudRepository;
    public List<PricingReferenceCode> getAll(){
        return (List<PricingReferenceCode>) crudRepository.findAll();
    }
    public PricingReferenceCode save(PricingReferenceCode pricingReferenceCode){
        return crudRepository.save(pricingReferenceCode);
    }
}
