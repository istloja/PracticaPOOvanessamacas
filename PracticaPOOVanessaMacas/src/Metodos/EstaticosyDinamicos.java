/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;

/**
 *
 * @author ITS_LOJA
 */
public class EstaticosyDinamicos {
    public static void main(String[] args) {
        saludar();// para llamar un metodo estatico
        //Si quiero llamar a DESPEDIR debo crear un objeto
        EstaticosyDinamicos objeto =new EstaticosyDinamicos();//CREO UN OBJETO
        objeto.despedir();//asi se llama a un metodo NO ESTATICO
    }
    public static void saludar(){//metodo estatico
        System.out.println("Hola");
    }
    public void despedir(){//no es metodo estatico
        System.out.println("Chao");
    }
    
}    
