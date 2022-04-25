package com.salcedoFawcett.services.parameterData.web.controller;

import com.salcedoFawcett.services.parameterData.domain.service.IdentificationDocumentTypeService;
import com.salcedoFawcett.services.parameterData.persistence.entity.IdentificationDocumentType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("parameter/identification_document_type")
public class IdentificationDocumentTypeController {
    @Autowired
    private IdentificationDocumentTypeService identificationDocumentTypeService;

    @GetMapping("/all")
    public ResponseEntity<List<IdentificationDocumentType>> getAll(){
        return new ResponseEntity<>(identificationDocumentTypeService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public  ResponseEntity<IdentificationDocumentType> getById(@PathVariable("id") int id) {
        return identificationDocumentTypeService.getById(id)
                .map( item -> new ResponseEntity<>(item, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/save")
    public  ResponseEntity<IdentificationDocumentType> save(@RequestBody IdentificationDocumentType identificationDocumentType){
        return new ResponseEntity<>(identificationDocumentTypeService.save(identificationDocumentType),HttpStatus.CREATED);
    }
}
