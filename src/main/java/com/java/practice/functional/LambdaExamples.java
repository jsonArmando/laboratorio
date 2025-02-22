package com.java.practice.functional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LambdaExamples {

    /*
     * Ejemplo 1: Uso de una expresión lambda con la interfaz Runnable
Este ejemplo muestra cómo usar una expresión lambda para implementar la interfaz Runnable, que se usa comúnmente para crear hilos.

Ejemplo 2: Uso de una expresión lambda con la interfaz funcional Consumer
Este ejemplo muestra cómo usar una expresión lambda con la interfaz Consumer para procesar elementos de una lista.
     */
    // Ejemplo 1: Uso de una expresión lambda con la interfaz Runnable
    public static void ejemploRunnable() {
        // Implementación tradicional de Runnable usando una clase anónima
        Runnable runnableTradicional = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hola desde Runnable tradicional.");
            }
        };

        // Implementación de Runnable usando una expresión lambda
        Runnable runnableLambda = () -> System.out.println("Hola desde Runnable con lambda.");

        // Ejecutar ambos Runnable
        runnableTradicional.run();
        runnableLambda.run();
    }

    // Ejemplo 2: Uso de una expresión lambda con la interfaz funcional Consumer
    public static void ejemploConsumer() {
        // Lista de nombres
        List<String> nombres = Arrays.asList("Alice", "Bob", "Charlie", "Diana");

        // Implementación tradicional de Consumer usando una clase anónima
        Consumer<String> consumerTradicional = new Consumer<String>() {
            @Override
            public void accept(String nombre) {
                System.out.println("Nombre: " + nombre);
            }
        };

        // Implementación de Consumer usando una expresión lambda
        Consumer<String> consumerLambda = nombre -> System.out.println("Nombre: " + nombre);

        // Procesar la lista con ambos Consumer
        System.out.println("Usando Consumer tradicional:");
        nombres.forEach(consumerTradicional);

        System.out.println("\nUsando Consumer con lambda:");
        nombres.forEach(consumerLambda);

        // También puedes usar una lambda directamente en el forEach
        System.out.println("\nUsando lambda directamente en forEach:");
        nombres.forEach(nombre -> System.out.println("Nombre: " + nombre));
    }

    // Método principal para ejecutar los ejemplos
    public static void main(String[] args) {
        // Ejemplo 1: Uso de Runnable con lambda
        System.out.println("--- Ejemplo 1: Runnable con lambda ---");
        ejemploRunnable();

        // Ejemplo 2: Uso de Consumer con lambda
        System.out.println("\n--- Ejemplo 2: Consumer con lambda ---");
        ejemploConsumer();
    }
}
