package com.java.practice.abstraccion;

public class Programador extends Empleado implements Habilidad{
    Programador(String nombre){
        super(nombre);
    }

    @Override
    void trabajar(){
        System.out.println(nombre + "esta programando ");
    }

    @Override
    public void usarHabilidad(){
        System.out.println(nombre + " escribe código limpio");
    }
    
}
