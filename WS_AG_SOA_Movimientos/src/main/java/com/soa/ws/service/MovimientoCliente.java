package com.soa.ws.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;


import com.soa.ws.model.MovimientoRequest;
import com.soa.ws.model.MovimientoResponse;

@WebService
public interface MovimientoCliente {

	@WebMethod(operationName="obtenerEvaluacion")	
	public @WebResult(name="movimientoResponse") MovimientoResponse obtenerEvaluacion(@WebParam(name="moviemientoRequest") MovimientoRequest request);
	
	
}
