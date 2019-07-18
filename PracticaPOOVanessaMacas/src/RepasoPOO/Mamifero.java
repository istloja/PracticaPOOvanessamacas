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
public class Mamifero extends Animal{
    private int TiempoGestacion;
    private boolean pelaje;

    public Mamifero() {
        
    }

    public Mamifero(int TiempoGestacion, boolean pelaje, String Nombre, int Edad, double Peso, String Color, double Altura) {
        super(Nombre, Edad, Peso, Color, Altura);
        this.TiempoGestacion = TiempoGestacion;
        this.pelaje = pelaje;
    }

    public int getTiempoGestacion() {
        return TiempoGestacion;
    }

    public void setTiempoGestacion(int TiempoGestacion) {
        this.TiempoGestacion = TiempoGestacion;
    }

    public boolean isPelaje() {
        return pelaje;
    }

    public void setPelaje(boolean pelaje) {
        this.pelaje = pelaje;
    }
    
    
}
