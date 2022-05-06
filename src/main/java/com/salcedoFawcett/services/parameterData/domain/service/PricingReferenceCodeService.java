package com.salcedoFawcett.services.parameterData.domain.service;

import com.salcedoFawcett.services.parameterData.persistence.entity.PricingReferenceCode;
import com.salcedoFawcett.services.parameterData.persistence.repository.PricingReferenceCodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PricingReferenceCodeService {
    @Autowired
    private PricingReferenceCodeRepository repository;
    public List<PricingReferenceCode> getAll() {
        return repository.getAll();
    }
    public PricingReferenceCode save(PricingReferenceCode pricingReferenceCode){
        return repository.save(pricingReferenceCode);
    }
}
