package com.soa.ws.util;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;

import com.soa.ws.dao.MovimientoDao;
import com.soa.ws.model.MovimientoRequest;
import com.soa.ws.model.MovimientoResponse;


public class Test {

	
static CallableStatement call=null;
static ResultSet res=null;
static Connection con=null;
	
	public static void main(String args[]){
		try{
			MovimientoRequest request=new MovimientoRequest("00005", "00100001", "123456");
			MovimientoDao dao=new MovimientoDao();
			MovimientoResponse response=new MovimientoResponse();
			response=dao.obtenerEvaluacion(request);		
			
			System.out.println("response:"+response);
			System.out.println(""+response.getHeader()+" "+response.getMessage()+" "+response.getMovimientos());
			System.out.println("request:"+request.getClieClave()+request.getClieCod()+request.getCuenCod());
		}catch(Exception e){
			
		}

		
		
	
		
	}
}
