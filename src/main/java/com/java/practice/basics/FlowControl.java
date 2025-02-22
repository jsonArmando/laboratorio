package com.java.practice.basics;

public class FlowControl {

    /*
     * Ejemplo 1: Uso de if-else y switch
     Este método clasifica un número en positivo, negativo o cero, y luego usa un switch para imprimir un mensaje basado en el día de la semana.

     Ejemplo 2: Uso de bucles (for, while, do-while)
     Este método muestra cómo usar diferentes tipos de bucles para iterar sobre un array de números.
     */

    // Ejemplo 1: Uso de if-else y switch
    public static void clasificarNumero(int numero) {
        // Uso de if-else
        if (numero > 0) {
            System.out.println("El número " + numero + " es positivo.");
        } else if (numero < 0) {
            System.out.println("El número " + numero + " es negativo.");
        } else {
            System.out.println("El número es cero.");
        }

        // Uso de switch
        int diaDeLaSemana = 3; // Supongamos que 1 = Lunes, 2 = Martes, ..., 7 = Domingo
        switch (diaDeLaSemana) {
            case 1:
                System.out.println("Hoy es Lunes.");
                break;
            case 2:
                System.out.println("Hoy es Martes.");
                break;
            case 3:
                System.out.println("Hoy es Miércoles.");
                break;
            case 4:
                System.out.println("Hoy es Jueves.");
                break;
            case 5:
                System.out.println("Hoy es Viernes.");
                break;
            case 6:
                System.out.println("Hoy es Sábado.");
                break;
            case 7:
                System.out.println("Hoy es Domingo.");
                break;
            default:
                System.out.println("Día no válido.");
        }
    }

// Ejemplo 2: Uso de bucles (for, while, do-while)
    public static void iterarConBucles() {
        int[] numeros = {1, 2, 3, 4, 5};

        // Bucle for
        System.out.println("Bucle for:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Número: " + numeros[i]);
        }

        // Bucle while
        System.out.println("Bucle while:");
        int j = 0;
        while (j < numeros.length) {
            System.out.println("Número: " + numeros[j]);
            j++;
        }

        // Bucle do-while
        System.out.println("Bucle do-while:");
        int k = 0;
        do {
            System.out.println("Número: " + numeros[k]);
            k++;
        } while (k < numeros.length);
    }

// Método principal para ejecutar los ejemplos
    public static void main(String[] args) {
        // Ejemplo 1: Uso de if-else y switch
        System.out.println("--- Ejemplo 1: if-else y switch ---");
        clasificarNumero(10);  // Número positivo
        clasificarNumero(-5); // Número negativo
        clasificarNumero(0);   // Cero

        // Ejemplo 2: Uso de bucles
        System.out.println("\n--- Ejemplo 2: Bucles ---");
        iterarConBucles();
    }
    
}
