package com.salcedoFawcett.services.parameterData.web.controller;

import com.salcedoFawcett.services.parameterData.domain.service.CertificateService;
import com.salcedoFawcett.services.parameterData.persistence.entity.Certificate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/parameter/certificate")
public class CertificateController {
    @Autowired
    private CertificateService service;

    @GetMapping("/all")
    public ResponseEntity<List<Certificate>> getAllCertificate(){
        return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
    }
    @GetMapping("/{entity}")
    public ResponseEntity<Certificate> getCertificateById(@PathVariable("entity") String entity) {
        return service.getByEntity(entity)
                .map( item -> new ResponseEntity<>(item, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    @PostMapping("/save")
    public  ResponseEntity<Certificate> saveCertificate(@RequestBody Certificate certificate){
        return new ResponseEntity<>(service.save(certificate),HttpStatus.CREATED);
    }
}
