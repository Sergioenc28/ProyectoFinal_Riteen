/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Riteen;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Harim Tejada
 */
public class Conexion {
    public String bd = "riteen";
    public String login = "root";
    public String password = "cojinua";
    public String url = "jdbc:mysql://localhost/"+bd;
    public String servidor = "127.0.0.1";
    public Statement enunciado;
    private static Conexion instancia;
    Connection conn = null;

    
    
    public synchronized static Conexion getInstancia(){
        if (instancia == null){
            instancia = new Conexion();
        }
        return instancia;
    }
    
    
    
    public void Conexion() {
    
        try
        {
        Class.forName("com.mysql.jdbc.Driver");
        conn = DriverManager.getConnection(url,login,password);
        enunciado = conn.createStatement();
         
        if (conn != null) {
            JOptionPane.showMessageDialog(null, "Conectado a la Base de Dados Riteen");
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
    
     public ResultSet hacerConsulta(String consulta){
        ResultSet resultado = null;
                try{
                    resultado = enunciado.executeQuery(consulta);
                }
                catch(SQLException e){
                    e.printStackTrace();
                }
        return resultado;
    }

}
