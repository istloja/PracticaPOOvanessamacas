/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticaASerializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ITS_LOJA
 */
public class Metodo {
      public void escribirObjeto(String ubicacion, Jugador jugador){
        try{
            ObjectOutputStream escritor =  new  ObjectOutputStream ( new FileOutputStream(ubicacion));
            escritor.writeObject (jugador);
            escritor.close();
        } catch ( Exception e) {
            System.out.println( " se produjo un error "  + e);
        }

        
    }

    public void leerLista(String ubicacion) {
        try {
            ObjectInputStream lector = new ObjectInputStream(new FileInputStream(ubicacion));
            Object auxiliar = lector.readObject();
            while (auxiliar != null) {
                Jugador jugador = (Jugador) auxiliar;
                System.out.println("El nombre del estudiante es:" + jugador.getNombre() + jugador.getApellido());
                auxiliar = lector.readObject();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void escribirLista(String ubicacion, List<Jugador> lista) {
        try {
            ObjectOutputStream escritor = new ObjectOutputStream(new FileOutputStream(ubicacion));
            for (Jugador lista1 : lista) {
                escritor.writeObject(lista);
            }
            escritor.close();
        } catch (Exception e) {
            System.out.println(" se podrucio un error " + e);
        }
    }

    public List<Jugador> leerEstudiante(String ubicacion) {
        List<Jugador> lista = new ArrayList<>();
        try {
            ObjectInputStream lector = new ObjectInputStream(new FileInputStream(ubicacion));
            Object auxiliar = lector.readObject();
            while (auxiliar != null) {
                Jugador jugador = (Jugador) auxiliar;
                lista.add(jugador);
                auxiliar = lector.readObject();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return lista;
    }
     public int edadMax(List<Jugador>lista){
         int edadMax=lista.get(0).getEdad();
         for (Jugador lista1 : lista) {
             
             if (lista1.getEdad()>edadMax) {
                 edadMax =lista1.getEdad();
             }
         }
         return edadMax;
     }
     public Jugador edadmenorObjeto(List<Jugador>lista){
         Jugador edadmenor=lista.get(0);
         for (Jugador lista1 : lista) {
             if(edadmenor.getEdad()>lista1.getEdad())
                 edadmenor= lista1;
         }
         return edadmenor;
     }
 
    public static void main(String[] args) {
        Metodo objeto = new Metodo();
        Jugador jugador = new Jugador("Cristiano","Ronaldo",33,520,2005,new Equipo("Juventus",20,"Turin"));
        Jugador jugador1 = new Jugador("Lionel","Messi",31,600,2007,new Equipo("Barcelona",30,"Barcelona"));
        Jugador jugador2 = new Jugador("Neymar","Jr",28,200,2011,new Equipo("PSG",10,"Paris"));
        Jugador jugador3 = new Jugador("Eden","Hazard",27,1590,2010,new Equipo("Real Madrid",40,"Madrid"));
        List<Jugador> lista =new ArrayList<>();
        lista.add(jugador);
        lista.add(jugador1);
        lista.add(jugador2);
        lista.add(jugador3);
        int o= lista.size();
        System.out.println(o);
        
        List<Jugador> persona=objeto.leerEstudiante("‪C:\\Users\\ITS_LOJA\\Desktop\\jugador.txt");
        for (Jugador persona1 :lista) {
        System.out.println("El jugador es:"+jugador.getNombre()+jugador.getApellido()+jugador.getEdad()+jugador.getNumeroGoles()+jugador.getAñoDebut()+"Pertenece al:"+jugador.getEquipo().getNumerotitulos());   
        }
        objeto.escribirLista("‪C:\\Users\\ITS_LOJA\\Desktop\\jugador.txt", lista);
        objeto.leerLista("C:\\Users\\ITS_LOJA\\Desktop\\jugador.txt");
        
        
    }
}