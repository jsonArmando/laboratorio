package com.java.practice.abstraccion;

public abstract class Empleado {
    String nombre;
    Empleado(String nombre){
        this.nombre = nombre;
    }

    abstract void trabajar();

    void saludar(){
        System.out.println("Hola soy: " +nombre);
    }
}
