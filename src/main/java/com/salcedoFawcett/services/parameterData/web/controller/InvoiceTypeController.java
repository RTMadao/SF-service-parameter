package com.salcedoFawcett.services.parameterData.web.controller;

import com.salcedoFawcett.services.parameterData.domain.service.InvoiceTypeService;
import com.salcedoFawcett.services.parameterData.persistence.entity.InvoiceType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/parameter/invoice_type")
public class InvoiceTypeController {
    @Autowired
    private InvoiceTypeService service;
    @GetMapping("/")
    public ResponseEntity<List<InvoiceType>> getAll(){
        return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
    }
    @PostMapping("/save")
    public  ResponseEntity<InvoiceType> save(@RequestBody InvoiceType invoiceType){
        return new ResponseEntity<>(service.save(invoiceType),HttpStatus.CREATED);
    }
}
