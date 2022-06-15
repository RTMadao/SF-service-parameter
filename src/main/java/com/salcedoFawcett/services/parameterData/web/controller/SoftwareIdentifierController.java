package com.salcedoFawcett.services.parameterData.web.controller;

import com.salcedoFawcett.services.parameterData.domain.service.SoftwareIdentifierService;
import com.salcedoFawcett.services.parameterData.persistence.entity.SoftwareIdentifier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/parameter/software_identifier")
public class SoftwareIdentifierController {
    @Autowired
    private SoftwareIdentifierService service;

    @GetMapping("/")
    public ResponseEntity<SoftwareIdentifier> getSoftwareIdentifierById() {
        return service.get()
                .map( item -> new ResponseEntity<>(item, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    @PostMapping("/save")
    public  ResponseEntity<SoftwareIdentifier> saveSoftwareIdentifier(@RequestBody SoftwareIdentifier identifier){
        return new ResponseEntity<>(service.save(identifier),HttpStatus.CREATED);
    }
}
