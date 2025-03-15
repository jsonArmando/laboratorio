package com.java.practice.solid;

//Principio O y Factory (patron de diseño)
public class PedidoFactory {
    static Pedido crearPedido(String tipo, Producto producto){
        if("exporess".equals(tipo))return new PedidoExpress(producto);
        return new PedidoNormal(producto);
    }

}
