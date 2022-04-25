package com.salcedoFawcett.services.parameterData.domain.service;

import com.salcedoFawcett.services.parameterData.persistence.entity.TaxLevelCode;
import com.salcedoFawcett.services.parameterData.persistence.repository.TaxLevelCodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaxLevelCodeService {
    @Autowired
    private TaxLevelCodeRepository taxLevelCodeRepository;

    public List<TaxLevelCode> getAll() {
        return taxLevelCodeRepository.getAll();
    }

    public Optional<TaxLevelCode> getById(String id){
        return taxLevelCodeRepository.getById(id);
    }

    public TaxLevelCode save(TaxLevelCode taxLevelCode){
        return taxLevelCodeRepository.save(taxLevelCode);
    }
}
