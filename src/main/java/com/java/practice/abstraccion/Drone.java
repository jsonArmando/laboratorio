package com.java.practice.abstraccion;

public class Drone implements Maquina{

    @Override
    public void funcionar() {
        System.out.println("El drone despega");
    }
    @Override
    public void encender(){
        System.out.println("El drone enciende con baterias");
    }
    
}
