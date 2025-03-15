package com.java.practice.nestmate;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args){
        ProcesadorMensajes procesadorMensajes = new ProcesadorMensajes(10);
        List<String> mensajes = Arrays.asList("  Hola  ", "", "DemasiadoLargo", "Adios");

        List<String> resultado = procesadorMensajes.procesar(mensajes);
        resultado.forEach(System.out::println);
    }

}

//Aplicar el concepto de var en lambdas, usando filter y map para hacer el código más legible

//Métodos de String, isBlank() filtra vacios y strip limpiar espacios en blanco (derecha a la izquierda)

//NestMate: filtro accede a maxLongitud privado y colabora al formateador estático, todo esto se
//aplica en un solo "nido"

//Esto se conoce con el concepto de programación orientada a objetos Avanzado: 
//Encapsulamiento, polimorfismo (Streams) y organización clases anidadas;

//NestMate:  combina en un sitema util, siendo entre fácil acceso, ejemplo Formateador

//Aplicacion de nuevos métodos