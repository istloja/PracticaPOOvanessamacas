/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archivos;

import java.io.File;

/**
 *
 * @author ITS_LOJA
 */
public class Archivo {
    public static void main(String[] args) {
        //para archivos y carpetas
        File archivo = new File("C:\\Users\\ITS_LOJA\\Desktop\\ejemplo.txt");//creando un objeto de la clase archivo
    //"" nombre,direccion del archivo
        System.out.println( archivo.exists());
        //para saber si es una carpeta o no
        System.out.println(archivo.isDirectory());
        //para saber si es un archivo
        System.out.println(archivo.isFile());
        //para saber si un archivo esta oculto
        System.out.println(archivo.isHidden());
        //para saber la ultima fecha de modificacion
        System.out.println(archivo.lastModified());
        //
        archivo.delete();
        
        File carpeta =new File("C:\\Users\\ITS_LOJA\\Desktop");
        String[]arregloarchivos=carpeta.list();
        for(int i=0;i<arregloarchivos.length;i++){
            System.out.println(arregloarchivos[i]);
        }
    }
    
}
