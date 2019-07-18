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
public class Reptiles extends Animal {
    private boolean escamas;
    private String Habitad;

    public Reptiles() {
    }

    public Reptiles(boolean escamas, String Habitad, String Nombre, int Edad, double Peso, String Color, double Altura) {
        super(Nombre, Edad, Peso, Color, Altura);
        this.escamas = escamas;
        this.Habitad = Habitad;
    }
    
    

    public boolean isEscamas() {
        return escamas;
    }

    public void setEscamas(boolean escamas) {
        this.escamas = escamas;
    }

    public String getHabitad() {
        return Habitad;
    }

    public void setHabitad(String Habitad) {
        this.Habitad = Habitad;
    }
    
    
}
