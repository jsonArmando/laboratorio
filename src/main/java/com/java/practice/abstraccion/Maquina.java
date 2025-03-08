package com.java.practice.abstraccion;

public interface Maquina {
    void funcionar();
    default void encender(){
        System.out.println("La máquina se enciende automáticamente");
    }
    
}
