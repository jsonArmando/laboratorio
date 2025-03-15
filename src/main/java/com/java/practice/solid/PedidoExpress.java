package com.java.practice.solid;

public class PedidoExpress implements  Pedido, Detalle{
    private final Producto producto;

    PedidoExpress(Producto producto){
        this.producto = producto;
    }

    @Override
    public String getDescripcion() {
        return "Express: " + producto.getNombre();
    }

    @Override
    public double calcularCosto() {
        return producto.getPrecio() +5.0;
    }
}
