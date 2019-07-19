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
public class ManejoExcepciones {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num=0;
        try {//ponemos el codigo que queremos proteger
            num = entrada.nextInt();
        } catch (Exception e) {
            System.out.println("Se genero el error"+e);
            System.out.println("Por favor ingrese el numero correctamente");
        }
        System.out.println("El numero ingresado es" +num);
        try{
        int resultado=num/0;
        System.out.println(resultado);
        }catch (Exception e){
            System.out.println("no se puede dividir para un cero");
        }
    }
}
