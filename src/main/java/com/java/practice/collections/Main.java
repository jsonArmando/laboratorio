package com.java.practice.collections;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
	public static void main(String[] args) {
        //Manejo de objetos y colecciones
        //String y Integer (wrapper) se usa para colecciones
        //wrapper se contenedores de datos tipos primitivos que conviernten a objetos

        //La clase String: las palabras son objetos, que son inmutables lo que signifca que no 
        //podemos cambiar de una vez creados (es como escribir con un marcador permanente)

        String saludo = "Hola, mundo!";
        //Imprime la longitud
        System.out.println("Longitud: " + saludo.length());

        //Pasamos a mayusculas
        System.out.println("Mayusculas: " + saludo.toUpperCase());

        //Reemplazamos
        System.out.println("Mayusculas: " + saludo.replace("mundo", "cualquier cosas"));

        //Que pasa aca, el saludo es un objeto tipo String
        //Los métodos length, upper. ... nos dan información nueva de los String

        //Clases wrapper: números como objetos

        //los números simples como int y double no son objetos, pero a veces los necesitamos
        //tratarlos como tales. Ingresamos las clases wrapper como Integer y Double

        //Autoboxing (convertir de primitivo a wrapper)
        //unboxing (wrapper a primitivo)

        //Ejemplo

        int numeroPrimitivo = 43;
        Integer numeroObjeto = numeroPrimitivo;

        //Usando métodos de Integer
        System.out.println("Como String: " + numeroObjeto.toString());
        //Imprimie: como String 43

        System.out.println("Máximo: " + Integer.max(10, numeroObjeto));
        //Imprmie Maximo 43

        //Unboxing: de Integer a int
        int resultado = numeroObjeto + 5; //Java convierte automaticamente

        System.out.println("suma" + resultado);

                //Unboxing: de Integer a int
        int suma = numeroObjeto + 5; //Java convierte automaticamente


        System.out.println("suma" + suma);



        //Integer numeroObjeto = numeroPrimitivo es autoboxing, el int se convierte en un objeto inteer
        //Podemos usar métodos toString porque ahora es tipo objeto

        //int suma =         int suma = numeroObjeto + 5; //Java convierte automaticamente

        //unboxing el integer se vuelve a convertir tipo int (primitivo)

        //Colecciones en java:  organizando objetos
        //Guardar muchos objetos. POO son super útiles porque nos permiten manejar datos de una forma
        //Flexible

        //List (ArrayList) una ordena una lista donde podemos repetir elementos

        //Set (HastSet) un conjunto sin duplicados

        //Map (HashMap) pares clave-valor como un diccionario //diccionario //

        //Usemos un ArrayList para guardar frutas

        ArrayList<String> fruit = new ArrayList<>();

        //Agregar frutas

        fruit.add("Apple");
        fruit.add("PineApple");
        fruit.add("Banana");
        System.out.println("Frutas " + fruit); //Imprimie las frutas

        //Acceder y modificar

        System.out.println("Frutas " + fruit.get(0));  //Imprime la primera fruta: Apple

        fruit.remove("Banana"); // Elimina banana
        System.out.println("Frutas " + fruit); //Imprimie las frutas

        //Nota

        //ArrayList<String> crea una lista que solo guarda objetos String

        //Los métodos add, get, remove nos manipular la lista

        //Estos objetos encaja en OOP/POO

        //Colecciones avanzadas: combinando  todo 

        //Vamos a usar un String, clases wrapper y varias coleeciones juntas, ejemplo más realista

        //Sistema de calificaciones

        //Creamos un programa que va usar HashMap, para asociar nombre con calificaciones 
        //mezclar String, Double y colecciones

        //Mapa de estudiantes y sus Calificaciones

        HashMap<String, ArrayList<Double>> calificaiones = new HashMap<>();

        //Lista de calificaciones para Jose

        ArrayList<Double> notasJose = new ArrayList<>();
        notasJose.add(4.5);
        notasJose.add(1.0);
        notasJose.add(3.6);
        notasJose.add(3.1);
        calificaiones.put("Jose", notasJose);


        
        ArrayList<Double> notasLuis = new ArrayList<>();
        notasLuis.add(1.5);
        notasLuis.add(3.6);
        notasLuis.add(3.1);
        calificaiones.put("Luis", notasLuis);

        //Mostrar promedio Jose
        double sumaJose = 0.0;
        for(Double nota: calificaiones.get("Jose")){
            sumaJose += nota;
        }

        double promedioJose = sumaJose/calificaiones.get("Jose").size();

        System.out.println("Promerdio de Jose corresponde: " + promedioJose);

        //HashMap<String, ArrayList<Double>> asocia nombres (String) con lista de calificaciones ArrayList<Double>

        //Usamos autoboxing al agregar notas (notasJose.add(4.5)) y unboxing al sumarlas (sumaJose += nota)

        //String inmutable, tiene métodos utiles como length
        //Clases wrapper convierte primitivos a objetos autoboxing/unboxing
        //Integer

        //Colecciones List (ordenado) set (sin duplicados ) Map (clave valor)
        //Podemos combinar tod en sistemas reales, ejemplo las calificaciones


 















    }
}
