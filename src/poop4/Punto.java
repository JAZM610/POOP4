/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop4;

/**
 * Clase que representa un Punto en un plano cartesiano.
 * 
 * @author teran
 */
public class Punto {
    int x; 
    int y; 
    String nombre;
    
    /**
     * Constructor por defecto de la clase Punto.
     * Inicializa los atributos con valores predeterminados.
     */
    public Punto() { // Constructor Vacío
        x = 0;
        y = 0; 
        nombre = null;
    }
    
    /**
     * Constructor con parámetros de la clase Punto.
     * 
     * @param x Coordenada x del punto.
     * @param y Coordenada y del punto.
     * @param nombre Nombre del punto.
     */
    public Punto(int x, int y, String nombre) { // Constructor Lleno
        this.x = x;
        this.y = y;
        this.nombre = nombre;
    }
    
    /**
     * Método para imprimir la información del punto.
     */
    public void imprimePunto() {
        System.out.println("(x= " + x + " , y= " + y + ") Nombre= " + nombre);
    }
}
