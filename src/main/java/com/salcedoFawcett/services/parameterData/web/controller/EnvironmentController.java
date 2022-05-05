package com.salcedoFawcett.services.parameterData.web.controller;

import com.salcedoFawcett.services.parameterData.domain.service.EnvironmentService;
import com.salcedoFawcett.services.parameterData.persistence.entity.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/parameter/environment")
public class EnvironmentController {
    @Autowired
    private EnvironmentService service;
    @GetMapping("/")
    public ResponseEntity<List<Environment>> getAll(){
        return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
    }
    @PostMapping("/save")
    public  ResponseEntity<Environment> save(@RequestBody Environment environment){
        return new ResponseEntity<>(service.save(environment),HttpStatus.CREATED);
    }
}
