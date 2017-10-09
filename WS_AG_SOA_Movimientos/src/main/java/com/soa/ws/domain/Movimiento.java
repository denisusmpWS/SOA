package com.soa.ws.domain;

import java.util.Date;

import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder={"nroMov","fechaMov","importeMov","codEmpl","usuEmpl"})
public class Movimiento {
	
	
	private int nroMov;
	private Date fechaMov;
	private double importeMov;
	private String codEmpl;
	private String usuEmpl;
	public int getNroMov() {
		return nroMov;
	}
	public void setNroMov(int nroMov) {
		this.nroMov = nroMov;
	}
	public Date getFechaMov() {
		return fechaMov;
	}
	public void setFechaMov(Date fechaMov) {
		this.fechaMov = fechaMov;
	}
	public double getImporteMov() {
		return importeMov;
	}
	public void setImporteMov(double importeMov) {
		this.importeMov = importeMov;
	}
	public String getCodEmpl() {
		return codEmpl;
	}
	public void setCodEmpl(String codEmpl) {
		this.codEmpl = codEmpl;
	}
	public String getUsuEmpl() {
		return usuEmpl;
	}
	public void setUsuEmpl(String usuEmpl) {
		this.usuEmpl = usuEmpl;
	}
	public Movimiento(int nroMov, Date fechaMov, double importeMov, String codEmpl, String usuEmpl) {
		super();
		this.nroMov = nroMov;
		this.fechaMov = fechaMov;
		this.importeMov = importeMov;
		this.codEmpl = codEmpl;
		this.usuEmpl = usuEmpl;
	}
	public Movimiento() {

	}
	
	
	
	

}
