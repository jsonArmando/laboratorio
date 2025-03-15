package com.java.practice.java;
import java.util.Arrays;
import java.util.List;
//podemos usar var dentro expresiones para definir varibles sin eescribir el tipo 
//exacto. Esto hace que el código sea más limpio y siendo polimorfismo
//podemos usar tipos genericos o heredados. 

//Ejemplo vamos a convertir nombres a mayusculas usando var en una lambda
public class Main {
    public static void main(String[] args){
        List<String> nombres = Arrays.asList("Jose","Armando", "Ana");
        nombres.stream().map((var nombre)->nombre.toUpperCase()).forEach(System.out::println);
    
        String texto= " Hola Mundo  ";
        System.out.println("Vacio"+  texto.isBlank());

        //Imprime Vacio false

        System.out.println("Sin espacios"+  texto.strip());
        //Imprimie: Sin espacios: HolaMundo

        texto.lines().forEach(System.out::println);

        //Imprimie: Hola Mundo (en lineas separadas)
        String nombre = "  jose  ";
    }


    //Api de cadenas mejorada: más poder en los String
    //en java 11 se dio un ugrade a la clase String con nuevos métodos isBlanck(),
    //lines(), strip(). Que son utiles para manejar textos como objetos y encajan perfecto OPP
    //ya que un String es inmutable y estos métodos devuelven objetos

    //Usar nuevos métodos
}

//Que sucede aca 
//(var nombre) reemplza algo (String nombre)v Java deduce que String por defecto

//Sigue siendo polimorfismo, podremos usar una interfaz o clase padre si los elementos fueran genéricos

//El código se vuelve más corto y fácil de leer, manteniendo de esencia de programación orientada objetos

//Que suecede aca

//isBlank(): nos dice que el texto es solo espacios o esta vacío
//strip(): quita espacios al inicio y al final (mejor que trim() porque soporta Unicode)
//lines() divide el texto en lineas, devolviento un Stream (Programación orientada a objetos con colecciones)

//Interfaz NestMate: amigas anidas 
//En java 11 se introdujo "nest-based access control" (control de acceso basado en nidos)
//Esto hace que una clase anidadas (iinternas o estáticas) sean parte de un "nido",
//y puedan acceder a los miembros provados de otras sin trucos. 
//Es decir en programación orientada a objetos nos organizar mejor las clases relacio nadas

//Ejemplo: una clase con su ayudante aninado