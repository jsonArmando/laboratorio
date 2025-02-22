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
    //Recorrido básico de un array utilizando for tradicional
    int[] numeros = {1, 2, 3, 4, 5};

    for(int i=0;i<numeros.length; i++){
        System.out.println("RECORRIDOS DE ARRAY: " + numeros[i]);
    }

    //For each
    for(int numero: numeros){
        System.out.println("recorrido con for each: " + numero);

    }

    int[] numeros2 = {1, 2, 3, 4, 5, 2, 4, 5, 6, 1, 2, 4};
    Arrays.sort(numeros2);
    Arrays.binarySearch(numeros2, 6);

    int[] numeros3 = {1, 2, 3, 4, 5, 2, 4, 5, 6, 1, 2, 4};

    Arrays.equals(numeros2, numeros3); //true, false

    int[] copy_numeros3 = Arrays.copyOf(numeros3);

    System.out.println(copy_numeros3);

    


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

    for(int i=0;i<numeros.length; i++){
        System.out.println("RECORRIDOS DE ARRAY: " + numeros[i]);
    }
    int suma = sumarElementos(numeros);
    System.out.println("La suma de los elementos del array es: " + suma);

    //Metodos de ordenamiento
    //Como podemos recorrer un array, con ciclos, ejemplo For tradicional

    // Ejemplo 2: Búsqueda de un elemento en un array
    String[] palabras = {"Hola", "Mundo", "Java", "Spring"};
    String palabraBuscada = "Java";
    boolean encontrado = buscarElemento(palabras, palabraBuscada);
    System.out.println("¿La palabra corresponde '" + palabraBuscada + "' está en el array? " + encontrado);
}

    private static void sort(int[] numeros2) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    private static void binarySearch(int[] numeros2, int i) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    private static int[] copyOf(int[] numeros3) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    private static void equals(int[] numeros2, int[] numeros3) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}