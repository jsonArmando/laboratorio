package com.java.practice.spring.service;

import org.springframework.stereotype.Service;

import com.java.practice.basics.VariablesAndOperators;

@Service
public class VariablesAndOperatorsService {

    public void ejecutarEjemplos() {
        VariablesAndOperators.ejemploVariablesYOperadoresAritmeticos();
        VariablesAndOperators.ejemploOperadoresComparacionYLogicos();
    }
}