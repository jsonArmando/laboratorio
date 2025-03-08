package com.java.practice.abstraccion;

public class Perro implements Comestible{

    @Override
    public void comer() {
        System.out.println("El perro come croquetas");
    }

    @Override
    public void comerVerduras() {
        System.out.println("El perro come croquetas");

    }

    @Override
    public int precioComida() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'precioComida'");
    }


    
}
