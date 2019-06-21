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
public class Cliente extends Persona{
    
    private int Ncompras;
    private String TipoPago ;

    public int getNcompras() {
        return Ncompras;
    }

    public void setNcompras(int Ncompras) {
        this.Ncompras = Ncompras;
    }

    public String getTipoPago() {
        return TipoPago;
    }
    public void test(){
        Saludar();
        super.Saludar();
    }

    public void setTipoPago(String TipoPago) {
        this.TipoPago = TipoPago;
    }
   
    @Override//sobreescribiendo un metodo
    public void Saludar(){
        System.out.println("Hola soy un cliente");
   
    }
       public void comprar(){
        System.out.println("La compra se realizo con exito");
       }
    
    public static void main(String[] args) {
        Cliente objeto = new Cliente();
        objeto.Saludar();
        objeto.comprar();
       

    }
        
}
    
     
    

