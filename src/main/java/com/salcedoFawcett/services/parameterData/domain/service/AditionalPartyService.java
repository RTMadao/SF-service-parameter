package com.salcedoFawcett.services.parameterData.domain.service;

import com.salcedoFawcett.services.parameterData.persistence.entity.Address;
import com.salcedoFawcett.services.parameterData.persistence.entity.AditionalParty;
import com.salcedoFawcett.services.parameterData.persistence.repository.AditionalPartyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AditionalPartyService {
    @Autowired
    private AditionalPartyRepository repository;
    @Autowired
    private PartyIdentificationService partyIdentificationService;

    public List<AditionalParty> getAll() {
        return repository.getAll();
    }

    public Optional<AditionalParty> getById(int id){
        return repository.getById(id);
    }

    public AditionalParty save(AditionalParty aditionalParty){
        aditionalParty.setPartyIdentification(partyIdentificationService.save(aditionalParty.getPartyIdentification()));
        return repository.save(aditionalParty);
    }

    public Optional<AditionalParty> update(AditionalParty aditionalParty){
        if (repository.aditionalPartyExist(aditionalParty.getId())) return Optional.ofNullable(repository.save(aditionalParty));
        return Optional.empty();
    }
}
