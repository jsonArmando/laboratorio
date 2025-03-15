package com.java.practice.solid;

//Clase inmutable
public class Producto {
    private final String nombre;
    private final double precio;

    Producto(String nombre, double precio){
        this.nombre =nombre;
        this.precio = precio;
    }

    public String getNombre() {return nombre;}
    public double getPrecio(){return precio;}

}
