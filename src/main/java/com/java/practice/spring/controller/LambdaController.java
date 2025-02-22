package com.java.practice.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.practice.spring.service.LambdaService;

@RestController
@RequestMapping("/api/lambda")
public class LambdaController {

    @Autowired
    private LambdaService lambdaService;

    @GetMapping("/ejecutar")
    public String ejecutarEjemplos() {
        lambdaService.ejecutarEjemplos();
        return "Ejemplos de lambda ejecutados.";
    }
}