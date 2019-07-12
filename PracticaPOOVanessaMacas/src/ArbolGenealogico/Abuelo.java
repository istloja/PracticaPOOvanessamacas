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
public class Abuelo extends Persona {

    
    Madre madre;
    Padre padre;
    Hijo hijo;
    HijoS hijoS;
    HijoT hijoT;
    Abuela abuela;
    
    

 public Abuelo() {
        setNombre("Miguel");
        setApellido("Macas");
        setEdad(65);
        setColorCabello("Castaño");
        setColorOjos("Marron");
        setFNacimiento(12 / 20 / 40);
        setEstatura((int) 1.53);
        setGenero("Femenino");

    }

    public Madre getMadre() {
        return madre;
    }

    public void setMadre(Madre madre) {
        this.madre = madre;
    }

    public Padre getPadre() {
        return padre;
    }

    public void setPadre(Padre padre) {
        this.padre = padre;
    }

    public Hijo getHijo() {
        return hijo;
    }

    public void setHijo(Hijo hijo) {
        this.hijo = hijo;
    }

    public HijoS getHijoS() {
        return hijoS;
    }

    public void setHijoS(HijoS hijoS) {
        this.hijoS = hijoS;
    }

    public HijoT getHijoT() {
        return hijoT;
    }

    public void setHijoT(HijoT hijoT) {
        this.hijoT = hijoT;
    }

    public Abuela getAbuela() {
        return abuela;
    }

    public void setAbuela(Abuela abuela) {
        this.abuela = abuela;
    }
   
    
 
  
}
