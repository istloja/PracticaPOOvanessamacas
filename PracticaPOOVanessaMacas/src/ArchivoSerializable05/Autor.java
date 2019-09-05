/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArchivoSerializable05;

import java.io.Serializable;

/**
 *
 * @author ITS_LOJA
 */
public class Autor implements Serializable{
    private String nombreA;
    private String apellido;
    private int edad;
    private String sexo;
    private String especialidad;

    public Autor() {
    }

    public Autor(String nombre, String apellido, int edad, String sexo, String especialidad) {
        this.nombreA = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.sexo = sexo;
        this.especialidad = especialidad;
    }

    public String getNombreA() {
        return nombreA;
    }

    public void setNombreA(String nombre) {
        this.nombreA = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
}
