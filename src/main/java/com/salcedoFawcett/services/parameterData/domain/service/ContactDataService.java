package com.salcedoFawcett.services.parameterData.domain.service;

import com.salcedoFawcett.services.parameterData.persistence.entity.Address;
import com.salcedoFawcett.services.parameterData.persistence.entity.ContactData;
import com.salcedoFawcett.services.parameterData.persistence.repository.ContactDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContactDataService {
    @Autowired
    private ContactDataRepository repository;

    public List<ContactData> getAll() {
        return repository.getAll();
    }

    public Optional<ContactData> getById(int id){
        return repository.getById(id);
    }

    public ContactData save(ContactData contactData){
        return repository.save(contactData);
    }

    public Optional<ContactData> update(ContactData contactData){
        if (repository.contactDataExist(contactData.getId())) return Optional.ofNullable(repository.save(contactData));
        return Optional.empty();
    }
}
