/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticaASerializable;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ITS_LOJA
 */
public class Jugador implements Serializable {

    private String nombre;
    private String apellido;
    private int edad;
    private int numeroGoles;
    private int añoDebut;
    private Equipo equipo;
    private int perdidasBalon;
    private int asistencias;
    private double kmRecorridos;
    private int pasesCompletados;
    private int fallosGol;

    public Jugador() {
    }

    public Jugador(String nombre, String apellido, int edad, int numeroGoles, int añoDebut, Equipo equipo, int perdidasBalon, int asistencias, double kmRecorridos, int pasesCompletados, int fallosGol) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.numeroGoles = numeroGoles;
        this.añoDebut = añoDebut;
        this.equipo = equipo;
        this.perdidasBalon = perdidasBalon;
        this.asistencias = asistencias;
        this.kmRecorridos = kmRecorridos;
        this.pasesCompletados = pasesCompletados;
        this.fallosGol = fallosGol;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public int getNumeroGoles() {
        return numeroGoles;
    }

    public void setNumeroGoles(int numeroGoles) {
        this.numeroGoles = numeroGoles;
    }

    public int getAñoDebut() {
        return añoDebut;
    }

    public void setAñoDebut(int añoDebut) {
        this.añoDebut = añoDebut;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public int getPerdidasBalon() {
        return perdidasBalon;
    }

    public void setPerdidasBalon(int perdidasBalon) {
        this.perdidasBalon = perdidasBalon;
    }

    public int getAsistencias() {
        return asistencias;
    }

    public void setAsistencias(int asistencias) {
        this.asistencias = asistencias;
    }

    public double getKmRecorridos() {
        return kmRecorridos;
    }

    public void setKmRecorridos(double kmRecorridos) {
        this.kmRecorridos = kmRecorridos;
    }

    public int getPasesCompletados() {
        return pasesCompletados;
    }

    public void setPasesCompletados(int pasesCompletados) {
        this.pasesCompletados = pasesCompletados;
    }

    public int getFallosGol() {
        return fallosGol;
    }

    public void setFallosGol(int fallosGol) {
        this.fallosGol = fallosGol;
    }
    

  
    
   
    public static void main(String[] args) {
        Jugador jugador = new Jugador("Cristiano", "Ronaldo", 33, 520, 2005, new Equipo("Juventus", 20, "Turin"),12,32,12.3,45,3);
        Jugador jugador1 = new Jugador("Lionel", "Messi", 31, 600, 2007, new Equipo("Barcelona", 30, "Barcelona"),4,21,10.2,34,6);
        Jugador jugador2 = new Jugador("Neymar", "Jr", 28, 200, 2011, new Equipo("PSG", 10, "Paris"),4,6,14.8,23,2);
        Jugador jugador3 = new Jugador("Eden", "Hazard", 27, 1590, 2010, new Equipo("Real Madrid", 40, "Madrid"),5,12,14.5,22,4);
        
        }
    
    }


