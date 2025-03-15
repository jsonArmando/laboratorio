package com.java.practice.foreach;

import java.util.List;

public class Main {
    public static void main(String[] args){
        List<String> amigos = List.of("Jose","Ana");
        amigos.forEach(amigo -> System.out.println("Hola, : " +amigo));


        //Números filtrados

        List<Integer> numeros = List.of(1,2,3,4,5,6);

        numeros.stream()
        .filter(n->n%2==0)
        .forEach(n->System.out.println("Números Pares: " + n));
    }
}

//Mejoras en forEach: en que consite siendo clave cuando lo usamos con Streams y coleeciones
//y vamos a usarlo con las nuevas herramientas

//Como funciona
//forEach ejecuta una accion por cada elemnto. Con Streams es funcional y elegante

//Ejemplo: Saludar

//Creamos una lista con List.of
//forEach usa una lambda para saludar a cada amigo
//Esto es una forma de imprimir, rapidamente y claro

//Creamos una lista y un Stream
//filter, y seleccionamos los número pares

//forEach imprime cad anumero par
