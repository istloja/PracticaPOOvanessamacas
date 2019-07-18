/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RepasoPOO;

/**
 *
 * @author ITS_LOJA
 */
public class Ave extends Animal {
    private int NumHuevos;
    private boolean vuela;

    public Ave() {
    }

    public Ave(int NumHuevos, boolean vuela) {
        this.NumHuevos = NumHuevos;
        this.vuela = vuela;
    }

    public Ave(int NumHuevos, boolean vuela, String Nombre, int Edad, double Peso, String Color, double Altura) {
        super(Nombre, Edad, Peso, Color, Altura);
        this.NumHuevos = NumHuevos;
        this.vuela = vuela;
    }

    
    
    

    public int getNumHuevos() {
        return NumHuevos;
    }

    public void setNumHuevos(int NumHuevos) {
        this.NumHuevos = NumHuevos;
    }

    public boolean isVuela() {
        return vuela;
    }

    public void setVuela(boolean vuela) {
        this.vuela = vuela;
    }
    
 
    }
    
