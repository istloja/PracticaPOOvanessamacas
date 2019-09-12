/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bases_Datos;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
/**
 *
 * @author ITS_LOJA
 */
public class ConexionBasica {

    public void leerDatos(String usuario, String clave) {
        try {
            DriverManager.deregisterDriver(new org.gjt.mm.mysql.Driver());
            Connection base = DriverManager.getConnection("jdbc:mysql://localhost/alumnos?characterEncoding=latin1", usuario, clave);
            System.out.println(base.getCatalog());
            Statement variable = base.createStatement();
            ResultSet result = variable.executeQuery("select * from persona");//consultas
            while (result.next()) {
                System.out.println(result.getString("nombre")+" "+result.getString("apellido"));
                
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        ConexionBasica objeto = new ConexionBasica();
        objeto.leerDatos("Vanessa", "19941995yv");
        
    }
}