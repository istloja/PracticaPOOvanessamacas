/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excepciones;

import java.util.Scanner;

/**
 *
 * @author ITS_LOJA
 */
public class Calculadora {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int op;
        double n1, n2,n3, s=0, r=0, m=0, d=0;
       
            System.out.println("1SUMAR 2RESTAR 3MULTIPLICAR 4DIVIDIR");
            op = entrada.nextInt();

        switch (op) {
            case 1:
                    System.out.println("Ingrese numero 1");
                    try{
                    n1 = entrada.nextInt();
                    System.out.println("Ingrese numero 2");
                    n2 = entrada.nextInt();
                    s = n1 + n2;
                    }catch (Exception e){
                         System.out.println("Ingrese un numero correcto");
                          System.out.println("Vuelva a Ingresar numero ");
                    }
                    System.out.println("La suma es:" + s);
                    break;
            case 2:

                    System.out.println("Ingrese numero 1");
                    try{
                    n1 = entrada.nextInt();
                    System.out.println("Ingrese numero 2");
                    n2 = entrada.nextInt();
                    r = n1 - n2;
                    }catch (Exception e){
                         System.out.println("Ingrese un numero correcto");
                          System.out.println("Vuelva a Ingresar numero ");
                    }
                    System.out.println("La resta es:" + r);
                    break;
            case 3:

                    System.out.println("Ingrese numero 1");
                    try{
                    n1 = entrada.nextInt();
                    System.out.println("Ingrese numero 2");
                    n2 = entrada.nextInt();
                    m = n1 * n2;
                    }catch (Exception e){
                         System.out.println("Ingrese un numero correcto");
                          System.out.println("Vuelva a Ingresar numero ");
                    }
                    System.out.println("La multiplicacion es:" + m);
                    break;
            case 4:

                    System.out.println("Ingrese numero 1");
                    try{
                    n1 = entrada.nextInt();
                    System.out.println("Ingrese numero 2");
                    n2 = entrada.nextInt();
                    d = n1 / n2;
                    }catch (Exception e){
                    System.out.println("Ingrese un numero correcto");
                    System.out.println("Vuelva a Ingresar numero ");
                  
                    }
                    
                    System.out.println("La division es:" + d);
                    break;

        }
    } 
         
}
    

