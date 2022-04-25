package com.salcedoFawcett.services.parameterData.persistence.crud;

import com.salcedoFawcett.services.parameterData.persistence.entity.ContactData;
import org.springframework.data.repository.CrudRepository;

public interface ContactDataCrudRepository extends CrudRepository<ContactData, Integer> {
}
