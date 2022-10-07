package com.plantplaces.mvnspringboot;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.apache.commons.lang3.text.*; //API

@SpringBootApplication
public class WebController {

    private static final String URL = "http://webcode.me";

    public static void main(String[] args) throws IOException, InterruptedException {

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(URL))
                .GET() // GET is default
                .build();

        HttpResponse<Void> response = client.send(request,
                HttpResponse.BodyHandlers.discarding());

        System.out.println(response.statusCode());
    }
}