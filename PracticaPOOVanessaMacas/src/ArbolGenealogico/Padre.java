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
public class Padre extends Persona {
    Hijo hijo;
    Abuelo abuelo;
    HijoS hijoS;
    HijoT hijoT;
    Abuela abuela;
    Madre madre;

    public Hijo getHijo() {
        return hijo;
    }

    public void setHijo(Hijo hijo) {
        this.hijo = hijo;
    }

    public Abuelo getAbuelo() {
        return abuelo;
    }

    public void setAbuelo(Abuelo abuelo) {
        this.abuelo = abuelo;
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

    public Madre getMadre() {
        return madre;
    }

    public void setMadre(Madre madre) {
        this.madre = madre;
    }
      

    public Padre() {
        setNombre("Abel");
        setApellido("Macas");
        setEdad(47);
        setColorCabello("Castaño");
        setColorOjos("Marron");
        setFNacimiento(31/10/71);
        setEstatura((int) 1.75);
        setGenero("Masculino");
    }
}