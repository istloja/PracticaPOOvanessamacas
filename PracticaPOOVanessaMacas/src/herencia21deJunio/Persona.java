/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia21deJunio;

/**
 *
 * @author ITS_LOJA
 */
public class Persona {
    
    private String nombre;
    private String apellido;
    private int cedula;
    private int edad;
    private String genero;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    public void Saludar(){
        System.out.println("Hola como estas");
    }
      public void Despedir(){
        System.out.println("Hasta pronto");
}
     public static void main(String[] args) {
        Persona objeto = new Persona();
        objeto.setNombre("Carlos");
        System.out.println(objeto.getNombre());
    }
}
