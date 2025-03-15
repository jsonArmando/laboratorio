package com.java.practice.conexiones;
//Ejemplo de petición asincrona

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Main {
    public static void main(String[] args){
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
        .uri(URI.create("https://dragonball-api.com/api/characters/2"))
        .GET()
        .build();

        client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
        .thenApply(HttpResponse::body)
        .thenAccept(System.out::println)
        .join();
    }
}

//Que sucede en esta parte

//Creamos nuestro cliente y la petición como antes
//Usamos SendAsync // para no bloquear el programa

//Endadenamos con thenApply para tomar el cuerpo  y ten thenAccept para imprimirlo

//Join espera que termine