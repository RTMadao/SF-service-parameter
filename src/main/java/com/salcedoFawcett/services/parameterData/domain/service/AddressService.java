package com.salcedoFawcett.services.parameterData.domain.service;

import com.salcedoFawcett.services.parameterData.persistence.entity.Address;
import com.salcedoFawcett.services.parameterData.persistence.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AddressService {
    @Autowired
    private AddressRepository repository;

    public List<Address> getAll() {
        return repository.getAll();
    }

    public Optional<Address> getById(int id){
        return repository.getById(id);
    }

    public Address save(Address address){
        return repository.save(address);
    }

    public Optional<Address> update(Address address){
       if (repository.AddressExist(address.getId())) return Optional.ofNullable(repository.save(address));
       return Optional.empty();
    }
}
