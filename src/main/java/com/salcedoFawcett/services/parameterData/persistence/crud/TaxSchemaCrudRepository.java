package com.salcedoFawcett.services.parameterData.persistence.crud;

import com.salcedoFawcett.services.parameterData.persistence.entity.TaxSchema;
import org.springframework.data.repository.CrudRepository;

public interface TaxSchemaCrudRepository extends CrudRepository<TaxSchema, String> {
}
