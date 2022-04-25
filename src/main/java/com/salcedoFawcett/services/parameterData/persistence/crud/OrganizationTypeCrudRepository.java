package com.salcedoFawcett.services.parameterData.persistence.crud;

import com.salcedoFawcett.services.parameterData.persistence.entity.OrganizationType;
import org.springframework.data.repository.CrudRepository;

public interface OrganizationTypeCrudRepository extends CrudRepository<OrganizationType, String> {
}
