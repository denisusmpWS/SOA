package com.soa.ws.model;

import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder={"clieCod","cuenCod","clieClave"})
public class MovimientoRequest {

	private String clieCod;
	private String cuenCod;
	private String clieClave;
	public String getClieCod() {
		return clieCod;
	}
	public void setClieCod(String clieCod) {
		this.clieCod = clieCod;
	}
	public String getCuenCod() {
		return cuenCod;
	}
	public void setCuenCod(String cuenCod) {
		this.cuenCod = cuenCod;
	}
	public String getClieClave() {
		return clieClave;
	}
	public void setClieClave(String clieClave) {
		this.clieClave = clieClave;
	}
	public MovimientoRequest(String clieCod, String cuenCod, String clieClave) {
		super();
		this.clieCod = clieCod;
		this.cuenCod = cuenCod;
		this.clieClave = clieClave;
	}
	public MovimientoRequest() {

	}
	@Override
	public String toString() {
		return "MovimientoRequest [clieCod=" + clieCod + ", cuenCod=" + cuenCod + ", clieClave=" + clieClave + "]";
	}
	
	
	
	
	
	
	
}
