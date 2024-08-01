package com.example.currencyconverter.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.util.Date;

@Entity
public class Currency {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String symbol;
    private String name;
    private Date searchedDate;
    private BigDecimal value;

    public Currency() {
    }

    public Currency(String symbol, String name, Date searchedDate, BigDecimal value) {
        this.symbol = symbol;
        this.name = name;
        this.searchedDate = searchedDate;
        this.value = value;
    }

    public Long getId() {
        return id;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getSearchedDate() {
        return searchedDate;
    }

    public void setSearchedDate(Date searchedDate) {
        this.searchedDate = searchedDate;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }
}
