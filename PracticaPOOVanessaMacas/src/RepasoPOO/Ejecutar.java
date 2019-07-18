/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RepasoPOO;

/**
 *
 * @author ITS_LOJA
 */
public class Ejecutar {
    
    public static void main(String[] args) {
        
     Animal objeto = new Animal("Jirafa",10 ,22,"Amarillo",5);
     Ave objeto1 = new Ave(10,false,"Pato",5,6,"Blanco",20);
     Mamifero objeto2 = new Mamifero(12,true,"Caballo",4,25,"Marron",2);
     Anfibios objetoA = new Anfibios("Braquial",true,"Rana",2,11,"Verde",9);
     Reptiles objetoR = new Reptiles(true,"terrestre","Cocodrilo",5,45,"Gris",7);       
        System.out.println(objeto.informacionAnimal());
        System.out.println(objeto1.informacionAnimal());
        System.out.println(objeto2.informacionAnimal());
        System.out.println(objetoA.informacionAnimal());
        System.out.println(objetoR.informacionAnimal());
    }
}
