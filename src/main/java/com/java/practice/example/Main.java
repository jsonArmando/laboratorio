package com.java.practice.example;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
        System.out.println("Example");


		/*
		 * Polimorfismo
		 * Abstracción en java
		 * Excepciones en Java
		 * Manejo de Objetos y colecciones 
		 * Características de java 11
		 * Ejemplos practicos
		 * Buenas en desarrollo y patrones de diseño
		 */

		 /*
		  * Proxima clase
		  ***El proyecto 
		  ***Realizar un servicio en método get/post (resumen)
		  ***Analizar preguntas de la certificación
		  */


		 //Polimorfismo 

		 /*
		  * Polimorfismo se deriva poli (muchos) y morfimo (formas)
		  En java esto significa algo que puede tener varias formas (en un método
		  o en un objeto) es como si fuera un superpoder hace que el código sea mucho 
		  mas flexible y fácil de usar.
		  Hay dos tipos principales , cuando escribimos el código (tiempo de comilación/sobrecarga)
		  y el otro cuando el program es ta corriendo.


		  Polimorfismo en tiempo de ejecuación (sobrecarga)
		  */

		  Calculadora  calculadora = new Calculadora();
		  //Imprime números enteros
		  System.out.println("Enteros: " + calculadora.sumar(2, 3) );

		  //Imprime números decimales
		  System.out.println("Decimales: " + calculadora.sumar(2.5, 3.5));


		  //Que pasa aquí
		  //Hay dos métodos llamados sumar
		  //Uno usa tipo int (enteros) y otro usa decimales (double)

		  //Polimorfimos en tiempo de ejecución (Sobrescritura)

		  //

		  Animal miPerro = new Perro();
		  Animal miGato = new Gato();

		  miPerro.hacerSonido();
		  miGato.hacerSonido();


		  	//Quer sucede 

	//La clase Animal (super clase o que se conoced como clase padre)
	//Esa clase tiene un método hacerSonido corresponde método base
	//El perro y el gato heredan de la clase Animal y sobreescriben ese método 
	//Aunque usamos una variable tipo Animal Animal (miPerro y miGato), java sabe
	// que son instancias Perro y Gato y la respuesta se usa cuando el programa corre

	//Usando referencia de superclase 
	ArrayList<Animal> animales = new ArrayList<>();
	animales.add(new Perro());
	animales.add(new Gato());

	for(Animal a: animales){
		a.hacerSonido();
	}

	///Que sucede en este caso
	/// 
	/// Creamos una alista de tipo Animal
	/// Añadimos un Perro y un Gato (que son "hijos o subclases" de Animal)
	/// 
	/// Al recorrer la lista en este caso, cada Animal usa su propio hacer sonido
	/// 
	/// aunque tratamos los tratamos como Animal, ¡se conoce co mo polimorfismo!
	/// 
	/// 
	/// Polimorfismo avazando (Interfaces y comoportamiento dinámico)
	/// //El polimorfismo también se usa cuando usamos interfaces, una interfaz es
	/// decir es como un contrato.  decimos que métodos debemos tener en una clase
	/// pero no como interpretarlos. Esto nos genera más fexibilidad, porqie podemos usar 
	/// variables de tipo interfza para manejar cualquier clase que se implemente
	/// 
	/// Figuras geométricas
	/// 
	Figura circulo = new Circulo(5.0);
	Figura rectangulo = new Rectangulo(4.0, 6.0);

	System.out.println("Area del circulo: " + circulo.calcularArea());

	System.out.println("Area del rectangulo: " + rectangulo.calcularArea());


	//Que sucede aca
	//La interfaz figura nos define los métodos (calcularArea y calcular perimetro)
	//Circulo y rectangulo implemneta la interfaz y deciden como calcular su area 
	//(forma del circulo rectangulo)

	//Usamos una variable tipo figura para manejar ambas figuras y java decide el tiempo 
	//de ejecucion qie me´todo usar











	}


	

}