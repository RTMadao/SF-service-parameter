package com.salcedoFawcett.services.parameterData.web.controller;

import com.salcedoFawcett.services.parameterData.domain.model.CreditNoteConcept;
import com.salcedoFawcett.services.parameterData.domain.service.CreditNoteConceptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/parameter/credit_note_concept")
public class CreditNoteConceptController {
    @Autowired
    private CreditNoteConceptService service;
    @GetMapping("/")
    public ResponseEntity<List<CreditNoteConcept>> getAll(){
        try {
            return new ResponseEntity<>(service.getList(), HttpStatus.OK);
        } catch (IOException e) {
            try {
                service.generateJsonFile();
                return new ResponseEntity<>(service.getList(), HttpStatus.OK);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }
    }
}
