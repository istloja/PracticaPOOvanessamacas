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
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ITS_LOJA
 */
public class Federacion implements Serializable {

    private String nombre;
    private String pais;
    private int numEquipos;

    public Federacion() {
    }

    public Federacion(String nombre, String pais, int numEquipos) {
        this.nombre = nombre;
        this.pais = pais;
        this.numEquipos = numEquipos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getNumEquipos() {
        return numEquipos;
    }

    public void setNumEquipos(int numEquipos) {
        this.numEquipos = numEquipos;
    }

     public void leerLista(String ubicacion) {
        try {
            ObjectInputStream lector = new ObjectInputStream(new FileInputStream(ubicacion));
            Object auxiliar = lector.readObject();
            while (auxiliar != null) {
                Federacion federacion = (Federacion) auxiliar;
                System.out.println();
                auxiliar = lector.readObject();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void escribirLista(String ubicacion, List<Federacion> lista) {
        try {
            ObjectOutputStream escritor = new ObjectOutputStream(new FileOutputStream(ubicacion));
            for (Federacion federacion : lista) {
                escritor.writeObject(lista);
            }
            escritor.close();
        } catch (Exception e) {
            System.out.println(" se podrucio un error " + e);
        }
    }

    public List<Federacion> leerFederacion(String ubicacion) {
        List<Federacion> lista = new ArrayList<>();
        try {
            ObjectInputStream lector = new ObjectInputStream(new FileInputStream(ubicacion));
            Object auxiliar = lector.readObject();
            while (auxiliar != null) {
                Federacion federacion = (Federacion) auxiliar;
                lista.add(federacion);
                auxiliar = lector.readObject();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return lista;
    }

    public Federacion masEquipos(List<Federacion> lista) {
        Federacion mayorEquipos = lista.get(0);
        for (Federacion federacion : lista) {
            if (federacion.getNumEquipos() > mayorEquipos.getNumEquipos()) {
                mayorEquipos = federacion;
            }

        }
        return mayorEquipos;
    }

    public static void main(String[] args) {
        Federacion objeto = new Federacion();
        Federacion federacion = new Federacion("F.M.N", "Mexico", 14);
        Federacion federacion2 = new Federacion("F.E.M", "Peru", 16);
        Federacion federacion3 = new Federacion("F.E.D.A", "Ecuador", 22);
        List<Federacion> lista = new ArrayList<>();
        lista.add(federacion);
        lista.add(federacion2);
        lista.add(federacion3);
      
       
        int a = lista.size ();
        System.out.println (a);
        objeto.escribirLista ("C:\\Users\\ITS_LOJA\\Desktop\\federacion", lista);
        List <Federacion> d= objeto.leerFederacion ("C:\\Users\\ITS_LOJA\\Desktop\\federacion");
    
        System.out.println ("el equipo más grande es la federación" + federacion.masEquipos(d) + "con" + federacion.masEquipos(d).getNumEquipos() + "Equipos");
        
        
        
        
    }
     
   
}
