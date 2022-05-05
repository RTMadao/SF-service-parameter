package com.salcedoFawcett.services.parameterData.persistence.crud;

import com.salcedoFawcett.services.parameterData.persistence.entity.Environment;
import org.springframework.data.repository.CrudRepository;

public interface EnvironmentCrudRepository extends CrudRepository<Environment, Integer> {
}
