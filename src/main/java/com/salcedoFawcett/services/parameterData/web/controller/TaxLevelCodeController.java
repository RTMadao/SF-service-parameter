package com.salcedoFawcett.services.parameterData.web.controller;

import com.salcedoFawcett.services.parameterData.domain.service.TaxLevelCodeService;
import com.salcedoFawcett.services.parameterData.persistence.entity.TaxLevelCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/parameter/tax_level_code")
public class TaxLevelCodeController {

    @Autowired
    private TaxLevelCodeService taxLevelCodeService;

    @GetMapping("/all")
    public ResponseEntity<List<TaxLevelCode>> getAll(){
        return new ResponseEntity<>(taxLevelCodeService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public  ResponseEntity<TaxLevelCode> getById(@PathVariable("id") String id) {
        return taxLevelCodeService.getById(id)
                .map( item -> new ResponseEntity<>(item, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/save")
    public  ResponseEntity<TaxLevelCode> save(@RequestBody TaxLevelCode taxLevelCode){
        return new ResponseEntity<>(taxLevelCodeService.save(taxLevelCode),HttpStatus.CREATED);
    }
}
