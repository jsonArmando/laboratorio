package com.java.practice.abstraccion;

public class Humano implements Comestible{

    @Override
    public void comer() {
        System.out.println("Come el humano come pizza");
    }

    @Override
    public void comerVerduras() {
        System.out.println("Ls personas comer vegetales");

    }

    @Override
    public int precioComida() {
        return 1000;
    }
    
}
