package com.salcedoFawcett.services.parameterData.web.controller;

import com.salcedoFawcett.services.parameterData.domain.model.TransportRecord;
import com.salcedoFawcett.services.parameterData.domain.service.TransportRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/parameter/transport_record")
public class TransportRecordController {
    @Autowired
    private TransportRecordService service;
    @GetMapping("/all")
    public ResponseEntity<List<TransportRecord>> getAll(){
        return new ResponseEntity<>(service.getList(), HttpStatus.OK);
    }
}
