/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.Map;
import java.util.TreeMap;
import modelo.Coeficientes;

/**
 *
 * @author gurui
 */
public class Formulas {

    protected static Coeficientes coeficientesActuales;

    public Coeficientes MinimosCuadrados(TreeMap<Integer, Float> mapaVentas) {
        
        int n = mapaVentas.size();
        double[] x = new double[n];
        double[] y = new double[n];
        int i = 0;
        //  Iterando sobre el treemap
        for (Map.Entry<Integer, Float> entry : mapaVentas.entrySet()) {
            x[i] = entry.getKey();
            y[i] = entry.getValue();
            i++;
        }
        //  Calcular las sumas necesarias para minimos cuadrados
        double sumX = 0, sumY = 0, sumXY = 0, sumX2 = 0;
        for (i = 0; i < n; i++) {
            sumX += x[i];
            sumY += y[i];
            sumXY += x[i] * y[i];
            sumX2 += x[i] * x[i];
        }
        //  Calcular pendiente b y el intercepto a
        double b= (n * sumXY - sumX * sumY) / (n * sumX2 - sumX * sumX);
        double a = (sumY - b * sumX) / n;
        
        Coeficientes coeficientesObt = new Coeficientes(a, b);
        
        return coeficientesObt;
    }
}
