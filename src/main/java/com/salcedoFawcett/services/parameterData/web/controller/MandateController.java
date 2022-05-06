package com.salcedoFawcett.services.parameterData.web.controller;

import com.salcedoFawcett.services.parameterData.domain.service.MandateService;
import com.salcedoFawcett.services.parameterData.persistence.entity.Mandate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/parameter/mandate")
public class MandateController {
    @Autowired
    private MandateService service;
    @GetMapping("/")
    public ResponseEntity<List<Mandate>> getAll(){
        return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
    }
    @PostMapping("/save")
    public  ResponseEntity<Mandate> save(@RequestBody Mandate mandate){
        return new ResponseEntity<>(service.save(mandate),HttpStatus.CREATED);
    }
}
