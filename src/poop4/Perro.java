/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop4;

/**
 * Clase que representa un Perro.
 * 
 * @author teran
 */
public class Perro {
    String color;
    String pelaje; 
    int tamaño;
    String raza; 
    int edad; 
    
    /**
     * Constructor por defecto de la clase Perro.
     * Inicializa los atributos con valores predeterminados.
     */
    public Perro() {
        color = null; 
        pelaje = null; 
        tamaño = 0;
        raza = null; 
        edad = 0; 
    }
    
    /**
     * Constructor con parámetros de la clase Perro.
     * 
     * @param color Color del perro.
     * @param pelaje Tipo de pelaje del perro.
     * @param tamaño Tamaño del perro.
     * @param raza Raza del perro.
     * @param edad Edad del perro.
     */
    public Perro(String color, String pelaje, int tamaño, String raza, int edad) {
        this.color = color; 
        this.pelaje = pelaje; 
        this.tamaño = tamaño; 
        this.raza = raza; 
        this.edad = edad; 
    }
    
    /**
     * Método para imprimir la información del perro.
     */
    public void imprimirPerro() {
        System.out.println("(Color= " + color + " , Pelaje= " + pelaje + " Tamaño= " + tamaño + " Raza= " + raza + " Edad= " + edad + ")");
    }
    
    /**
     * Método que simula que el perro está jugando.
     */
    public void jugar() {
        System.out.println("guaf guaf");
    }
    
    /**
     * Método que simula que el perro está comiendo.
     * 
     * @return true si el perro está comiendo.
     */
    public boolean comer() {
        System.out.println("Estoy comiendo");
        return true;
    }
    
    /**
     * Método que simula que el perro está corriendo.
     */
    public void correr() {
        System.out.println("Corro en el parque");
    }
    
    /**
     * Método que simula que el perro está mordiendo.
     */
    public void morder() {
        System.out.println("grrrr");
    }
    
    /**
     * Método que simula que el perro está saltando.
     * 
     * @param saltar1 Coordenada de salto 1.
     * @param saltar2 Coordenada de salto 2.
     * @param saltar3 Coordenada de salto 3.
     */
    public void saltar(float saltar1, float saltar2, float saltar3) {
        System.out.println("Me moví a: " + saltar1 + "," + saltar2 + "," + saltar3);
    }
}
