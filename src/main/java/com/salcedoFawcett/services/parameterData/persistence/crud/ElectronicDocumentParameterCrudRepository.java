package com.salcedoFawcett.services.parameterData.persistence.crud;

import com.salcedoFawcett.services.parameterData.persistence.entity.ElectronicDocumentParameter;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ElectronicDocumentParameterCrudRepository extends CrudRepository<ElectronicDocumentParameter, Integer> {
    Optional<ElectronicDocumentParameter> findFirstByOrderById();
}
