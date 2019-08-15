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
public class Persona implements Serializable{
    private String Nombre;
    private String Apellido;
    private int Telefono;
    private int Edad;
    private Mascota mascota;

    public Persona() {
    }

    public Persona(String Nombre, String Apellido, int Telefono, int Edad, Mascota mascota) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Telefono = Telefono;
        this.Edad = Edad;
        this.mascota = mascota;
    }

    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public static void main(String[] args) {
        Persona objecto = new Persona("Jonh","Ruiz",5790,26,new Mascota("Max",4,5));
        Persona objeto2 = new Persona("Pedro","Campos",7676767,32,new Mascota("Iris",3,4));
        System.out.println("El nombre de la perso");
    }
}  