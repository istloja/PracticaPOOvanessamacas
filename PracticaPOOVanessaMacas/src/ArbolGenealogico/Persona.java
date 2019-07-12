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
public class Persona {
    
    private String Nombre;
    private String Apellido;
    private int Edad;
    public int FNacimiento;
    public String ColorCabello;
    public String ColorOjos;
    private int Estatura;
    public String Profesion;
    public String Genero;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        this.Apellido = apellido;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        this.Edad = edad;
    }

    public int getFNacimiento() {
        return FNacimiento;
    }

    public void setFNacimiento(int FNacimiento) {
        this.FNacimiento = FNacimiento;
    }

    public String getColorCabello() {
        return ColorCabello;
    }

    public void setColorCabello(String colorCabello) {
        this.ColorCabello = colorCabello;
    }

    public String getColorOjos() {
        return ColorOjos;
    }

    public void setColorOjos(String colorOjos) {
        this.ColorOjos = colorOjos;
    }

    public int getEstatura() {
        return Estatura;
    }

    public void setEstatura(int Estatura) {
        this.Estatura = Estatura;
    }

    public String getProfesion() {
        return Profesion;
    }

    public void setProfesion(String Profesion) {
        this.Profesion = Profesion;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }
    
    
}
