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
public class Animal {
    public String Nombre;
    private int Edad;
    private double Peso;
    private String Color;
    private double Altura;

    public Animal() {
    }
     //CONSTRUCTOR PARA INICIALIZAR MUCHOS VALORES
    public Animal(String Nombre, int Edad, double Peso, String Color, double Altura) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Peso = Peso;
        this.Color = Color;
        this.Altura = Altura;
    }
    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public double getPeso() {
        return Peso;
    }

    public void setPeso(double Peso) {
        this.Peso = Peso;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public double getAltura() {
        return Altura;
    }

    public void setAltura(double Altura) {
        this.Altura = Altura;
    }
    

public void nombreAnimal(){
    System.out.println("Hola soy un animal");

}
    public String informacionAnimal(){
    String informacion= Nombre+" "+Edad+" "+Altura+" "+Color+" "+Peso;
        return informacion;
    } 
    
    public static void main(String[] args) {
        Animal objeto = new Animal();
        objeto.setNombre("perro");
        objeto.setEdad(10); //INICIALIZAR ALGUNOS
        objeto.setPeso(15);
        objeto.setAltura(15);
        objeto.setColor("Blanco");
        System.out.println(objeto.informacionAnimal());
        Animal objeto1 = new Animal("Gato",5,8,"Blanco",10);
        System.out.println(objeto.informacionAnimal());
    }
}