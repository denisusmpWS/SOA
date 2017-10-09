package com.soa.ws.basic;

import java.util.Date;

import javax.jws.WebService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.soa.ws.dao.MovimientoDao;
import com.soa.ws.domain.Header;
import com.soa.ws.domain.Message;
import com.soa.ws.model.MovimientoRequest;
import com.soa.ws.model.MovimientoResponse;
import com.soa.ws.service.MovimientoCliente;
import com.soa.ws.util.ConstantsError;

@WebService(endpointInterface="com.soa.ws.service.MovimientoCliente")
public class BasicMovimientoCliente implements MovimientoCliente {
	
	final static Logger LOG=LoggerFactory.getLogger(BasicMovimientoCliente.class);
			
	MovimientoDao dao=new MovimientoDao();

	@Override
	public MovimientoResponse obtenerEvaluacion(MovimientoRequest request) {
		
		MovimientoResponse response;
		Message errorCodCLiente=null,errorCodCuenta=null,errorClave=null,error=null,errorServer=null;
		int flag1=0,flag2=0,flag3=0;		
		
			try{
				int num=Integer.parseInt(request.getClieCod());
			}catch(NumberFormatException e){
				errorCodCLiente=new Message(ConstantsError.COD_300, ConstantsError.COD_300_DESC1);
				flag1=1;
			}
		
			try{
				int num=Integer.parseInt(request.getCuenCod());
			}catch(NumberFormatException e){
				errorCodCuenta=new Message(ConstantsError.COD_302, ConstantsError.COD_302_DESC1);
				flag2=1;
			}
			
			
			if(request.getClieCod().equals("") || request.getClieCod()==null){
				errorCodCLiente=new Message(ConstantsError.COD_300_2, ConstantsError.COD_300_DESC3);
				flag1=2;
			}else if(request.getClieCod().length()!=5){
				errorCodCLiente=new Message(ConstantsError.COD_300_1, ConstantsError.COD_300_DESC2);
				flag1=3;
			}
			
			if(request.getCuenCod().equals("") || request.getCuenCod()==null){
				errorCodCuenta=new Message(ConstantsError.COD_302_2, ConstantsError.COD_302_DESC3);
				flag2=2;
			}else if(request.getCuenCod().length()!=8){
				errorCodCuenta=new Message(ConstantsError.COD_302_1, ConstantsError.COD_302_DESC2);
				flag2=3;
			}
			
			
			if(request.getClieClave().equals("") || request.getClieClave()==null){
				errorClave=new Message(ConstantsError.COD_303_2, ConstantsError.COD_303_DESC3);
				flag3=1;
			}else if(request.getClieClave().length()!=6){
				errorClave=new Message(ConstantsError.COD_303_1, ConstantsError.COD_303_DESC2);
				flag3=2;
			}
			
					
			/*PREPARO EL HEADER ERROR*/
			Header header=new Header(request.getClieCod(), request.getCuenCod(), request.getClieClave(), "01", new Date());
			
			if(flag1!=0){
				return new MovimientoResponse(header, errorCodCLiente);
			}else if(flag2!=0){
				return new MovimientoResponse(header, errorCodCuenta);
			}else if(flag3!=0){
				return new MovimientoResponse(header, errorClave);
			}
			
			/*DESPUES DE LA VALIDACION, CONSULTAMOS*/
			
			try{
				response=dao.obtenerEvaluacion(request);
				LOG.info("object:" +response);
				if(response==null && errorCodCLiente==null && errorCodCuenta==null && errorClave==null){
					LOG.info("INGRESA A LA VALIDACION QUE TODO ES NULL");
					error=new Message(ConstantsError.COD_310, ConstantsError.COD_NO_FOUND);
					return new MovimientoResponse(header, error);
				}
				LOG.info("PASA TODA LA VALIDACION");
			}catch(Exception e){
				errorServer=new Message(ConstantsError.COD_INTERNAL, ConstantsError.COD_INTERNAL_SERVER);
				return new MovimientoResponse(header, errorServer);
			}
			
			
			/*SI OCURRIO ALGUN ERROR*/
		
		return response;
	}

}
