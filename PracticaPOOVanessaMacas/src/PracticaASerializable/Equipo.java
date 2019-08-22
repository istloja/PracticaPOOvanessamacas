/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticaASerializable;

import java.io.Serializable;

/**
 *
 * @author ITS_LOJA
 */
public class Equipo implements Serializable {
    private String nombreEquipo;
    private int numerotitulos;
    private String ciudad;

    public Equipo() {
    }

    public Equipo(String nombre, int numerotitulos, String ciudad) {
        this.nombreEquipo = nombre;
        this.numerotitulos = numerotitulos;
        this.ciudad = ciudad;
    }

    public String getNombre() {
        return nombreEquipo;
    }

    public void setNombre(String nombre) {
        this.nombreEquipo = nombre;
    }

    public int getNumerotitulos() {
        return numerotitulos;
    }

    public void setNumerotitulos(int numerotitulos) {
        this.numerotitulos = numerotitulos;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
}
