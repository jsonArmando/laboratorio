package com.java.practice.abstraccion;

public interface Habilidad {
    void usarHabilidad();
    default void entrenar(){
        System.out.println("Entrenando la habiliad ...");
    }
    static void describirHabilidad(){
        System.out.println("Las habiliades mejoran con la práctica");
    }
}
