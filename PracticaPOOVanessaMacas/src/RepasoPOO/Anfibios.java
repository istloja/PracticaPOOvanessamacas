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
public class Anfibios extends Animal{
    
    private String Respiracion;
    private boolean reproHuevos;

    public Anfibios() {
    }

    public Anfibios(String Respiracion, boolean reproHuevos, String Nombre, int Edad, double Peso, String Color, double Altura) {
        super(Nombre, Edad, Peso, Color, Altura);
        this.Respiracion = Respiracion;
        this.reproHuevos = reproHuevos;
    }

    public String getRespiracion() {
        return Respiracion;
    }

    public void setRespiracion(String Respiracion) {
        this.Respiracion = Respiracion;
    }

    public boolean isReproHuevos() {
        return reproHuevos;
    }

    public void setReproHuevos(boolean reproHuevos) {
        this.reproHuevos = reproHuevos;
    }

   
    

    

    
}
