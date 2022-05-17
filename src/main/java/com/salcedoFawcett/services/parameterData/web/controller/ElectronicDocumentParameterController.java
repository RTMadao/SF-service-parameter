package com.salcedoFawcett.services.parameterData.web.controller;

import com.salcedoFawcett.services.parameterData.domain.service.ElectronicDocumentParameterService;
import com.salcedoFawcett.services.parameterData.persistence.entity.ElectronicDocumentParameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/parameter/electronic_document_parameter")
public class ElectronicDocumentParameterController {
    @Autowired
    private ElectronicDocumentParameterService service;

    @GetMapping("/{id}")
    public  ResponseEntity<ElectronicDocumentParameter> getElectronicDocumentParameterById(@PathVariable("id") int id) {
        return service.getById(id)
                .map( item -> new ResponseEntity<>(item, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    @PostMapping("/save")
    public  ResponseEntity<ElectronicDocumentParameter> saveElectronicDocumentParameter(@RequestBody ElectronicDocumentParameter parameter){
        return new ResponseEntity<>(service.save(parameter),HttpStatus.CREATED);
    }
}
