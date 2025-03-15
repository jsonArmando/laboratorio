package com.java.practice.solid;

//Clases con Principio S y L
public class PedidoNormal implements  Pedido, Detalle{

    private final Producto producto;
     PedidoNormal(Producto producto){
        this.producto = producto;
     }

    @Override
    public String getDescripcion() {
        return "Pedido de " + producto.getNombre();
    }

    @Override
    public double calcularCosto() {
        return producto.getPrecio();
    }

}
