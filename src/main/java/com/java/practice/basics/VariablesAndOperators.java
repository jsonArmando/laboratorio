package com.java.practice.basics;

public class VariablesAndOperators {

    // Ejemplo 1: Uso de variables y operadores aritméticos
    public static void ejemploVariablesYOperadoresAritmeticos() {
        // Declaración de variables
        int a = 10;
        int b = 5;

        // Operadores aritméticos
        int suma = a + b;
        int resta = a - b;
        int multiplicacion = a * b;
        int division = a / b;
        int modulo = a % b;

        // Mostrar resultados
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);
        System.out.println("Módulo: " + modulo);
    }

    // Ejemplo 2: Uso de operadores de comparación y lógicos
    public static void ejemploOperadoresComparacionYLogicos() {
        // Declaración de variables
        int x = 10;
        int y = 20;

        // Operadores de comparación
        boolean esMayor = x > y;
        boolean esMenor = x < y;
        boolean esIgual = x == y;
        boolean esDiferente = x != y;

        // Operadores lógicos
        boolean andLogico = (x > 5) && (y < 30);
        boolean orLogico = (x > 15) || (y < 25);
        boolean notLogico = !(x == y);

        // Mostrar resultados
        System.out.println("¿x es mayor que y? " + esMayor);
        System.out.println("¿x es menor que y? " + esMenor);
        System.out.println("¿x es igual a y? " + esIgual);
        System.out.println("¿x es diferente de y? " + esDiferente);
        System.out.println("¿x > 5 AND y < 30? " + andLogico);
        System.out.println("¿x > 15 OR y < 25? " + orLogico);
        System.out.println("¿NOT (x == y)? " + notLogico);
    }

    // Método principal para ejecutar los ejemplos
    public static void main(String[] args) {
        System.out.println("=== Ejemplo 1: Variables y Operadores Aritméticos ===");
        ejemploVariablesYOperadoresAritmeticos();

        System.out.println("\n=== Ejemplo 2: Operadores de Comparación y Lógicos ===");
        ejemploOperadoresComparacionYLogicos();
    }
}