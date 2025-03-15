package com.java.practice.exceptions;
public class Main {

    public static void verificarEdad(int edad) throws EdadInvalidException{
        if(edad<0){
            throw new EdadInvalidException("Edad no puede ser negativa");
        }
        System.out.println("Edad valida: " + edad);
    }

	public static void main(String[] args) {
        //Excepciones java ---> como buenos objetos tienen una jerarquía 

        //Throwable ---> (abuelo): la clase raíz para los errores y las excepciones

        //Error --->(tío): cosas graves como fallos de memoria, no podemos controlar facilemnte

        //Exception: --->(primo controlable) problemas que podemos preveer y solucionar dividir por cero

        //POO programación orientada objetos completamente puro, usamos herencia para organizar como manejar con respecto a problemas

        try{
            int resultado = 10/0; //esto lanza una exception tipo ArithmeticException
            System.out.println("Resultado: " + resultado);

        }catch(ArithmeticException e){
            System.out.println("No se puede dividir por cero" + e.getCause());
        }

        //Nota que sucede en este paso

        //10 /0 lanza un objeto de ArithmeticException (que esta excepcion lo hereda Exception)

        //El bloque try-catch atrapa la excepcion como un objeto y nos deja manejarla

        //Nos imprimi el error, no se puede dividir por cero

        //Excepciones personalidazadas: nuestras propieas reglas

        //Queremos definir nuestros  propios errores: podemos crear excepciones personalizadas
        //heredado de la Exception () o RuntimeException (es opcional) esto usa herencia, es un decir
        //un pilar de POO

        try{
            verificarEdad(-10);
        }catch(EdadInvalidException e){
            System.out.println("Error: " + e.getMessage());
        }

        //ControlAdvice
        
        //Que pasa aquí 

        //EdadInvalidException hereda de Exception, y lleva un mensaje personalizado

        //throw lanza nuestro objeto de exception si la edad es negativa

        //El try-catch captura y nos muestra: "El error" + mensaje personalizado

        //Bloques try-catch: manejo orientado a objetos

        //try-catch es como una red de seguridad para atrapar lo objetos de tipo excepcion.

        //Podemos manejar varios tipos de excepcion en un solo bloque. Por que podemos manejar varios tipos de 
        //excepciones por la jerarquía

        //Ejemplo de múltiple excepciones 

        int[] numeros ={1,2,3};

        try {
            //int division = 10/0; //ArithemticException
            System.out.println(numeros[5]); //ArrayIndexOutOfBoundsException
            
        } catch (ArithmeticException e) {
            System.out.println("Error matemático: " + e.getMessage());
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error fuera de rango: " + e.getMessage());
        }catch(Exception e){
            System.out.println("Cualquier otro tipo de error: " + e.getMessage());
        }

        //Que sucede en este caso

        //Intentamos dos cosas: dividir por cero, y acceder a numeros[5] (El arreglo solo tiene tres elementos)
        //try-catch captura ArithmeticException primero y nos muestra //            System.out.println("Error matemático: " + e.getMessage());

        //Si quitamos la división captura ArrayIndexOutOfBoundsException

        //Excepcion al final seria como un "comodín" para cualquier otro tipo de exception




    }
}