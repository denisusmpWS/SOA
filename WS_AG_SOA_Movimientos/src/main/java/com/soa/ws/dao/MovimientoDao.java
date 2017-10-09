package com.soa.ws.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import com.soa.ws.conexion.Conexion;
import com.soa.ws.domain.Header;
import com.soa.ws.domain.Movimiento;
import com.soa.ws.domain.Operacion;
import com.soa.ws.model.MovimientoRequest;
import com.soa.ws.model.MovimientoResponse;

import oracle.jdbc.OracleTypes;

public class MovimientoDao {
	
	final static Logger LOG=LoggerFactory.getLogger(MovimientoDao.class);
	
	CallableStatement call=null;
	ResultSet res=null;
	Connection con=null;
	
	public MovimientoResponse obtenerEvaluacion(MovimientoRequest request){
		
		MovimientoResponse response=null;
		Header header=null;
		List<Movimiento> movimientos=new ArrayList<Movimiento>();
		Operacion operacion=null;
		Movimiento movimiento=null;
		
		
		try{
			/*CREAR UNA INSTANCIA DE CONEXION*/	
			Conexion cxn=new Conexion();
			con=cxn.openConection();
			/*PREPARAR EL CALL*/
			call=con.prepareCall("{call SP_LISTCLIENTEEXPERTO3(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
			/*IN*/
			call.setString(1, request.getClieCod());
			call.setString(2, request.getCuenCod());
			call.setString(3, request.getClieClave());
			/*OUT*/
			call.registerOutParameter(4, java.sql.Types.VARCHAR);
			call.registerOutParameter(5, java.sql.Types.VARCHAR);
			call.registerOutParameter(6, java.sql.Types.VARCHAR);
			call.registerOutParameter(7, java.sql.Types.VARCHAR);
			call.registerOutParameter(8, java.sql.Types.VARCHAR);
			call.registerOutParameter(9, java.sql.Types.VARCHAR);
			call.registerOutParameter(10, java.sql.Types.VARCHAR);
			call.registerOutParameter(11, java.sql.Types.VARCHAR);
			call.registerOutParameter(12, java.sql.Types.DOUBLE);
			call.registerOutParameter(13, java.sql.Types.INTEGER);
			call.registerOutParameter(14, java.sql.Types.VARCHAR);
			call.registerOutParameter(15, java.sql.Types.VARCHAR);
			call.registerOutParameter(16, java.sql.Types.DATE);
			
			call.registerOutParameter(17, OracleTypes.CURSOR);
			/*EXECUTE*/
			call.execute();
			/*HEADER*/
			header=new Header();
			header.setCodCliente(call.getString(4));
			header.setCodCuenta(call.getString(5));
			header.setClave(call.getString(6));
			header.setEstado(call.getString("00"));
			header.setFechaCrea(call.getDate(16));
			/*OPERACION*/
			 operacion=new Operacion();
             operacion.setNomclie(call.getString(7));
             operacion.setApePatClie(call.getString(8));
             operacion.setApeMatClie(call.getString(9));
             operacion.setDirecClie(call.getString(10));
             operacion.setTipoMoneda(call.getString(11));
             operacion.setSaldoClie(call.getDouble(12));
             operacion.setTotalMov(call.getInt(13));
             operacion.setEstadoCuen(call.getString(14));
             operacion.setSucursalClie(call.getString(15));
             
			/*MOVIMIENTOS*/
             res=(ResultSet) call.getObject(17);
             
             while(res.next()){
            	  movimiento=new Movimiento();
            	  movimiento.setNroMov(res.getInt("INT_MOVINUMERO"));
            	  movimiento.setFechaMov(res.getDate("DTT_MOVIFECHA"));
            	  movimiento.setImporteMov(res.getDouble("DEC_MOVIIMPORTE"));
            	  movimiento.setCodEmpl(res.getString("CHR_EMPLCODIGO"));
            	  movimiento.setUsuEmpl(res.getString("VCH_EMPLUSUARIO"));
            	  
            	  movimientos.add(movimiento);
             }
             
             response=new MovimientoResponse(header, movimientos, operacion);
             
		}catch(Exception e){
			e.getMessage();
		}finally{
			try{
				con.close();
				call.close();
				res.close();
			}catch(Exception e){
				
			}
		}
		
		return response;
	}

}
