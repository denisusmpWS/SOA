package com.soa.ws.conexion;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Conexion {
	
	private Connection con=null;
	private CallableStatement call=null;
	private ResultSet res=null;
	
	
	public Connection openConection() throws SQLException, ClassNotFoundException{
		String context="jdbc:oracle:thin:@localhost:1521:XE";
		String user="bd_eurekabank";
		String pass="bd_eurekabank";
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con=DriverManager.getConnection(context, user, pass);
		return con;
	}
	
	public void closeConection() throws SQLException{
		
		if(con!=null) con.close();
		if(call!=null)call.close();
		if(res!=null) res.close();
		
	}
	
	
	
	
	

}
