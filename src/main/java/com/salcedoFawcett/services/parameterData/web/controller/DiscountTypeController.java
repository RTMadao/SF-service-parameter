package com.salcedoFawcett.services.parameterData.web.controller;

import com.salcedoFawcett.services.parameterData.domain.model.DiscountType;
import com.salcedoFawcett.services.parameterData.domain.service.DiscountTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/parameter/discount_type")
public class DiscountTypeController {
    @Autowired
    private DiscountTypeService service;
    @GetMapping("/all")
    public ResponseEntity<List<DiscountType>> getAll(){
        return new ResponseEntity<>(service.getList(), HttpStatus.OK);
    }
}
