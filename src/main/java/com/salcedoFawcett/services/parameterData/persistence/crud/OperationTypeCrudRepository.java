package com.salcedoFawcett.services.parameterData.persistence.crud;

import com.salcedoFawcett.services.parameterData.persistence.entity.OperationType;
import org.springframework.data.repository.CrudRepository;

public interface OperationTypeCrudRepository extends CrudRepository<OperationType, String> {
}
