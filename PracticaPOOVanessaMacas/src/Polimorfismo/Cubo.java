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
public class Cubo extends FiguraTridimencional{
      public double calcularVolumen(double aristas){
          double V;
        return V =Math.pow(aristas, 3);

    }
    public double calcularArea(double aristas){
          double A;
    return A=Math.pow(6*aristas,2);
}
}