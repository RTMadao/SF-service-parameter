package com.salcedoFawcett.services.parameterData.web.controller;

import com.salcedoFawcett.services.parameterData.domain.service.OperationTypeService;
import com.salcedoFawcett.services.parameterData.persistence.entity.OperationType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/parameter/operation_type")
public class OperationTypeController {
    @Autowired
    private OperationTypeService service;
    @GetMapping("/")
    public ResponseEntity<List<OperationType>> getAll(){
        return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
    }
    @PostMapping("/save")
    public  ResponseEntity<OperationType> save(@RequestBody OperationType operationType){
        return new ResponseEntity<>(service.save(operationType),HttpStatus.CREATED);
    }
}
