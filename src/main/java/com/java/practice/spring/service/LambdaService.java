package com.java.practice.spring.service;

import org.springframework.stereotype.Service;

import com.java.practice.functional.LambdaExamples;

@Service
public class LambdaService {

    public void ejecutarEjemplos() {
        LambdaExamples.ejemploRunnable();  // Ejemplo 1
        LambdaExamples.ejemploConsumer();  // Ejemplo 2
    }
}