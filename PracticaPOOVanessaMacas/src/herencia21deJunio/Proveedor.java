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
public class Proveedor extends Persona {
    private String EntregaProductos;
    private int sueldo;
    private String cargoEmpresa;

    public String getEntregaProductos() {
        return EntregaProductos;
    }

    public void setEntregaProductos(String EntregaProductos) {
        this.EntregaProductos = EntregaProductos;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public String getCargoEmpresa() {
        return cargoEmpresa;
    }

    public void setCargoEmpresa(String cargoEmpresa) {
        this.cargoEmpresa = cargoEmpresa;
    }
    
    public void Entregas(){
        System.out.println("La entrega se realizo");
    }
    public static void main(String[] args) {
        Proveedor objeto = new Proveedor();
        objeto.Saludar();
        objeto.Entregas();
  
    }
}
