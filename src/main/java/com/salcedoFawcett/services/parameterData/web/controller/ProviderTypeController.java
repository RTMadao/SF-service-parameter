package com.salcedoFawcett.services.parameterData.web.controller;

import com.salcedoFawcett.services.parameterData.domain.service.ProviderTypeService;
import com.salcedoFawcett.services.parameterData.persistence.entity.ProviderType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/parameter/provider_type")
public class ProviderTypeController {
    @Autowired
    private ProviderTypeService service;

    @GetMapping("/all")
    public ResponseEntity<List<ProviderType>> getAll(){
        return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
    }
    @PostMapping("/save")
    public  ResponseEntity<ProviderType> saveProviderType(@RequestBody ProviderType type){
        return new ResponseEntity<>(service.save(type),HttpStatus.CREATED);
    }
}
