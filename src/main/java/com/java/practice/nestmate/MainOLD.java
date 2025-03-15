package com.java.practice.nestmate;

public class MainOLD {
    private String secreto = "Soy un secreto";

    class Ayudante{
        void revelar(){
            System.out.println("El secreto es: "+ secreto);
        }
    }

    public static void main(String[] args){
        MainOLD main = new MainOLD();
        MainOLD.Ayudante ayudante = main.new Ayudante();
        ayudante.revelar(); //Imprime: El secreto es: Soy un secreto
    }
}

//Interfaz NestMate: amigas anidas 
//En java 11 se introdujo "nest-based access control" (control de acceso basado en nidos)
//Esto hace que una clase anidadas (iinternas o estáticas) sean parte de un "nido",
//y puedan acceder a los miembros privados de otras sin trucos. 
//Es decir en programación orientada a objetos nos organizar mejor las clases relacio nadas

//Ejemplo: una clase con su ayudante aninado

//Que suecede aca:
//Ayudante accede al campo privado secreto porque son del mismo "nido"

//Antes de java 11, esto rquería permisos especiales o reflexión, ahora es esto es natural y seguro

//Esto se conoce en POO como puro: encapsulamiento con acceso controlado entre clases relacionadas