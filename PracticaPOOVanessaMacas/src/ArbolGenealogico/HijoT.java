/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArbolGenealogico;

/**
 *
 * @author ITS_LOJA
 */
public class HijoT extends Persona{
       Madre madre;
    Padre padre;
    HijoS hijoS;
    HijoT hijoT;
    Abuela abuela;
    Abuelo abuelo;
    

 public HijoT() {
        setNombre("Dayanna");
        setApellido("Macas");
        setEdad(19);
        setColorCabello("Castaño");
        setColorOjos("Marron claros");
        setFNacimiento(19 / 03 / 2000);
        setEstatura((int) 1.56);
        setGenero("Femenino");
  
}
}
