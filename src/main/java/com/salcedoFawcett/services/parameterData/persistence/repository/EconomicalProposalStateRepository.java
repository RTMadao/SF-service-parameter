package com.salcedoFawcett.services.parameterData.persistence.repository;

import com.salcedoFawcett.services.parameterData.persistence.crud.EconomicalProposalStateCrudRepository;
import com.salcedoFawcett.services.parameterData.persistence.entity.EconomicalProposalState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class EconomicalProposalStateRepository {
    @Autowired
    private EconomicalProposalStateCrudRepository crudRepository;

    public List<EconomicalProposalState> getAll(){
        return (List<EconomicalProposalState>) crudRepository.findAll();
    }
    public Optional<EconomicalProposalState> getById(int stateId){
        return crudRepository.findById(stateId);
    }
    public EconomicalProposalState save(EconomicalProposalState state){
        return crudRepository.save(state);
    }
    public boolean delete(int stateId) {
        if (crudRepository.existsById(stateId)) {
            crudRepository.deleteById(stateId);
            return true;
        }
        return false;
    }
}
