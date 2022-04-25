package com.salcedoFawcett.services.parameterData.persistence.repository;

import com.salcedoFawcett.services.parameterData.persistence.crud.AddressCrudRepository;
import com.salcedoFawcett.services.parameterData.persistence.entity.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class AddressRepository {

    @Autowired
    private AddressCrudRepository crudRepository;

    public List<Address> getAll(){
        return (List<Address>) crudRepository.findAll();
    }

    public Optional<Address> getById(int id){
        return crudRepository.findById(id);
    }

    public Address save(Address address){
        return crudRepository.save(address);
    }

    public boolean AddressExist(int id) {
        return crudRepository.existsById(id);
    }

}
