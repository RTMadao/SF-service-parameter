package com.salcedoFawcett.services.parameterData.domain.service;

import com.salcedoFawcett.services.parameterData.persistence.entity.Address;
import com.salcedoFawcett.services.parameterData.persistence.entity.PartyIdentification;
import com.salcedoFawcett.services.parameterData.persistence.repository.PartyIdentificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PartyIdentificationService {
    @Autowired
    private PartyIdentificationRepository repository;

    public List<PartyIdentification> getAll() {
        return repository.getAll();
    }

    public Optional<PartyIdentification> getById(int id){
        return repository.getById(id);
    }

    public PartyIdentification save(PartyIdentification partyIdentification){
        return repository.save(partyIdentification);
    }

    public Optional<PartyIdentification> update(PartyIdentification partyIdentification){
        if (repository.partyIdentificationExist(partyIdentification.getId())) return Optional.ofNullable(repository.save(partyIdentification));
        return Optional.empty();
    }
}
