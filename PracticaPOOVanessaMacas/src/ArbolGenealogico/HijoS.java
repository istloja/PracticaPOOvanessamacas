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
public class HijoS extends Persona{
   
    Madre madre;
    Padre padre;
    Hijo hijo;
    HijoS hijoS;
    HijoT hijoT;
    Abuela abuela;
    Abuelo abuelo;
    

 public HijoS() {
        setNombre("Alex");
        setApellido("Macas");
        setEdad(23);
        setColorCabello("Castaño");
        setColorOjos("Marron");
        setFNacimiento(12 / 20 / 95);
        setEstatura((int) 1.65);
        setGenero("Masculino");

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

    public Abuelo getAbuelo() {
        return abuelo;
    }

    public void setAbuelo(Abuelo abuelo) {
        this.abuelo = abuelo;
    }
 
}