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
public class Triangulo extends FiguraBidimensional{
     public double calcularArea(double base,double altura) {
        return A=(base*altura)/2;
    }

    public double calcularPerimetro(double lado1,double lado2,double lado3) {
        return P=lado1+lado2+lado3;
    }
}
