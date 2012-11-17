/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Riteen;

import java.sql.*;
/**
 *
 * @author Harim Tejada
 */
public class Usuario {
	
        Conexion cn;
	public Usuario() {
		cn = new Conexion();
	}
	public Object[][] UsuarioAcceder(String login, String password){
		int registros = 0;
		try {
			PreparedStatement pstm = cn.getConexion().prepareStatement("SELECT count(1) as cont" +
			" FROM test");
                try (ResultSet res = pstm.executeQuery()) {
                    res.next();
                    registros = res.getInt("cont");
                }
		}
		catch(SQLException e){
			System.out.println(e);
		}
		Object [][] data = new Object[registros][2];
		if (login.length() != 0 && password.length() != 0){
			int usu_id = 0;
			String usu_login = "";
			String usu_password = "";
			try {
				String strsql = "";
				strsql = "SELECT * FROM test WHERE nombre = '" + login + "' AND pass = '" + password + "'";
				PreparedStatement pstm = cn.getConexion().prepareStatement(strsql);
                        try (ResultSet res = pstm.executeQuery()) {
                            int i = 0;
                            while(res.next()){
                                    
                                    usu_login = res.getString("nombre");
                                    usu_password = res.getString("pass");
                                   
                                    data[i][0] = usu_id;

                                data[i][1] = usu_login;

                                 data[i][2] = usu_password;

                                    i++;
                            }
                        }
			}
			catch(SQLException e){
				System.out.println(e);
			}
		}
		return data;
	}


    
    
}
