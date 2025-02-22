package com.java.practice.basics;

public class Arrays {

    /*
     * Ejemplo 1: Suma de Elementos de un Array
       Este método suma todos los elementos de un array de enteros.

       Ejemplo 2: Búsqueda de un Elemento en un Array
       Este método busca un elemento específico en un array de cadenas.
     */
 // Ejemplo 1: Suma de elementos de un array
 public static int sumarElementos(int[] numeros) {
    int suma = 0;
    for (int numero : numeros) {
        suma += numero;
    }
    return suma;
}

// Ejemplo 2: Búsqueda de un elemento en un array
public static boolean buscarElemento(String[] palabras, String palabraBuscada) {
    for (String palabra : palabras) {
        if (palabra.equals(palabraBuscada)) {
            return true; // Elemento encontrado
        }
    }
    return false; // Elemento no encontrado
}

// Método principal para ejecutar los ejemplos
public static void main(String[] args) {
    // Ejemplo 1: Suma de elementos de un array
    int[] numeros = {1, 2, 3, 4, 5};
    int suma = sumarElementos(numeros);
    System.out.println("La suma de los elementos del array es: " + suma);

    // Ejemplo 2: Búsqueda de un elemento en un array
    String[] palabras = {"Hola", "Mundo", "Java", "Spring"};
    String palabraBuscada = "Java";
    boolean encontrado = buscarElemento(palabras, palabraBuscada);
    System.out.println("¿La palabra '" + palabraBuscada + "' está en el array? " + encontrado);
}
}