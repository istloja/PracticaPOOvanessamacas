/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticaASerializable;

import archivoSerealizado.Persona;
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

    public List<Jugador> leerJugador(String ubicacion) {
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

    public int edadMax(List<Jugador> lista) {
        int edadMax = lista.get(0).getEdad();
        for (Jugador jugador : lista) {

            if (jugador.getEdad() > edadMax) {
                edadMax = edadMax;
            }
        }
        return edadMax;
    }

    public Jugador edadmenorObjeto(List<Jugador> lista) {
        Jugador edadmenor = lista.get(0);
        for (Jugador jugador : lista) {
            if (edadmenor.getEdad() > jugador.getEdad()) {
                edadmenor = jugador;
            }
        }
        return edadmenor;
    }

    public Jugador masGoles(List<Jugador> lista) {
        Jugador mayorgoles = lista.get(0);
        for (Jugador jugador : lista) {
            if (jugador.getNumeroGoles() > mayorgoles.getNumeroGoles()) {
                mayorgoles = jugador;
            }
        }
        return mayorgoles;
    }

    public Jugador primerDebut(List<Jugador> lista) {
        Jugador primeDebut = lista.get(0);
        for (Jugador jugador : lista) {
            if (jugador.getAñoDebut() < primeDebut.getAñoDebut()) {
                primeDebut = jugador;
            }
        }
        return primeDebut;
    }

    public Jugador Titulos(List<Jugador> lista) {
        Jugador masTitulos = lista.get(0);
        for (Jugador jugador : lista) {
            if (jugador.getEquipo().getNumerotitulos() > masTitulos.getEquipo().getNumerotitulos()) {
                masTitulos = jugador;
            }
        }
        return masTitulos;
    }

    public double porcentajeAcierto(Jugador jugadorB) {
        return (jugadorB.getNumeroGoles() + jugadorB.getAsistencias()) / jugadorB.getFallosGol();

    }

    public Jugador numeroAciertos(List<Jugador> lista) {
        Jugador masAciertos = lista.get(0);
        for (Jugador jugador : lista) {
            if (porcentajeAcierto(jugador) > porcentajeAcierto(masAciertos)) {
                masAciertos = jugador;
            }
        }
        return masAciertos;
    }

    public double porcentajeEfectividad(Jugador jugadorA) {
        return (jugadorA.getPasesCompletados()) / jugadorA.getPerdidasBalon();

    }

    public Jugador masEficiente(List<Jugador> lista) {
        Jugador masEficiente = lista.get(0);
        for (Jugador jugador : lista) {
            if (porcentajeEfectividad(jugador) > porcentajeEfectividad(masEficiente)) {
                masEficiente= jugador;
            }
        }
        return masEficiente;
    }

    public double efectividadJugador(Jugador jugadorC) {
        return (porcentajeAcierto(jugadorC) + efectividadJugador(jugadorC) + jugadorC.getKmRecorridos());
    }

    public Jugador mayorEficiencia(List<Jugador> lista) {
        Jugador mayorEficiencia= lista.get(0);
        for (Jugador jugador : lista) {
            if (efectividadJugador(jugador) > efectividadJugador(mayorEficiencia)) {
                mayorEficiencia = jugador;
            }
        }
        return mayorEficiencia;
    }
    public int numeroCaracteres(Jugador jugador){
       return jugador.getNombre().length()+jugador.getApellido().length();
       
    }
    public Jugador masCaracteres(List<Jugador> lista){
        Jugador mayorC = lista.get(0);
        for (Jugador jugador : lista) {
            if(numeroCaracteres(jugador)> numeroCaracteres(mayorC)){
                mayorC = jugador;
                
            }
        }
        return mayorC;
    }
    public Jugador menorCaracteres(List<Jugador> lista){
        Jugador menosCaracteres = lista.get(0);
        for (Jugador jugador : lista) {
            if(numeroCaracteres(jugador)< numeroCaracteres(menosCaracteres));
            menosCaracteres = jugador;
        }
        return menosCaracteres;
    }
   

    public static void main(String[] args) {
        Metodo objeto = new Metodo();
        Jugador jugador10 = new Jugador("Cristiano", "Ronaldo", 33, 520, 2005, new Equipo("Juventus", 20, "Turin"), 12, 32, 12.3, 45, 3);
        Jugador jugador1 = new Jugador("Lionel", "Messi", 31, 600, 2007, new Equipo("Barcelona", 30, "Barcelona"), 14, 21, 10.2, 34, 6);
        Jugador jugador2 = new Jugador("Neymar", "Jr", 28, 200, 2001, new Equipo("PSG", 10, "Paris"), 4, 6, 14.8, 23, 2);
        Jugador jugador3 = new Jugador("Eden", "Hazard", 27, 1590, 2010, new Equipo("Real Madrid", 40, "Madrid"), 5, 43, 14.5, 34, 4);
        Jugador jugador4= new Jugador("Fernado", "Torres", 22, 330, 2011, new Equipo("Barcelona", 20, "Madrid"), 5, 22, 10.5, 12, 9);
        Jugador jugador5 = new Jugador("Thiago", "Bazaran", 24, 690, 2012, new Equipo("Real Madrid", 50, "Madrid"), 5, 14, 11.5, 22, 8);
        Jugador jugador6 = new Jugador("Radamel", "Falcao", 25, 590, 2014, new Equipo("PSG", 20, "Madrid"), 5, 17, 13.5, 27, 4);
        Jugador jugador7 = new Jugador("Andres", "Iniesta", 25, 420, 2009, new Equipo("Real Madrid", 40, "Madrid"), 5, 18, 14.5, 27, 7);
        Jugador jugador8 = new Jugador("Iker", "Casillas", 28, 159, 2010, new Equipo("Juventus", 50, "Madrid"), 5, 25, 8.5, 30, 4);
        Jugador jugador9 = new Jugador("Garet", "Bale", 27, 1230, 2016, new Equipo("Real Madrid", 30, "Madrid"), 5, 33, 12.5, 19, 6);
        
        List<Jugador> lista = new ArrayList<>();
        lista.add(jugador10);
        lista.add(jugador1);
        lista.add(jugador2);
        lista.add(jugador3);
        lista.add(jugador4);
        lista.add(jugador5);
        lista.add(jugador6);
        lista.add(jugador7);
        lista.add(jugador8);
        lista.add(jugador9);
       
        int o = lista.size();
        System.out.println(o);

        objeto.escribirLista("C:\\Users\\ITS_LOJA\\Desktop\\jugador.txt",lista);
      

        List<Jugador> b = objeto.leerJugador("C:\\Users\\ITS_LOJA\\Desktop\\jugador.txt");
        //for (Jugador j : lista) {
        // System.out.println("El jugador es:" + jugador.getNombre() + jugador.getApellido() + jugador.getEdad() + jugador.getNumeroGoles() + jugador.getAñoDebut() + "Pertenece al:" + jugador.getEquipo().getNumerotitulos());
        //}

        System.out.println("El jugardor con mayor edad es:" + jugador10.getEdad() + jugador10.getNombre());
        System.out.println(jugador10.getEquipo().getNombreEquipo());
    
        System.out.println("El jugador con mayor porcentaje de aciertos es " + objeto.numeroAciertos(b).getNombre());
        System.out.println("El jugador mas eficiente es " + objeto.masEficiente(b).getNombre());
        System.out.println("El jugador con mayor numero de caracteres es"+objeto.masCaracteres(b).getNombre());
    }

}
