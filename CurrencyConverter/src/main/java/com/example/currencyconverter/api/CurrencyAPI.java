package com.example.currencyconverter.api;

import com.example.currencyconverter.dtos.APIReturnDTO;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@Component
public class CurrencyAPI {

    private final String url = "https://economia.awesomeapi.com.br/json/last/";

    public String getData(String path) {

        try {
            URI address = URI.create(url + path);
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder(address).GET().build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            String body = response.body();
            return body;
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
