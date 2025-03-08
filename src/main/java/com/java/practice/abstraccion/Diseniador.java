package com.java.practice.abstraccion;

public class Diseniador extends Empleado implements Habilidad{

    Diseniador(String nombre){
        super(nombre);
    }

    @Override
    void trabajar(){
        System.out.println(nombre + "El esta diseñando");
    }

    @Override
    public void usarHabilidad(){
        System.out.println(nombre + "crando un dieño de memes");
    }

    @Override
    public void entrenar(){
        System.out.println(nombre + "el esta diseñando un meme avanzado");

    } 
}
