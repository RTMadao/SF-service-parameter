package com.salcedoFawcett.services.parameterData.web.controller;

import com.salcedoFawcett.services.parameterData.domain.service.CompanyPartyService;
import com.salcedoFawcett.services.parameterData.persistence.entity.CompanyParty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/parameter/company_party")
public class CompanyPartyController {
    @Autowired
    private CompanyPartyService service;

    @GetMapping("/{id}")
    public  ResponseEntity<CompanyParty> getCompanyPartyById(@PathVariable("id") int id) {
        return service.getById(id)
                .map( item -> new ResponseEntity<>(item, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    @PostMapping("/save")
    public  ResponseEntity<CompanyParty> saveCompanyParty(@RequestBody CompanyParty companyParty){
        return new ResponseEntity<>(service.save(companyParty),HttpStatus.CREATED);
    }
}
