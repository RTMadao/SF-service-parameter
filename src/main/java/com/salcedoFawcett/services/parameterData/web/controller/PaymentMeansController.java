package com.salcedoFawcett.services.parameterData.web.controller;

import com.salcedoFawcett.services.parameterData.domain.model.PaymentMeans;
import com.salcedoFawcett.services.parameterData.domain.service.PaymentMeansService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/parameter/payment_means")
public class PaymentMeansController {
    @Autowired
    private PaymentMeansService service;
    @GetMapping("/all")
    public ResponseEntity<List<PaymentMeans>> getAll(){
        return new ResponseEntity<>(service.getList(), HttpStatus.OK);
    }
}
