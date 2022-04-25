package com.salcedoFawcett.services.parameterData.persistence.repository;

import com.salcedoFawcett.services.parameterData.persistence.crud.ContactDataCrudRepository;
import com.salcedoFawcett.services.parameterData.persistence.entity.ContactData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ContactDataRepository {
    @Autowired
    private ContactDataCrudRepository crudRepository;

    public List<ContactData> getAll(){
        return (List<ContactData>) crudRepository.findAll();
    }

    public Optional<ContactData> getById(int id){
        return crudRepository.findById(id);
    }

    public ContactData save(ContactData contactData){
        return crudRepository.save(contactData);
    }

    public boolean contactDataExist(int id) {
        return crudRepository.existsById(id);
    }
}
