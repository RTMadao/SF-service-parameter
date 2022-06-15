package com.salcedoFawcett.services.parameterData.web.controller;

import com.salcedoFawcett.services.parameterData.domain.service.ElectronicDocumentParameterService;
import com.salcedoFawcett.services.parameterData.persistence.entity.ElectronicDocumentParameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/parameter/electronic_document_parameter")
public class ElectronicDocumentParameterController {
    @Autowired
    private ElectronicDocumentParameterService service;

    @GetMapping("/")
    public  ResponseEntity<ElectronicDocumentParameter> getElectronicDocumentParameter() {
        return service.get()
                .map( item -> new ResponseEntity<>(item, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    @GetMapping("/invoice/document_id/get_last")
    public  ResponseEntity<Integer> getLastAuthorizedInvoices() {
        return service.getLastAuthorizedInvoices()
                .map( item -> new ResponseEntity<>(item, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    @GetMapping("/invoice/document_id/update")
    public  ResponseEntity<ElectronicDocumentParameter> saveLastAuthorizedInvoices() {
        return service.updateLastInvoiceID()
                .map( item -> new ResponseEntity<>(item, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    @GetMapping("/credit_note/document_id/get_last")
    public  ResponseEntity<Integer> getLastCreditNoteID() {
        return service.getLastCreditNoteID()
                .map( item -> new ResponseEntity<>(item, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    @GetMapping("/credit_note/document_id/update")
    public  ResponseEntity<ElectronicDocumentParameter> saveLastCreditNoteID() {
        return service.updateLastCreditNoteID()
                .map( item -> new ResponseEntity<>(item, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    @GetMapping("/debit_note/document_id/get_last")
    public  ResponseEntity<Integer> getLastDebitNoteID() {
        return service.getLastDebitNoteID()
                .map( item -> new ResponseEntity<>(item, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    @GetMapping("/debit_note/document_id/update")
    public  ResponseEntity<ElectronicDocumentParameter> saveLastDebitNoteID() {
        return service.updateLastDebitNote()
                .map( item -> new ResponseEntity<>(item, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    @GetMapping("/application_response/document_id/get_last")
    public  ResponseEntity<Integer> getLastApplicationResponseID() {
        return service.getLastApplicationIDResponse()
                .map( item -> new ResponseEntity<>(item, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    @GetMapping("/application_response/document_id/update")
    public  ResponseEntity<ElectronicDocumentParameter> saveLastApplicationResponseID() {
        return service.updateLastApplicationResponseID()
                .map( item -> new ResponseEntity<>(item, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    @GetMapping("/attached_document/document_id/get_last")
    public  ResponseEntity<Integer> getLastAttachedDocumentID() {
        return service.getLastAttachedDocumentID()
                .map( item -> new ResponseEntity<>(item, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    @GetMapping("/attached_document/document_id/update")
    public  ResponseEntity<ElectronicDocumentParameter> saveLastAttachedDocumentID() {
        return service.updateAttachedDocumentID()
                .map( item -> new ResponseEntity<>(item, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    @PostMapping("/save")
    public  ResponseEntity<ElectronicDocumentParameter> saveElectronicDocumentParameter(@RequestBody ElectronicDocumentParameter parameter){
        return new ResponseEntity<>(service.save(parameter),HttpStatus.CREATED);
    }
}
