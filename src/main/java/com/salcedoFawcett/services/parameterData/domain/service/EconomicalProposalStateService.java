package com.salcedoFawcett.services.parameterData.domain.service;

import com.salcedoFawcett.services.parameterData.persistence.entity.EconomicalProposalState;
import com.salcedoFawcett.services.parameterData.persistence.repository.EconomicalProposalStateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EconomicalProposalStateService {
    @Autowired
    private EconomicalProposalStateRepository repository;

    public List<EconomicalProposalState> getAll() {
        return repository.getAll();
    }
    public Optional<EconomicalProposalState> getById(int stateId){
        return repository.getById(stateId);
    }
    public EconomicalProposalState save(EconomicalProposalState state){
        return repository.save(state);
    }
    public boolean delete(int stateId){
        return repository.delete(stateId);
    }
}
