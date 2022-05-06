package com.salcedoFawcett.services.parameterData.web.controller;

import com.salcedoFawcett.services.parameterData.domain.service.PricingReferenceCodeService;
import com.salcedoFawcett.services.parameterData.persistence.entity.PricingReferenceCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/parameter/pricing_reference_code")
public class PricingReferenceCodeController {
    @Autowired
    private PricingReferenceCodeService service;
    @GetMapping("/")
    public ResponseEntity<List<PricingReferenceCode>> getAll(){
        return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
    }
    @PostMapping("/save")
    public  ResponseEntity<PricingReferenceCode> save(@RequestBody PricingReferenceCode pricingReferenceCode){
        return new ResponseEntity<>(service.save(pricingReferenceCode),HttpStatus.CREATED);
    }
}
