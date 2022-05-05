package com.salcedoFawcett.services.parameterData.web.controller;

import com.salcedoFawcett.services.parameterData.domain.model.Unit;
import com.salcedoFawcett.services.parameterData.domain.service.UnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/parameter")
public class ParameterController {
    @Autowired
    private UnitService unitService;
    @GetMapping("/unit")
    public ResponseEntity<List<Unit>> getAll(){
        try {
            return new ResponseEntity<>(unitService.getList(), HttpStatus.OK);
        } catch (IOException e) {
            try {
                unitService.generateJsonFile();
                return new ResponseEntity<>(unitService.getList(), HttpStatus.OK);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }
    }
}
