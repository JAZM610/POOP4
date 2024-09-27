/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop4;

/**
 * Clase principal del programa POOP4.
 * 
 * @author teran
 */
public class POOP4 { // camel case 

    /**
     * Método principal que se ejecuta al iniciar el programa.
     * 
     * @param args Argumentos de la línea de comandos (no utilizados en este programa).
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("########## DIAGRAMA DE CLASE (PUNTO) ##########");
        Punto punto = new Punto(); // Definir
        punto.imprimePunto();
        Punto punto2 = new Punto(1, 2, "punto 2"); // Inicializar
        punto2.imprimePunto();
        
        punto.x = 20; // Inflando un objeto (dando información)
        punto.y = 100;
        punto.nombre = "punto 1";
        punto.imprimePunto();
        System.out.println(punto); // @ significa AT (en)
        
        
        System.out.println("########## DIAGRAMA DE CLASE (PERRO) ##########");
        Perro perro = new Perro();
        perro.imprimirPerro();
        Perro perro2 = new Perro("café", "chino", 20, "Chihuahua", 2);
        perro2.imprimirPerro();
        perro2.jugar();
        perro2.comer();
        perro2.correr();
        perro2.morder();
        perro2.saltar(3.5f, 7, 9); // Los flotantes se escriben con f. 
        
        
        System.out.println("########## DIAGRAMA DE CLASE (COCHE) ##########");
        Coche coche = new Coche();
        coche.imprimirCoche();
        Coche coche2 = new Coche("Rojo", "Vento", 4, 4, 3);
        coche2.imprimirCoche();
        coche2.transportar();
        coche2.encender();
        coche2.acelerar();
        coche2.frenar();
        coche2.apagar();
        
        
        System.out.println("########## DIAGRAMA DE CLASE (ALUMNO) ##########");
        Alumno alumno = new Alumno(); 
        alumno.imprimirAlumno();
        Alumno alumno2 = new Alumno(19, 1.60f, "Programación Orientada a Objetos", 8f, 5);
        alumno2.imprimirAlumno();
        alumno2.estudiar();
        alumno2.asistiraclases();
        alumno2.participar();
        alumno2.socializar();
        alumno2.leer();
        
        
        System.out.println("########## DIAGRAMA DE CLASE (PROFESOR) ##########");
        Profesor profesor = new Profesor(); 
        profesor.imprimirProfesor();
        Profesor profesor2 = new Profesor(32, "Estructura de Datos y Algoritmos", 8596142140L, "Ingeniería en Computación", 5);
        profesor2.imprimirProfesor();
        profesor2.impartirclases();
        profesor2.evaluar();
        profesor2.asesorar();
        profesor2.comunicar();
        profesor2.gestionaraula();
        
        
        System.out.println("########## DIAGRAMA DE CLASE (TRIÁNGULO RECTÁNGULO) ##########");
        Triángulo_Rectángulo triángulo_rectángulo = new Triángulo_Rectángulo();
        triángulo_rectángulo.imprimirTriángulo_Rectángulo();
        Triángulo_Rectángulo triángulo_rectángulo2 = new Triángulo_Rectángulo(90, 10.5, 12.1, 15.2, 37.8f);
        triángulo_rectángulo2.imprimirTriángulo_Rectángulo();
        triángulo_rectángulo2.def_rel_trigo();
        triángulo_rectángulo2.aplic_teo_pitagoras();
        triángulo_rectángulo2.deter_alturas_distancias();
        triángulo_rectángulo2.resolv_probl_ang();
        triángulo_rectángulo2.calc_areas();
    }
    // TAREA: TERMINAR CON LOS OTROS DIAGRAMAS DE CLASE
}
