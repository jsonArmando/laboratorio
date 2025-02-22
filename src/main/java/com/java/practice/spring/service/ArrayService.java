package com.java.practice.spring.service;

import org.springframework.stereotype.Service;

@Service
public class ArrayService {

    public int sumarElementos(int[] numeros) {
        return com.java.practice.basics.Arrays.sumarElementos(numeros);
    }

    public boolean buscarElemento(String[] palabras, String palabraBuscada) {
        return com.java.practice.basics.Arrays.buscarElemento(palabras, palabraBuscada);
    }
}