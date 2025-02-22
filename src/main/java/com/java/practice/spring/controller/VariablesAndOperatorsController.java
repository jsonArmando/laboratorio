package com.java.practice.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.practice.spring.service.VariablesAndOperatorsService;

@RestController
@RequestMapping("/api/variables-operadores")
public class VariablesAndOperatorsController {

    @Autowired
    private VariablesAndOperatorsService variablesAndOperatorsService;

    @GetMapping("/ejecutar-ejemplos")
    public String ejecutarEjemplos() {
        variablesAndOperatorsService.ejecutarEjemplos();
        return "Ejemplos ejecutados. Revisa la consola para ver los resultados.";
    }
}