package com.example.currencyconverter.dtos;

import java.math.BigDecimal;

public record CurrencyDTO(String from, String to, Double toConvert) {
}