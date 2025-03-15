package com.java.practice.nestmate;

import java.util.List;
import java.util.stream.Collectors;

public class ProcesadorMensajes {
    private int maxLongitud;
    
    ProcesadorMensajes(int maxLongitud){
        this.maxLongitud = maxLongitud;
    }

    //Class anidada para filtrar mensajes

    class Filtro{
        List<String> filtrar(List<String> mensajes){
            return mensajes.stream()
            .filter((var msg)-> !msg.isBlank() && msg.length() <= maxLongitud)
            .map(String:: strip)
            .collect(Collectors.toList());
        }
    }

    //Clase anidada estática para formatear

    static class Formateador{
        static String formateadorMensaje(String msg){
            return "Mensaje: " + msg;
        }
    }

    List<String> procesar(List<String> mensajes){
        Filtro filtro = new Filtro();
        List<String> filtrados = filtro.filtrar(mensajes);
        return filtrados.stream()
        .map((var msg)->
        Formateador.formateadorMensaje(msg))
        .collect(Collectors.toList());
    }
}

//Juntar var en lambdas, los nuevos métods de String y NetMate en un ejemplode sistema de mensajes