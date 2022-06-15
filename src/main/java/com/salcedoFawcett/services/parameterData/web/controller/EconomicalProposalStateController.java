package com.salcedoFawcett.services.parameterData.web.controller;

import com.salcedoFawcett.services.parameterData.domain.service.EconomicalProposalStateService;
import com.salcedoFawcett.services.parameterData.persistence.entity.EconomicalProposalState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/parameter/economical_proposal_state")
public class EconomicalProposalStateController {
    @Autowired
    private EconomicalProposalStateService service;

    @GetMapping("/all")
    public ResponseEntity<List<EconomicalProposalState>> getAll(){
        return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public  ResponseEntity<EconomicalProposalState> getEconomicalProposalStateById(@PathVariable("id") int id) {
        return service.getById(id)
                .map( item -> new ResponseEntity<>(item, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    @PostMapping("/save")
    public  ResponseEntity<EconomicalProposalState> saveEconomicalProposalState(@RequestBody EconomicalProposalState serviceItem){
        return new ResponseEntity<>(service.save(serviceItem),HttpStatus.CREATED);
    }
    @DeleteMapping("/delete/{id}")
    public  ResponseEntity<?> deleteEconomicalProposalState(@PathVariable("id") int id){
        if (service.delete(id)) return new ResponseEntity<>(HttpStatus.OK);
        else return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
