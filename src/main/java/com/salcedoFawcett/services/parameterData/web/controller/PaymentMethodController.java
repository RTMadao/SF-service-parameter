package com.salcedoFawcett.services.parameterData.web.controller;

import com.salcedoFawcett.services.parameterData.domain.model.PaymentMethod;
import com.salcedoFawcett.services.parameterData.domain.service.PaymentMethodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/parameter/payment_method")
public class PaymentMethodController {
    @Autowired
    private PaymentMethodService service;
    @GetMapping("/all")
    public ResponseEntity<List<PaymentMethod>> getAll(){
        return new ResponseEntity<>(service.getList(), HttpStatus.OK);
    }
}
