package com.example.currencyconverter.services;

import com.example.currencyconverter.api.CurrencyAPI;
import com.example.currencyconverter.dtos.CurrencyDTO;
import org.springframework.stereotype.Service;

@Service
public class CurrencyService {

    private CurrencyAPI api;

    public CurrencyService(CurrencyAPI api) {
        this.api = api;
    }

    public String getCurrency(CurrencyDTO dto) {

        String result = api.getData(dto.from() + "-" + dto.to());
        String[] results = result.split(",");

        String name = results[2];
        String[] names = name.split("/");
        String from = names[0];
        String to = names[1];

        String bidString = results[7]; //.replace(".", ",");

        bidString = bidString.replace("\"", "");

        String[] bidValues = bidString.split(":");

        String bidValue = bidValues[1].trim().replace("\"", "");
        Double bid = Double.valueOf(bidValue);

        Double converted = bid * dto.toConvert();
        return from + " para " + to + " = " + converted;
    }
}
