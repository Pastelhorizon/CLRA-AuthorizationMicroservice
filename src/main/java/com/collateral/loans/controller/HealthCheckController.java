package com.collateral.loans.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class HealthCheckController {
    
    @GetMapping(path ="/")
    public ResponseEntity<String> getMethodName() {
        return new ResponseEntity<>("Health is OK", HttpStatus.OK);
    }
    
}
