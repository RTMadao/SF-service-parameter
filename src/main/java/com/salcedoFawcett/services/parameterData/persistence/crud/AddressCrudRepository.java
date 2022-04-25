package com.salcedoFawcett.services.parameterData.persistence.crud;

import com.salcedoFawcett.services.parameterData.persistence.entity.Address;
import org.springframework.data.repository.CrudRepository;

public interface AddressCrudRepository extends CrudRepository<Address, Integer> {
}
