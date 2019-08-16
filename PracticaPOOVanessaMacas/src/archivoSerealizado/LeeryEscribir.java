/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivoSerealizado;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ITS_LOJA
 */
public class LeeryEscribir {

    public void escribirObjeto(String direccion, Persona persona) {
        try {
            ObjectOutputStream escritor = new ObjectOutputStream(new FileOutputStream(direccion));
            escritor.writeObject(persona);
            escritor.close();
        } catch (Exception e) {
            System.out.println("se produjo un error" + e);
        }
    }

    public void leerArchivo(String direccion) {
        try {
            ObjectInputStream lector = new ObjectInputStream(new FileInputStream(direccion));
            Object auxiliar = lector.readObject();
            Persona objeto2 = (Persona) auxiliar;
            System.out.println(objeto2.getMascota().getNombre() + " su edad es " + objeto2.getMascota().getEdad());

        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public void leerLista(String ubicacion) {
        try {
            ObjectInputStream lector = new ObjectInputStream(new FileInputStream(ubicacion));
            Object auxiliar = lector.readObject();
            while (auxiliar != null) {
                Persona objeto2 = (Persona) auxiliar;
                System.out.println(objeto2.getMascota().getNombre() + " su edad es " + objeto2.getMascota().getEdad());
                auxiliar = lector.readObject();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public List<Persona> leerPersonas(String ubicacion) {
        List<Persona> lista = new ArrayList<>();
        try{
        ObjectInputStream lector = new ObjectInputStream(new FileInputStream(ubicacion));
        Object auxiliar = lector.readObject();
         while (auxiliar != null) {
                Persona objeto2 = (Persona) auxiliar;
                lista.add(objeto2);
                auxiliar = lector.readObject();
            }
        }catch(Exception e){
            System.out.println(e);
        }
        return lista;
    }

    public void escribirLista(String direccion, List<Persona> lista) {
        try {
            ObjectOutputStream escritor = new ObjectOutputStream(new FileOutputStream(direccion));
            for (Persona persona : lista) {
                escritor.writeObject(persona);
            }

            escritor.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        LeeryEscribir objeto = new LeeryEscribir();
        Persona objeto2 = new Persona("Pedro", "Campos", 7676767, 32, new Mascota("Iris", 3, 4));
        Persona objeto3 = new Persona("Pe", "Campos", 7676767, 32, new Mascota("Iri", 3, 4));
        Persona objeto4 = new Persona("Pro", "Campos", 7676767, 32, new Mascota("Ir", 3, 4));
        Persona objeto5 = new Persona("Po", "Campos", 7676767, 32, new Mascota("Is", 3, 4));
        Persona objeto6 = new Persona("Pipo", "Campos", 7676767, 32, new Mascota("Isu", 3, 4));
        List<Persona> lista = new ArrayList<>();
        lista.add(objeto2);
        lista.add(objeto3);
        lista.add(objeto4);
        lista.add(objeto5);
        lista.add(objeto6);
        System.out.println(lista.size());
        //int ob = lista.size();
        //objeto.escribirLista("C:\\Users\\ITS_LOJA\\Desktop\\ejemplo.txt", lista);
        //System.out.println(ob);
        //objeto.leerLista("C:\\Users\\ITS_LOJA\\Desktop\\ejemplo.txt");
        //for (Persona persona : lista) {
      
        List<Persona> persona=objeto.leerPersonas("C:\\Users\\ITS_LOJA\\Desktop\\ejemplo.txt");
        for (Persona persona1 : persona) {
            System.out.println(persona1.getEdad());
        
    }
    }
        // objeto.escribirLista("C:\\Users\\ITS_LOJA\\Desktop\\ejemplo.txt", lista);
    //objeto.escribirObjeto("C:\\Users\\ITS_LOJA\\Desktop\\ejemplo.txt",objeto2);
    //objeto.leerArchivo("C:\\Users\\ITS_LOJA\\Desktop\\ejemplo.txt");
}
