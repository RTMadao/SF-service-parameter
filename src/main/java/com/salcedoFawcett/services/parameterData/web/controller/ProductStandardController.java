package com.salcedoFawcett.services.parameterData.web.controller;

import com.salcedoFawcett.services.parameterData.domain.service.ProductStandardService;
import com.salcedoFawcett.services.parameterData.persistence.entity.ProductStandard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/parameter/product_standard")
public class ProductStandardController {
    @Autowired
    private ProductStandardService service;
    @GetMapping("/")
    public ResponseEntity<List<ProductStandard>> getAll(){
        return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
    }
    @PostMapping("/save")
    public  ResponseEntity<ProductStandard> save(@RequestBody ProductStandard productStandard){
        return new ResponseEntity<>(service.save(productStandard),HttpStatus.CREATED);
    }
}
