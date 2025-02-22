package com.java.practice.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.practice.spring.service.FlowControlService;

@RestController
@RequestMapping("/api/flowcontrol")
public class FlowControlController {

    @Autowired
    private FlowControlService flowControlService;

    @GetMapping("/ejecutar")
    public String ejecutarEjemplos() {
        flowControlService.ejecutarEjemplos();
        return "Ejemplos de control de flujo ejecutados.";
    }
}