package com.salcedoFawcett.services.parameterData.web.controller;

import com.salcedoFawcett.services.parameterData.domain.service.AditionalPartyService;
import com.salcedoFawcett.services.parameterData.persistence.entity.AditionalParty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/aditional_party")
public class AditionalPartyController {
    @Autowired
    private AditionalPartyService aditionalPartyService;

    @GetMapping("/all")
    public ResponseEntity<List<AditionalParty>> getAll(){
        return new ResponseEntity<>(aditionalPartyService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public  ResponseEntity<AditionalParty> getById(@PathVariable("id") int id) {
        return aditionalPartyService.getById(id)
                .map( item -> new ResponseEntity<>(item, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/save")
    public  ResponseEntity<AditionalParty> saveAditionalParty(@RequestBody AditionalParty aditionalParty){
        return new ResponseEntity<>(aditionalPartyService.save(aditionalParty),HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public  ResponseEntity<AditionalParty> updateAditionalParty(@RequestBody AditionalParty aditionalParty) {
        return  aditionalPartyService.update(aditionalParty).map(aditionalPartyUpdates -> new ResponseEntity<>(aditionalPartyUpdates,HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
}
