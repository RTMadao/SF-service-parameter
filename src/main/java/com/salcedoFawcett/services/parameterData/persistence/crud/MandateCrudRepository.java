package com.salcedoFawcett.services.parameterData.persistence.crud;

import com.salcedoFawcett.services.parameterData.persistence.entity.Mandate;
import org.springframework.data.repository.CrudRepository;

public interface MandateCrudRepository extends CrudRepository<Mandate, Integer> {
}
