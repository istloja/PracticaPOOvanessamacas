/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicapoovanessamacas;

import java.util.Scanner;

/**
 *
 * @author ITS_LOJA
 */
public class medidas {
    public static void main(String[] args) {
        int km;
        int m;
        int millas;
        int pies;
        int med;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println(" Ingrese 1 km/m 2 m/km 3 millas/m 4 m/millas 5 pies/m 6 m/pies");
        int resul = entrada.nextInt();
    

       switch (resul){
                   case 1:
                          System.out.println( "Kilometros a metros" );
                          System.out.println( "Ingrese los kilometros" );
                          km = entrada.nextInt();
                          resul = km*100;
                          System.out.println( "El resultado es: "+resul+" metros" );
                          break;
                   case 2:
                          System.out.println( "metros a Kilometros" );
                          System.out.println( "Ingrese los metros" );
                          m = entrada.nextInt();
                          resul = m%1000;
                          System.out.println( "El resultado es: "+resul+" Kilometros" );
                          break;
                       
                   case 3:
                          System.out.println( "Millas a metros" );
                          System.out.println( "Ingrese las millas" );
                          m = entrada.nextInt();
                          resul = m*1609;
                          System.out.println( "El resultado es: "+resul+" metros" );
                          break;
                    case 4:
                          System.out.println( "metros a millas" );
                          System.out.println( "Ingrese los metros" );
                          m = entrada.nextInt();
                          resul = m%1609;
                          System.out.println( "El resultado es: "+resul+" millas" );
                          break;
                    case 5:
                          System.out.println( "Pies a metros" );
                          System.out.println( "Ingrese los Pies" );
                          pies = entrada.nextInt();
                          resul = pies%3281;
                          System.out.println( "El resultado es: "+resul+" Pies" );
                          break;
                     case 6:
                          System.out.println( "metros a Pies" );
                          System.out.println( "Ingrese los metros" );
                          m = entrada.nextInt();
                          resul = m* 3281;
                          System.out.println( "El resultado es: "+resul+" metros" );
                          break;
            
           }
    }       
}