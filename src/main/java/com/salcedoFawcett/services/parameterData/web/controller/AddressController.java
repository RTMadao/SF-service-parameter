package com.salcedoFawcett.services.parameterData.web.controller;

import com.salcedoFawcett.services.parameterData.domain.service.AddressService;
import com.salcedoFawcett.services.parameterData.persistence.entity.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/address")
public class AddressController {

    @Autowired
    private AddressService addressService;

    @GetMapping("/all")
    public ResponseEntity<List<Address>> getAll(){
        return new ResponseEntity<>(addressService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public  ResponseEntity<Address> getAddressById(@PathVariable("id") int id) {
        return addressService.getById(id)
                .map( item -> new ResponseEntity<>(item, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/save")
    public  ResponseEntity<Address> saveAddress(@RequestBody Address address){
        return new ResponseEntity<>(addressService.save(address),HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public  ResponseEntity<Address> updateAddress(@RequestBody Address address) {
        return  addressService.update(address).map(addressUpdates -> new ResponseEntity<>(addressUpdates,HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
}
