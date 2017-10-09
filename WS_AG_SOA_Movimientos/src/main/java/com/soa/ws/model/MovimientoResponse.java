package com.soa.ws.model;

import java.util.List;

import javax.xml.bind.annotation.XmlType;

import com.soa.ws.domain.Header;
import com.soa.ws.domain.Message;
import com.soa.ws.domain.Movimiento;
import com.soa.ws.domain.Operacion;

@XmlType(propOrder={"header","movimientos","operacion","message"})
public class MovimientoResponse {

	private Header header;
	private List<Movimiento> movimientos;
	private Operacion operacion;
	private Message message;
	public Header getHeader() {
		return header;
	}
	public void setHeader(Header header) {
		this.header = header;
	}
	public List<Movimiento> getMovimientos() {
		return movimientos;
	}
	public void setMovimientos(List<Movimiento> movimientos) {
		this.movimientos = movimientos;
	}
	public Operacion getOperacion() {
		return operacion;
	}
	public void setOperacion(Operacion operacion) {
		this.operacion = operacion;
	}
	public Message getMessage() {
		return message;
	}
	public void setMessage(Message message) {
		this.message = message;
	}
	public MovimientoResponse(Header header, Message message) {
		super();
		this.header = header;
		this.message = message;
	}
	public MovimientoResponse(Header header, List<Movimiento> movimientos, Operacion operacion) {
		super();
		this.header = header;
		this.movimientos = movimientos;
		this.operacion = operacion;
	}
	public MovimientoResponse() {

	}
	
	
	
	
	
	
	
	
	
}
