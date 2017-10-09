package com.soa.ws.domain;

import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder={"nomclie","apePatClie","apeMatClie","direcClie","tipoMoneda","saldoClie","totalMov","estadoCuen","sucursalClie"})
public class Operacion {
	
	
	private String nomclie;
	private String apePatClie;
	private String apeMatClie;
	private String direcClie;
	private String tipoMoneda;
	private double saldoClie;
	private int totalMov;
	private String estadoCuen;
	private String sucursalClie;
	public String getNomclie() {
		return nomclie;
	}
	public void setNomclie(String nomclie) {
		this.nomclie = nomclie;
	}
	public String getApePatClie() {
		return apePatClie;
	}
	public void setApePatClie(String apePatClie) {
		this.apePatClie = apePatClie;
	}
	public String getApeMatClie() {
		return apeMatClie;
	}
	public void setApeMatClie(String apeMatClie) {
		this.apeMatClie = apeMatClie;
	}
	public String getDirecClie() {
		return direcClie;
	}
	public void setDirecClie(String direcClie) {
		this.direcClie = direcClie;
	}
	public String getTipoMoneda() {
		return tipoMoneda;
	}
	public void setTipoMoneda(String tipoMoneda) {
		this.tipoMoneda = tipoMoneda;
	}
	public double getSaldoClie() {
		return saldoClie;
	}
	public void setSaldoClie(double saldoClie) {
		this.saldoClie = saldoClie;
	}
	public int getTotalMov() {
		return totalMov;
	}
	public void setTotalMov(int totalMov) {
		this.totalMov = totalMov;
	}
	public String getEstadoCuen() {
		return estadoCuen;
	}
	public void setEstadoCuen(String estadoCuen) {
		this.estadoCuen = estadoCuen;
	}
	public String getSucursalClie() {
		return sucursalClie;
	}
	public void setSucursalClie(String sucursalClie) {
		this.sucursalClie = sucursalClie;
	}
	public Operacion(String nomclie, String apePatClie, String apeMatClie, String direcClie, String tipoMoneda,
			double saldoClie, int totalMov, String estadoCuen, String sucursalClie) {
		super();
		this.nomclie = nomclie;
		this.apePatClie = apePatClie;
		this.apeMatClie = apeMatClie;
		this.direcClie = direcClie;
		this.tipoMoneda = tipoMoneda;
		this.saldoClie = saldoClie;
		this.totalMov = totalMov;
		this.estadoCuen = estadoCuen;
		this.sucursalClie = sucursalClie;
	}
	public Operacion() {

	}

	
	
	

}
