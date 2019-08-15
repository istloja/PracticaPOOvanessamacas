/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivoSerealizado;

import java.io.Serializable;




/**
 *
 * @author ITS_LOJA
 */
public class Mascota implements Serializable{
    private String Nombre;
    private int Edad;
    private int NumPatas;

    public Mascota() {
    }

    public Mascota(String Nombre, int Edad, int NumPatas) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.NumPatas = NumPatas;
    }

    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public int getNumPatas() {
        return NumPatas;
    }

    public void setNumPatas(int NumPatas) {
        this.NumPatas = NumPatas;
    }
    
    
}
