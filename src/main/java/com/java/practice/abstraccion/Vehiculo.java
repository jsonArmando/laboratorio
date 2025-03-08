package com.java.practice.abstraccion;

public abstract  class Vehiculo {
    //Método bastracto (sin implementación)
    abstract void mover();

    //Método normal
    void encender(){
        System.out.println("Encender Vehiculo");
    }
    
}
