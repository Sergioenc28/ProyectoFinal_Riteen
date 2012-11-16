/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Riteen;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Harim Tejada
 */
public class Conexion {
    public String bd = "riteen";
    public String login = "root";
    public String password = "";
    public String url = "jdbc:mysql://localhost/"+bd;
    public String servidor = "127.0.0.1";
    Connection conn = null;

    public Conexion() {
    
        try
        {
        Class.forName("com.mysql.jdbc.Driver");
        conn = DriverManager.getConnection(url,login,password);
         
        if (conn != null) {
            JOptionPane.showMessageDialog(null, "Conectado!");
            }
        }
        catch(SQLException ex){
            System.out.println("Error: " + ex.getMessage());
        }
        catch(Exception ex) {
          System.out.println("Error: " + ex.getMessage());
       
        }   
}

    public Connection getConexion(){
        return conn;
    }

}
