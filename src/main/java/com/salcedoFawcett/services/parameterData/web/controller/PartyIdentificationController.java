package com.salcedoFawcett.services.parameterData.web.controller;

import com.salcedoFawcett.services.parameterData.domain.service.PartyIdentificationService;
import com.salcedoFawcett.services.parameterData.persistence.entity.PartyIdentification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/party_identification")
public class PartyIdentificationController {

    @Autowired
    private PartyIdentificationService partyIdentificationService;

    @GetMapping("/all")
    public ResponseEntity<List<PartyIdentification>> getAll(){
        return new ResponseEntity<>(partyIdentificationService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public  ResponseEntity<PartyIdentification> getPartyIdentificationById(@PathVariable("id") int id) {
        return partyIdentificationService.getById(id)
                .map( item -> new ResponseEntity<>(item, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/save")
    public  ResponseEntity<PartyIdentification> savePartyIdentification(@RequestBody PartyIdentification partyIdentification){
        return new ResponseEntity<>(partyIdentificationService.save(partyIdentification),HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public  ResponseEntity<PartyIdentification> updatePartyIdentification(@RequestBody PartyIdentification partyIdentification) {
        return  partyIdentificationService.update(partyIdentification).map(partyIdentificationUpdates -> new ResponseEntity<>(partyIdentificationUpdates,HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
}
