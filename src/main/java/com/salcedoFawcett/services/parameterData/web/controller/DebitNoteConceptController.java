package com.salcedoFawcett.services.parameterData.web.controller;

import com.salcedoFawcett.services.parameterData.domain.model.DebitNoteConcept;
import com.salcedoFawcett.services.parameterData.domain.service.DebitNoteConceptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/parameter/debit_note_concept")
public class DebitNoteConceptController {
    @Autowired
    private DebitNoteConceptService service;
    @GetMapping("/all")
    public ResponseEntity<List<DebitNoteConcept>> getAll(){
        return new ResponseEntity<>(service.getList(), HttpStatus.OK);
    }
}
