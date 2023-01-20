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
    protected float coefA;
    protected float coefB;
    protected float coefC;

    //  Metodos
    public Coeficientes() {

    }

    public Coeficientes(float coefA, float coefB, float coefC) {
        this.coefA = coefA;
        this.coefB = coefB;
        this.coefC = coefC;
    }

    public Coeficientes(float coefA, float coefB) {
        this.coefA = coefA;
        this.coefB = coefB;
    }

}
