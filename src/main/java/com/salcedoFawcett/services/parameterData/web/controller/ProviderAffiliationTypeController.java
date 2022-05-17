package com.salcedoFawcett.services.parameterData.web.controller;

import com.salcedoFawcett.services.parameterData.domain.service.ProviderAffiliationTypeService;
import com.salcedoFawcett.services.parameterData.persistence.entity.ProviderAffiliationType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/parameter/provider_affiliation_type")
public class ProviderAffiliationTypeController {
    @Autowired
    private ProviderAffiliationTypeService service;

    @GetMapping("/all")
    public ResponseEntity<List<ProviderAffiliationType>> getAll(){
        return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
    }
    @PostMapping("/save")
    public  ResponseEntity<ProviderAffiliationType> saveProviderAffiliationType(@RequestBody ProviderAffiliationType type){
        return new ResponseEntity<>(service.save(type),HttpStatus.CREATED);
    }
}
