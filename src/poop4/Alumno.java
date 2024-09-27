/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop4;

/**
 * Clase que representa a un Alumno.
 * 
 * @author teran
 */
public class Alumno {
    int edad; 
    float estatura; 
    String materiafavorita; 
    float promedio;
    int nummaterias;
    
    /**
     * Constructor por defecto de la clase Alumno.
     * Inicializa los atributos con valores predeterminados.
     */
    public Alumno() {
        edad = 0; 
        estatura = 0; 
        materiafavorita = null; 
        promedio = 0; 
        nummaterias = 0; 
    }
    
    /**
     * Constructor con parámetros de la clase Alumno.
     * 
     * @param edad Edad del alumno.
     * @param estatura Estatura del alumno.
     * @param materiafavorita Materia favorita del alumno.
     * @param promedio Promedio del alumno.
     * @param nummaterias Número de materias del alumno.
     */
    public Alumno(int edad, float estatura, String materiafavorita, float promedio, int nummaterias) {
        this.edad = edad; 
        this.estatura = estatura; 
        this.materiafavorita = materiafavorita; 
        this.promedio = promedio;
        this.nummaterias = nummaterias; 
    }
    
    /**
     * Método para imprimir la información del alumno.
     */
    public void imprimirAlumno() {
        System.out.println("Edad: " + edad + " Estatura: " + estatura + " Materia Favorita: " + materiafavorita + " Promedio: " + promedio + " Número de materias: " + nummaterias);
    }
    
    /**
     * Método que simula que el alumno está estudiando.
     */
    public void estudiar() {
        System.out.println("El alumno estudia");
    }
    
    /**
     * Método que simula la asistencia del alumno a clases.
     * 
     * @return true si el alumno asiste a clases.
     */
    public boolean asistiraclases() {
        System.out.println("Tiene asistencia");
        return true; 
    }
    
    /**
     * Método que simula la participación del alumno en clase.
     */
    public void participar() {
        System.out.println("Participa en clase");
    }
    
    /**
     * Método que simula que el alumno es sociable.
     * 
     * @return true si el alumno es sociable.
     */
    public boolean socializar() {
        System.out.println("Es muy sociable");
        return true; 
    }
    
    /**
     * Método que simula que el alumno realiza mucha lectura.
     * 
     * @return true si el alumno realiza mucha lectura.
     */
    public boolean leer() {
        System.out.println("Realiza mucha lectura");
        return true; 
    }
}
