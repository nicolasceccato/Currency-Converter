package com.example.currencyconverter.controllers;

import com.example.currencyconverter.dtos.CurrencyDTO;
import com.example.currencyconverter.services.CurrencyService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/currency")
public class CurrencyController {
    private CurrencyService service;

    public CurrencyController(CurrencyService service) {
        this.service = service;
    }

    @PostMapping(path = "", consumes = "application/json")
    public ResponseEntity<String> getCurrency(@RequestBody CurrencyDTO dto) {
        String result = service.getCurrency(dto);
        return ResponseEntity.ok().body(result);
    }
}
