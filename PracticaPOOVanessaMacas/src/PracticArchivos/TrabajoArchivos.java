/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticArchivos;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author ITS_LOJA
 */
public class TrabajoArchivos {
     public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int op;
        
        System.out.println("1DOCUMENTOS 2IMAGENES 3MUSICA 4VIDEOS 5NETBEANS");
        op = entrada.nextInt();

        switch (op) {
            case 1:
                 
                    File archivo = new File("C:\\Users\\ITS_LOJA\\Documents");
                    String[]arregloarchivos=archivo.list();
                    for(int i=0;i<arregloarchivos.length;i++){
                    System.out.println(arregloarchivos[i]);
                    } 
                     break;
                       
            case 2:
                    
                    File archivo1 = new File("C:\\Users\\ITS_LOJA\\Pictures");
                    String[]arregloarchivo1=archivo1.list();
                    for(int i=0;i<arregloarchivo1.length;i++){
                    System.out.println(arregloarchivo1[i]);
                    }
                    break;
            case 3:
                    File archivo2 = new File("C:\\Users\\ITS_LOJA\\Music");
                    String[]arregloarchivo2=archivo2.list();
                    for(int i=0;i<arregloarchivo2.length;i++){
                    System.out.println(arregloarchivo2[i]);
                    }
                    break;
                    
            case 4:
                    
                    File archivo3 = new File("C:\\Users\\ITS_LOJA\\Videos");
                    String[]arregloarchivo3=archivo3.list();
                    for(int i=0;i<arregloarchivo3.length;i++){
                    System.out.println(arregloarchivo3[i]);
                    }
                    break;
            case 5:
                    File archivo4 = new File("C:\\Users\\ITS_LOJA\\Documents\\NetBeansProjects");
                    String[]arregloarchivo4=archivo4.list();
                    for(int i=0;i<arregloarchivo4.length;i++){
                    System.out.println(arregloarchivo4[i]);
                    }
                    break;
        } 
    } 
}
          

                 
     
                  


     
        

    



