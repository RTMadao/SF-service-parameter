package com.salcedoFawcett.services.parameterData.web.controller;

import com.salcedoFawcett.services.parameterData.domain.model.TaxType;
import com.salcedoFawcett.services.parameterData.domain.service.TaxTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/parameter/tax_type")
public class TaxTypeController {
    @Autowired
    private TaxTypeService service;
    @GetMapping("/all")
    public ResponseEntity<List<TaxType>> getAll(){
        return new ResponseEntity<>(service.getList(), HttpStatus.OK);
    }
}
