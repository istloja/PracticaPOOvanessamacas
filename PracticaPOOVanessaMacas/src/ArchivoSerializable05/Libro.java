/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArchivoSerializable05;

import archivoSerealizado.Persona;
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
public class Libro implements Serializable {

    private String nombre;
    private int numPaginas;
    private String genero;
    private int fechaPublicacion;
    private int precio;
    private Autor autor;

    public Libro() {
    }

    public Libro(String nombre, int numPaginas, String genero, int fechaPublicacion, int precio, Autor autor) {
        this.nombre = nombre;
        this.numPaginas = numPaginas;
        this.genero = genero;
        this.fechaPublicacion = fechaPublicacion;
        this.precio = precio;
        this.autor = autor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(int fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

   

    public void leerLista(String ubicacion) {
        try {
            ObjectInputStream lector = new ObjectInputStream(new FileInputStream(ubicacion));
            Object auxiliar = lector.readObject();
            while (auxiliar != null) {
                Libro libro1 = (Libro) auxiliar;
                System.out.println();
                auxiliar = lector.readObject();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public List<Libro> leerLibro(String ubicacion) {
        List<Libro> lista = new ArrayList<>();
        try {
            ObjectInputStream lector = new ObjectInputStream(new FileInputStream(ubicacion));
            Object auxiliar = lector.readObject();
            while (auxiliar != null) {
                Libro libro1 = (Libro) auxiliar;
                lista.add(libro1);
                auxiliar = lector.readObject();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return lista;
    }

    public void escribirLibro(String ubicacion, Libro libro) {
        try {
            ObjectOutputStream ejemplo = new ObjectOutputStream(new FileOutputStream(ubicacion));
            ejemplo.writeObject(libro);
            ejemplo.close();
        } catch (Exception e) {
            System.out.println("Error"+e);
        }
    }
    public int libromasAntiguo(List<Libro>lista){
        int masantiguo = lista.get(0).getFechaPublicacion();
        for (Libro libro : lista) {
            System.out.println("El libro mas antiguo es"+masantiguo+"su fecha de publicacion fue en"+ libro.getFechaPublicacion());
            if(libro.getFechaPublicacion()< masantiguo){
                masantiguo = libro.getFechaPublicacion();
            }
        }
        
        return masantiguo;
    }
   public Libro libroActualizado(List<Libro>lista){
       Libro masActualizado = lista.get(0);
       for (Libro libro : lista) {
           if (libro.getFechaPublicacion()> masActualizado.getFechaPublicacion()){
               masActualizado = libro;
           }
       }
       return masActualizado;   
       
   }

    public static void main(String[] args) {
        Libro objeto = new Libro();
        Libro libro1 = new Libro("Mujeres en el agua", 276, "Relatos ilustrados", 2019, 19, new Autor("Patricia", "Torres", 48, "Femenino", "Relatos ilustrados"));
        Libro libro2 = new Libro("El reino de la araña", 344, "Novela Negra", 2011, 20, new Autor("Marta", "Delbal", 46, "Femenino", "Novela Negra"));
        Libro libro3 = new Libro("Memorias de un homicida", 258, "Novela Social", 2006, 4, new Autor("Jose", "Vaz", 56, "Masculino", "Novela Social"));
        Libro libro4 = new Libro("El shaman humano", 352, "Novela Urbana", 2018, 20, new Autor("Manuel", "Lara", 60, "Masculino", "Novela Urbana"));
        Libro libro5 = new Libro("La llave de los dias", 156, "Narrativa", 2016, 16, new Autor("Elena", "Fernandez", 56, "Femenino", "Narrativa"));
        List<Libro> lista = new ArrayList<>();
        lista.add(libro1);
        lista.add(libro2);
        lista.add(libro3);
        lista.add(libro4);
        lista.add(libro5);

        int a = lista.size();
        System.out.println(a);
        
        List<Libro> l = objeto.leerLibro("C:\\Users\\ITS_LOJA\\Desktop\\libro.txt");
        // objeto.escribirObjeto("‪C:\\Users\\ITS_LOJA\\Desktop\\libro.txt", libro1);
        // objeto.leerLista("C:\\Users\\ITS_LOJA\\Desktop\\libro.txt");
        //objeto.escribirLibro("‪‪‪‪1.txt", libro1);
        // objeto.leerLibro("C:\\Users\\ITS_LOJA\\Desktop\\libro.txt");
        
        System.out.println("El libro mas antiguo es:"+objeto.libromasAntiguo(l));
        System.out.println("El libro mas actualizado es"+objeto.libroActualizado(l));
    }
}
