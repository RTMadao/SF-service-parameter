package com.salcedoFawcett.services.parameterData.web.controller;

import com.salcedoFawcett.services.parameterData.domain.model.Unit;
import com.salcedoFawcett.services.parameterData.domain.service.UnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/parameter/unit")
public class UnitController {
    @Autowired
    private UnitService service;
    @GetMapping("/all")
    public ResponseEntity<List<Unit>> getAll(){
        return new ResponseEntity<>(service.getList(), HttpStatus.OK);
    }
}
