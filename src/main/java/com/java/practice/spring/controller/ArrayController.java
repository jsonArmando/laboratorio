package com.java.practice.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.java.practice.spring.service.ArrayService;

@RestController
@RequestMapping("/api/arrays")
public class ArrayController {

    @Autowired
    private ArrayService arrayService;

    @PostMapping("/sumar")
    public int sumarElementos(@RequestBody int[] numeros) {
        return arrayService.sumarElementos(numeros);
    }

    @GetMapping("/buscar")
    public boolean buscarElemento(@RequestParam String[] palabras, @RequestParam String palabraBuscada) {
        return arrayService.buscarElemento(palabras, palabraBuscada);
    }
}