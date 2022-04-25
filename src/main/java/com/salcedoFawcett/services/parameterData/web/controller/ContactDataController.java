package com.salcedoFawcett.services.parameterData.web.controller;

import com.salcedoFawcett.services.parameterData.domain.service.ContactDataService;
import com.salcedoFawcett.services.parameterData.persistence.entity.ContactData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contact_data")
public class ContactDataController {
    @Autowired
    private ContactDataService contactDataService;

    @GetMapping("/all")
    public ResponseEntity<List<ContactData>> getAll(){
        return new ResponseEntity<>(contactDataService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public  ResponseEntity<ContactData> getContactDataById(@PathVariable("id") int id) {
        return contactDataService.getById(id)
                .map( item -> new ResponseEntity<>(item, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/save")
    public  ResponseEntity<ContactData> saveContactData(@RequestBody ContactData contactData){
        return new ResponseEntity<>(contactDataService.save(contactData),HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public  ResponseEntity<ContactData> updateContactData(@RequestBody ContactData contactData) {
        return  contactDataService.update(contactData).map(contactDataUpdates -> new ResponseEntity<>(contactDataUpdates,HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
}
