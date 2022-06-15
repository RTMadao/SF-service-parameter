package com.salcedoFawcett.services.parameterData.persistence.crud;

import com.salcedoFawcett.services.parameterData.persistence.entity.Certificate;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CertificateCrudRepository  extends CrudRepository<Certificate, Integer> {
    Optional<Certificate> findByEntity (String entity);
}
