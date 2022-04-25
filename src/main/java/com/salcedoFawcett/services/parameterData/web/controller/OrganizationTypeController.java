package com.salcedoFawcett.services.parameterData.web.controller;

import com.salcedoFawcett.services.parameterData.domain.service.OrganizationTypeService;
import com.salcedoFawcett.services.parameterData.persistence.entity.OrganizationType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/parameter/organization_type")
public class OrganizationTypeController {
    @Autowired
    private OrganizationTypeService organizationTypeService;

    @GetMapping("/all")
    public ResponseEntity<List<OrganizationType>> getAll(){
        return new ResponseEntity<>(organizationTypeService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public  ResponseEntity<OrganizationType> getById(@PathVariable("id") String id) {
        return organizationTypeService.getById(id)
                .map( item -> new ResponseEntity<>(item, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/save")
    public  ResponseEntity<OrganizationType> save(@RequestBody OrganizationType organizationType){
        return new ResponseEntity<>(organizationTypeService.save(organizationType),HttpStatus.CREATED);
    }
}
