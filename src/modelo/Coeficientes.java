/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author gurui
 */
public class Coeficientes {

    //  Atributos
    protected double intercepto;
    protected double pendiente;

    //  Metodos
    public Coeficientes() {

    }

    public Coeficientes(double coefA, double coefB) {
        this.intercepto = coefA;
        this.pendiente = coefB;
    }

}
