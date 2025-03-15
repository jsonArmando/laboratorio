package com.java.practice.conexiones;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class MainOLD {
    //Petición GET
    //GET, POST, PATH, DELETE (recomendable), PUT, entre otras
    public static void main(String[] args) throws Exception{
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
        .uri(URI.create("https://dragonball-api.com/api/characters/2"))
        .GET()
        .build();

        HttpResponse<String> response = client.send(
            request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
    }

}

//A partir de java 11 se creo una conexión moderna: 
//Cliente HTTP
//Java 11 trae un clinete HTTP nativo "java.net.http", esto es como tener en un navegador
//el código, es decir podemos hacer peticiones web fácil y rápido, con soprte para HTTP/2

//Como funciona
//Tenemos un cliente cliente "HttpClient" para crear el cliente "HttpRequest"  para definir la petición
//HttpResponse para manejar la respuesta (asincrono y asincrono)

//Ejemplo

//Creamos nuestro cliente con HttpClient.newHttpClient()
//Definimos una petición GET con HttpRequest.newBuilder()

//Enviamos con client.send() y pedimos recurso o cuerpo como String
//Imprimimos la respuesta