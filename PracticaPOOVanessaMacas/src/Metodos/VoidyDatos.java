/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;

import java.util.Scanner;

/**
 *
 * @author ITS_LOJA
 */
public class VoidyDatos {

    //metodo VOID que suma y presenta un resultado

    public void sumar(int num1, int num2) {//recibe dos numeros de tipo entero
        System.out.println("La suma es:" + (num1 + num2));//presenta mensaje en pantalla
    }
    //los metodos pueden ser
    //int,double,string,char
    public int sumar1(int numero1,int numero2){//guarda variables no utilizables
        return numero1+numero2;//devolvemos el valor
        
    }
    public boolean iniciaSesion(String usuario,String password){
    boolean valor = false;
        if (usuario.equals("admin") && password.equals("1234")) {

        }
        return valor;
    }
    public String iniciaSesion2(String usuario,String password){
        return usuario+password;
    }

    public String unirCadenas(String cadena1, String cadena2) {
        return cadena1 + cadena2;
    }
    public static void main(String[] args) {
        VoidyDatos objeto = new VoidyDatos();//creamos un objeto
        objeto.sumar(10, 8);//llamamos al metodo sumar y enviamos dos numeros
        objeto.sumar(190, 88);
        objeto.sumar(180, 67);
        int resultado=objeto.sumar1(40, 10);//guardo lo que devuelve el metodo
        System.out.println("La suma es:"+resultado);//devuelve una varible utlizable
         String cadena=objeto.unirCadenas("Hola", "Mundo");
         System.out.println("La cadena unida es:"+cadena);
         boolean variableinicio=objeto.iniciaSesion("admin", "1234");
         System.out.println("variableinicio");
         Scanner entrada=new Scanner(System.in);
         System.out.println("Ingrese el usuario");
         String usuario=entrada.next();
         System.out.println("Ingrese la contraseña");
         String password=entrada.next();
         boolean iniciosesion=objeto.iniciaSesion(usuario,password);
         if(iniciosesion){
             System.out.println("Bienvenido");
             
         }else{
             System.out.println("Datos Incorrectos");
         }
    }
}
