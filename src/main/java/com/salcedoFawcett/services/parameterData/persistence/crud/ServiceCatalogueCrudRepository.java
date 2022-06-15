package com.salcedoFawcett.services.parameterData.persistence.crud;

import com.salcedoFawcett.services.parameterData.persistence.entity.ServiceCatalogue;
import org.springframework.data.repository.CrudRepository;

public interface ServiceCatalogueCrudRepository extends CrudRepository<ServiceCatalogue, String> {
}
