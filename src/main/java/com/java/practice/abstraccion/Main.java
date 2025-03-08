package com.java.practice.abstraccion;

public class Main {
	public static void main(String[] args) {

        //Abstracción

        //de esconder los detalles complicados y mostrar lo más importante
        //En java las clases abstractas e interfaces, se puede lograr esto.
        //Una clase asbtracta es como un plano a medio terminar
        //Las declaramos con la palabra abstract y puede tener:

        //Métodos normales (con código)
        //Métodos abstractos (sin código solo la "idea"), que las subclases
        //deben complementar

        //No podemos crear objetos directamente de una clase abstracta, 
        //pero sirve como base para otras clases
        
        Vehiculo miCoche = new Coche();
        Vehiculo miBicicleta = new Bicicleta();

        miCoche.encender(); //Imprime, vehiculo encendido
        miCoche.mover(); //Imprimer, el coche avanza por la carretera

        miBicicleta.mover(); //imprimer: la bicicleta pedalea
        //Nota:

        //Vehiculo: es abastracta y método mover
        //Coche y Bicicleta heredan de Vehiculo y dan una propia version de mover

        //Podemos usar encender directamente porque ya tiene código en la clase
        //abstracta

        //Interfaces: reglas para todos

        //Una interfaz es como un contrato: las interfaces o se define 
        // con la palabara "interface" y las clases que la usan
        // con "implements" 
        //Pura abstracción: solo dice qué haacer no como hacerlo
        //Una clase puede implementar varias interfaces, como tener multiples super
        //poderes

        Comestible persona = new Humano();
        Comestible mascota = new Perro();

        persona.comer(); //Imprime el humano, come pizza
        mascota.comer(); //Imprime el perro come croquetas

        //Métodos por defecto de interfaces: flexibilidad

        //Desde java 8, las interfaces pueden tener métodos por defecto con la palabra 

        //default. Que siginifca esto, se puede dar una implementación básica y las clases
        //que usan la interfaz no estan obligadas a cambiarlas (pueden hacerlo si quieren)
        //Es opcional 
        //Ejemplo
        Maquina miRobot = new Robot();
        Maquina miDrone = new Drone();

        miRobot.encender(); //Imprime la maquina enciende
        miRobot.funcionar(); //Imprime el robot empieza a trabajar

        miDrone.encender(); //Imprime se enciende con baterias
        miDrone.funcionar(); //Imprime despega

        //Nota: 
        //Maquina tiene un me´todo abtrascto funcionar y un método por defceto encender
        //El robot usa el encender por defecto, pero el drone lo cambia

        //Esto genera flexibilida sin rompoer el contrato de la interfaz

        //Abstracción avanzada: combinando con métodos estáticos

        //Las interfaces también pueden tener métodos estaticos 
        //Desde java 8> son como herramienta utiles que no necesitan un objeto 
        //para usarse 
        //Combinación de clases abstractas, interfaces métodos por defecto y estáticos 

        //Ejemplo más complejo 

        //Sistema de roles de una empresa de emmpleados
        //Sistema de empleados  donde tienen roles, habiliades. 
        //Una clase abstracta, nterfaces métodos por defecto, estáticos y múltiples implementaciones
        //

        Empleado programador = new Programador("Ana");
        Empleado diseniador = new Diseniador("Pablo");

        programador.saludar(); //Imprime Hola soy, Ana
        programador.trabajar(); //Imprime Anata está programando

        ((Habilidad)programador).entrenar(); //Imprime Entrenando habilidad ..

        ((Habilidad) programador).entrenar(); //Imprime Entrenando habilidad ..

        diseniador.saludar(); //Imprime Hola soy, Pablo
        diseniador.trabajar(); //Imprime Pablo esta diseñando memes

        ((Habilidad) diseniador).usarHabilidad(); //Imprime crea un diseño de meme avanzado

        //Método estático de la interfaz
        Habilidad.describirHabilidad(); //Imprime las habiliades mejoran la prática

        //Nota 
        //Empleado es una clase asbtracta, esa clase tiene un método abstracto (trabajar())
        //y un método normal (saludar())

        //Habilidad es una intrefaz con un método abstracto usarHabilidad(), un método 
        //por defecto entrenar() y un método estático describirHabilidad()

        //Programador y disenador heredan de Empleado implementa de habilidad,
        //Es decir estamos personalizando los método su rol
        
        //Usamos "CASTING" ejemplo (((Habilidad) programador).entrenar();) para
        //acceder los métodos a partir de la interfaz, mostrando como todo se combina

        //El método estático se llama directamente de la interfaz sin necesidad de un objeto

        //Clases abstractas, son planos con métodos abstractos y normales
        //Interfaces contratos o reglas sin implementa (titulo)
        //Métodos por defecto: dan felxibilidad a las interfaces
        //Métodos estaticos herramientas utiles en interfaces




    }
}
