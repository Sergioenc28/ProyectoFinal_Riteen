/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Riteen;

import com.mysql.jdbc.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Sergio and Clary
 */
public class UsuarioActual {
    
    ResultSet rs;
    String paUsuarioActivo;
    String usuarioActivo;

    public String getUsuarioActivo() {
        return usuarioActivo;
    }

    public void setUsuarioActivo() {
        
        Conexion con = Conexion.getInstancia();
        con.Conexion();
        
        try
        {
            rs = (ResultSet) Conexion.getInstancia().hacerConsulta("SELECT userName FROM usuarios WHERE activo = 1");
            
            if(rs.next())
            {
                this.usuarioActivo = rs.getString(1);
            }
            
        }
        catch(SQLException ex){
                System.out.print("\n\n\nEl error es que: "+ ex.getMessage());
            }
    }   
}