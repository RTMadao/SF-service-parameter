package com.salcedoFawcett.services.parameterData.persistence.crud;

import com.salcedoFawcett.services.parameterData.persistence.entity.PricingReferenceCode;
import org.springframework.data.repository.CrudRepository;

public interface PricingReferenceCodeCrudRepository extends CrudRepository<PricingReferenceCode, String> {
}
