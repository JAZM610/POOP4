/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop4;

/**
 * Clase que representa a un Profesor.
 * 
 * @author teran
 */
public class Profesor {
    int edad; 
    String materia; 
    long cedula; 
    String carrera_ejercida;
    int años_experiencia;
    
    /**
     * Constructor por defecto de la clase Profesor.
     * Inicializa los atributos con valores predeterminados.
     */
    public Profesor() {
        edad = 0; 
        materia = null; 
        cedula = 0; 
        carrera_ejercida = null;
        años_experiencia = 0; 
    }
    
    /**
     * Constructor con parámetros de la clase Profesor.
     * 
     * @param edad Edad del profesor.
     * @param materia Materia que imparte el profesor.
     * @param cedula Cédula profesional del profesor.
     * @param carrera_ejercida Carrera ejercida por el profesor.
     * @param años_experiencia Años de experiencia del profesor.
     */
    public Profesor(int edad, String materia, long cedula, String carrera_ejercida, int años_experiencia) {
        this.edad = edad; 
        this.materia = materia; 
        this.cedula = cedula; 
        this.carrera_ejercida = carrera_ejercida;
        this.años_experiencia = años_experiencia; 
    }
    
    /**
     * Método para imprimir la información del profesor.
     */
    public void imprimirProfesor() {
        System.out.println("Edad: " + edad + " Materia que imparte: " + materia + " Cédula Profesional: " + cedula + " Licenciatura: " + carrera_ejercida + " Experiencia Laboral: " + años_experiencia + " años");
    }
    
    /**
     * Método que simula que el profesor está impartiendo clases.
     */
    public void impartirclases() {
        System.out.println("Está dando clase");
    }
    
    /**
     * Método que simula que el profesor está evaluando.
     * 
     * @return true si el profesor evalúa de forma correcta.
     */
    public boolean evaluar() {
        System.out.println("Evalúa de forma correcta");
        return true;
    }
    
    /**
     * Método que simula que el profesor está asesorando.
     */
    public void asesorar() {
        System.out.println("Te ayuda en las clases");
    }
    
    /**
     * Método que simula que el profesor está comunicándose.
     */
    public void comunicar() {
        System.out.println("Es bueno comunicándose con los alumnos");
    }
    
    /**
     * Método que simula que el profesor está gestionando el aula.
     */
    public void gestionaraula() {
        System.out.println("Gestiona el salón de forma correcta");
    }
}
