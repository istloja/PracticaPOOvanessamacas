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
public class Abuela extends Persona {
    Madre madre;
    Padre padre;
    Hijo hijo;
    HijoS hijoS;
    HijoT hijoT;
    Abuelo abuelo;
    
    

 public Abuela() {
        setNombre("Blanca");
        setApellido("Mera");
        setEdad(65);
        setColorCabello("Castaño Claro");
        setColorOjos("Verde");
        setFNacimiento(24 / 4 / 45);
        setEstatura((int) 1.55);
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

    public Abuelo getAbuelo() {
        return abuelo;
    }

    public void setAbuelo(Abuelo abuelo) {
        this.abuelo = abuelo;
    }
}
