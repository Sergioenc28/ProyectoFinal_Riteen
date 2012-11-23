/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Riteen;

import java.awt.Color;
import java.sql.Connection;
import javax.swing.JOptionPane;

/**
 *
 * @author Harim Tejada
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        
        //We are ready to work
        
        
        Conexion conn = Conexion.getInstancia();
        conn.Conexion();
        //WinCliente wl = new WinCliente();
       //WinEmpleado wl = new WinEmpleado();   
       // wl.setVisible(true);
    
     //WinProducto start = new WinProducto();
      WinInicio start = new WinInicio();
      start.setVisible(true);
        
    }
}
