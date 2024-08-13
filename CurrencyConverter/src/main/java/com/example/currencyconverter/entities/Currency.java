package com.example.currencyconverter.entities;

import java.math.BigDecimal;


public class Currency {

    private Long id;
    private String from;
    private String to;
    private BigDecimal currencyValue;

    public Currency() {
    }

    public Currency(String from, String to, BigDecimal currencyValue) {
        this.from = from;
        this.to = to;
        this.currencyValue = currencyValue;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public BigDecimal getCurrencyValue() {
        return currencyValue;
    }

    public void setCurrencyValue(BigDecimal currencyValue) {
        this.currencyValue = currencyValue;
    }
}
