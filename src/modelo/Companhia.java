/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author gurui
 */
public class Companhia {

    //  Atributos
    protected TreeMap<Integer, Float> ventasPorPeriodo;
    protected TreeMap<Integer, Float> pronosticoVentas;
    //  Se hacen como TreeMaps para garantizar que van en orden los años

    public Companhia() {
        this.ventasPorPeriodo = new TreeMap<>();
        this.pronosticoVentas = new TreeMap<>();
    }

    public Companhia(TreeMap<Integer, Float> ventasPorPeriodo) {
        this.ventasPorPeriodo = ventasPorPeriodo;
    }

    public void addVenta(float valor) {
        Integer ultimoPeriodo = this.ventasPorPeriodo.lastKey();
        if (ultimoPeriodo == null) {
            ultimoPeriodo = 1;
        }
        this.ventasPorPeriodo.put(ultimoPeriodo, valor);
    }

    public boolean removeSale(int periodo) {
        //if (this.ventasPorPeriodo.containsKey(periodo)) {
        try {
            this.ventasPorPeriodo.remove(periodo);
            return true;
        } catch (NullPointerException e) {
            System.out.println("Key does not exist in the map: " + e.getMessage());
            return false;
        }
    }

    public boolean modificarVenta(int periodo, float nuevaVenta) {
        if (this.ventasPorPeriodo.containsKey(periodo)) {
            this.ventasPorPeriodo.put(periodo, nuevaVenta);
            return true;
        } else {
            return false;
        }
    }
}
