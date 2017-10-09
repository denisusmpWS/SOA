package com.soa.ws.domain;

import java.util.Date;

import javax.xml.bind.annotation.XmlType;


@XmlType(propOrder={"codCliente","codCuenta","clave","estado","fechaCrea"})
public class Header {

	private String codCliente;
	private String codCuenta;
	private String clave;
	private String estado;
	private Date fechaCrea;
	
	public String getCodCliente() {
		return codCliente;
	}
	public void setCodCliente(String codCliente) {
		this.codCliente = codCliente;
	}
	public String getCodCuenta() {
		return codCuenta;
	}
	public void setCodCuenta(String codCuenta) {
		this.codCuenta = codCuenta;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public Date getFechaCrea() {
		return fechaCrea;
	}
	public void setFechaCrea(Date fechaCrea) {
		this.fechaCrea = fechaCrea;
	}
	public Header(String codCliente, String codCuenta, String clave, String estado, Date fechaCrea) {
		super();
		this.codCliente = codCliente;
		this.codCuenta = codCuenta;
		this.clave = clave;
		this.estado = estado;
		this.fechaCrea = fechaCrea;
	}
	public Header() {

	}
	
	@Override
	public String toString() {
		return "Header [codCliente=" + codCliente + ", codCuenta=" + codCuenta + ", clave=" + clave + ", estado="
				+ estado + ", fechaCrea=" + fechaCrea + "]";
	}
	
	
	
	
	
	
	
}
