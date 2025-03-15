package com.java.practice.solid;

public class Main {
    public static void main(String[] args){
        Producto p = new Producto("Libro", 20.0);
        Pedido pedido1 = PedidoFactory.crearPedido("normal", p);
        Pedido pedido2 = PedidoFactory.crearPedido("express", p);

        ConfiguracionEnvio config = ConfiguracionEnvio.getInstacia();

        double costoFinal = pedido2.calcularCosto() - config.getDescuento();

        System.out.println(costoFinal);

    }

}

//Principio SOLID

//Cada clase tiene una sola reponsabilidad, (calcular, describir y configurar)
//O Pedido Factory permite añadir tipos de pedidos sin modificar las clases existentes
//Patrón de diseño que se conoce como Factory

//Fábrica de Objetos

//Este patrón Factory nos ayuda a crear objetos de forma polimórfica sin preocuparnos
//por los deatlas, es Decir, pedir comida en un  restaurante, solo decimos que queremos y no lo preparan

//El patrones de diseños. Nos ayudan a implementar código de una forma estructura
//Optimizar procesos

//Creacionales ---> singlenton, ...
//Estrcucturales -->
//Comportamiento -->

//Microservicios --->

//L PedidoNormal y PedidoExpres son intercambiables como Pedido

//I interfaces separadas (Pedido y Detalle) adicional evitmaos métodos inncesarios

//D Dependemos de Pédido no de clases concretas

//Factory
//Singlenton:  ConfiguracionEnnvio es unico;

//Inmutanilidad, Producto y campos final no cambian

//El patron Sibnglenton asegura que solo exista una instancia de una clase. Usa static para lograrlo

//es supremamente importante par arecursos únicos, y se utiliza en una configuración global




//Principios SOLID: las reglas de oro

//SOLID son 5 principios para hacer código más fácil de mantener y entender

//S (Responsabilidad única): una lase debe hacer una sola cosa
//O (Abierto o cerrado) las clases deben estar abiertas a extensión y cerradas a modificación
//L (Susitución de Liskov) una clase debe ser reemplazable por su clase padre sin problemas
//I (Segregación de interfaces: no debemos obligar a implementar una clase que no usa)
//D (Inversión de dependencias) Depende de abstracciones no de implementaciones concretas

//Ejemplo de Sistema de pedidos

//Las clases inmutables no cambian después de crearse (String). Vamos combinar pincipios SOLID
//Factory, singlenton e inmutabilidad en el ejemplo