/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArbolGenealogico;

import java.util.Scanner;

/**
 *
 * @author ITS_LOJA
 */
public class ArbolGenealogico {
    public static void main(String[] args) {
        
    
    
    Hijo hijo = new Hijo();
    Padre padre = new Padre();
    Madre madre = new Madre();
    Abuelo abuelo = new Abuelo();
    Abuela abuela = new Abuela();
    HijoS hijoS = new HijoS();
   
    
    hijo.setPadre(padre);
    hijo.setMadre(madre);
    hijo.setAbuelo(abuelo);
    hijo.setAbuela(abuela);
    madre.setHijo(hijo);
    madre.setHijoS(hijoS);
    padre.setHijo(hijo);
    padre.setAbuelo(abuelo);
    padre.setHijoS(hijoS);
    
   
    System.out.println("Nombre del papa es: "+hijo.getPadre().getNombre());
    System.out.println("El nombre del primer hijo de "+ madre.getNombre()+" es: "+madre.getHijo().getNombre());
    System.out.println("El nombre del segundo hijo de "+ padre.getNombre()+" es: "+padre.getHijoS().getNombre());
    System.out.println("El nombre de la madre de "+hijo.getNombre()+" es: " +hijo.getMadre().getNombre());
    System.out.println("El nombre del padre de "+padre.getNombre()+" es: "+padre.getAbuelo().getNombre());
    

   
    }
}