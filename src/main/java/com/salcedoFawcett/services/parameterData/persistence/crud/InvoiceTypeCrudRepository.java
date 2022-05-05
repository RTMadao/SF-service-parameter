package com.salcedoFawcett.services.parameterData.persistence.crud;

import com.salcedoFawcett.services.parameterData.persistence.entity.InvoiceType;
import org.springframework.data.repository.CrudRepository;

public interface InvoiceTypeCrudRepository extends CrudRepository<InvoiceType, String> {
}
