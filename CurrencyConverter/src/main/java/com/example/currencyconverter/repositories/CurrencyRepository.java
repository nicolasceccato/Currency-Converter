package com.example.currencyconverter.repositories;

import com.example.currencyconverter.entities.Currency;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CurrencyRepository extends JpaRepository<Currency, Long> {
}
