/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polimorfismo;

/**
 *
 * @author ITS_LOJA
 */
class Esfera extends FiguraTridimencional {
    private double V;

    public double calcularVolumen(double radio, double PI) {
        return V = Math.pow(4 * Math.PI * radio, 3) / 3;
    }
}
    

