package com.salcedoFawcett.services.parameterData.web.controller;

import com.salcedoFawcett.services.parameterData.domain.service.TaxSchemaService;
import com.salcedoFawcett.services.parameterData.persistence.entity.TaxSchema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/parameter/tax_schema")
public class TaxSchemaController {

    @Autowired
    private TaxSchemaService taxSchemaService;

    @GetMapping("/all")
    public ResponseEntity<List<TaxSchema>> getAll(){
        return new ResponseEntity<>(taxSchemaService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public  ResponseEntity<TaxSchema> getTaxSchemaById(@PathVariable("id") String id) {
        return taxSchemaService.getById(id)
                .map( item -> new ResponseEntity<>(item, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/save")
    public  ResponseEntity<TaxSchema> saveTaxSchema(@RequestBody TaxSchema taxSchema){
        return new ResponseEntity<>(taxSchemaService.save(taxSchema),HttpStatus.CREATED);
    }
}
