/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop4;

/**
 * Clase que representa un Triángulo Rectángulo.
 * 
 * @author teran
 */
public class Triángulo_Rectángulo {
    int angulo; 
    double hipotenusa; 
    double cateto_op; 
    double cateto_ady; 
    float tamaño_rec; 
    
    /**
     * Constructor por defecto de la clase Triángulo_Rectángulo.
     * Inicializa los atributos con valores predeterminados.
     */
    public Triángulo_Rectángulo() {
        angulo = 0; 
        hipotenusa = 0; 
        cateto_op = 0; 
        cateto_ady = 0; 
        tamaño_rec = 0; 
    }
    
    /**
     * Constructor con parámetros de la clase Triángulo_Rectángulo.
     * 
     * @param angulo Ángulo del triángulo en grados.
     * @param hipotenusa Longitud de la hipotenusa.
     * @param cateto_op Longitud del cateto opuesto.
     * @param cateto_ady Longitud del cateto adyacente.
     * @param tamaño_rec Tamaño del triángulo rectángulo.
     */
    public Triángulo_Rectángulo(int angulo, double hipotenusa, double cateto_op, double cateto_ady, float tamaño_rec) {
        this.angulo = angulo; 
        this.hipotenusa = hipotenusa; 
        this.cateto_op = cateto_op;
        this.cateto_ady = cateto_ady;
        this.tamaño_rec = tamaño_rec; 
    }
    
    /**
     * Método para imprimir la información del triángulo rectángulo.
     */
    public void imprimirTriángulo_Rectángulo() {
        System.out.println("Ángulo en Grados: " + angulo + " Hipotenusa: " + hipotenusa + " Cateto Opuesto: " + cateto_op + " Cateto Adyacente: " + cateto_ady + " Tamaño del Triángulo Rectángulo: " + tamaño_rec);
    }
    
    /**
     * Método que define las relaciones trigonométricas.
     */
    public void def_rel_trigo() {
        System.out.println("Es fundamental para la función seno, coseno y tangente");
    }
    
    /**
     * Método que aplica el Teorema de Pitágoras.
     * 
     * @return true si se aplica correctamente el Teorema de Pitágoras.
     */
    public boolean aplic_teo_pitagoras() {
        System.out.println("Permite calcular el Teorema de Pitágoras");
        return true; 
    }
    
    /**
     * Método que determina las alturas y distancias.
     */
    public void deter_alturas_distancias() {
        System.out.println("Nos ayuda a determinar las medidas de las alturas y las distancias");
    }
    
    /**
     * Método que resuelve problemas de ángulos.
     * 
     * @return true si se resuelven correctamente los problemas de ángulos.
     */
    public boolean resolv_probl_ang() {
        System.out.println("Encuentra valores desconocidos de ángulos o lados");
        return true; 
    }
    
    /**
     * Método que calcula áreas.
     * 
     * @return true si se calculan correctamente las áreas.
     */
    public boolean calc_areas() {
        System.out.println("Sirve para calcular áreas");
        return true; 
    }
}
