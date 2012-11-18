/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Riteen;

import java.awt.Color;
import java.sql.Connection;

/**
 *
 * @author Harim Tejada
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //We are ready to work
        
    //WinLoging wl = new WinLoging();
    Conexion conn = Conexion.getInstancia();
    conn.Conexion();
    // WinCliente wl = new WinCliente();
   WinEmpleado wl = new WinEmpleado();   
    wl.setVisible(true);
    }
}
