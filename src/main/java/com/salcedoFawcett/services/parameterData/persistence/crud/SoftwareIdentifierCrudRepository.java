package com.salcedoFawcett.services.parameterData.persistence.crud;

import com.salcedoFawcett.services.parameterData.persistence.entity.SoftwareIdentifier;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface SoftwareIdentifierCrudRepository extends CrudRepository<SoftwareIdentifier, Integer> {
    Optional<SoftwareIdentifier> findFirstByOrderById();
}
