package com.java.practice.spring.service;

import org.springframework.stereotype.Service;

import com.java.practice.basics.FlowControl;

@Service
public class FlowControlService {

    public void ejecutarEjemplos() {
        FlowControl.clasificarNumero(10);  // Ejemplo 1
        FlowControl.iterarConBucles();     // Ejemplo 2
    }
}