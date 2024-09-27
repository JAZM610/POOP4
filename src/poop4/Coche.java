/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop4;

/**
 * Clase que representa un Coche.
 * 
 * @author teran
 */
public class Coche {
    String color;
    String marca; 
    int llantas; 
    int puertas; 
    int espejos; 
    
    /**
     * Constructor por defecto de la clase Coche.
     * Inicializa los atributos con valores predeterminados.
     */
    public Coche() {
        color = null; 
        marca = null; 
        llantas = 0; 
        puertas = 0; 
        espejos = 0; 
    }
    
    /**
     * Constructor con parámetros de la clase Coche.
     * 
     * @param color Color del coche.
     * @param marca Marca del coche.
     * @param llantas Número de llantas del coche.
     * @param puertas Número de puertas del coche.
     * @param espejos Número de espejos del coche.
     */
    public Coche(String color, String marca, int llantas, int puertas, int espejos) {
        this.color = color; 
        this.marca = marca; 
        this.llantas = llantas; 
        this.puertas = puertas;
        this.espejos = espejos; 
    }
    
    /**
     * Método para imprimir la información del coche.
     */
    public void imprimirCoche() {
        System.out.println("Color: " + color + " Marca: " + marca + " Llantas: " + llantas + " Puertas: " + puertas + " Espejos: " + espejos);
    }
    
    /**
     * Método que simula el transporte de personas en el coche.
     * 
     * @return true si el coche está transportando personas.
     */
    public boolean transportar() {
        System.out.println("Llevo personas abordo");
        return true; 
    }
    
    /**
     * Método que simula la aceleración del coche.
     */
    public void acelerar() {
        System.out.println("Aceleración rápida");
    }
    
    /**
     * Método que simula el frenado del coche.
     */
    public void frenar() {
        System.out.println("Freno justo a tiempo");
    }
    
    /**
     * Método que simula el encendido del coche.
     * 
     * @return true si el coche está encendido.
     */
    public boolean encender() {
        System.out.println("Encendido");
        return true; 
    }
    
    /**
     * Método que simula el apagado del coche.
     * 
     * @return true si el coche está apagado.
     */
    public boolean apagar() {
        System.out.println("Apagado");
        return true; 
    }
}
