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
public class Madre extends Persona {
     Hijo hijo;
     HijoS hijoS;
     HijoT hijoT;
     Abuela abuela;
     Abuelo abuelo;
     Padre padre;
             
 
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

    public Abuelo getAbuelo() {
        return abuelo;
    }

    public void setAbuelo(Abuelo abuelo) {
        this.abuelo = abuelo;
    }

    public Padre getPadre() {
        return padre;
    }

    public void setPadre(Padre padre) {
        this.padre = padre;
    }

   

        
 public Madre() {
        setNombre("Alexandra");
        setApellido("Arpi");
        setEdad(41);
        setColorCabello("Castaño");
        setColorOjos("Marron");
        setFNacimiento(24 / 01 / 76);
        setEstatura((int) 1.55);
        setGenero("Femenino");
   
    }
}