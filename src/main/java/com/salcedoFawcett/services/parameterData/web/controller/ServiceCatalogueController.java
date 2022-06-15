package com.salcedoFawcett.services.parameterData.web.controller;

import com.salcedoFawcett.services.parameterData.domain.service.ServiceCatalogueService;
import com.salcedoFawcett.services.parameterData.persistence.entity.ServiceCatalogue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/parameter/catalogue/service")
public class ServiceCatalogueController {
    @Autowired
    private ServiceCatalogueService service;

    @GetMapping("/all")
    public ResponseEntity<List<ServiceCatalogue>> getAll(){
        return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public  ResponseEntity<ServiceCatalogue> getServiceCatalogueById(@PathVariable("id") String id) {
        return service.getById(id)
                .map( item -> new ResponseEntity<>(item, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    @PostMapping("/save")
    public  ResponseEntity<ServiceCatalogue> saveServiceCatalogue(@RequestBody ServiceCatalogue serviceItem){
        return new ResponseEntity<>(service.save(serviceItem),HttpStatus.CREATED);
    }
    @DeleteMapping("/delete/{id}")
    public  ResponseEntity<?> deleteServiceCatalogue(@PathVariable("id") String id){
        if (service.delete(id)) return new ResponseEntity<>(HttpStatus.OK);
        else return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
