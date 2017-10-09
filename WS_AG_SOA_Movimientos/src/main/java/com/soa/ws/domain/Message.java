package com.soa.ws.domain;

import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder={"cod_error","descp_error"})
public class Message {
	
	
	private int cod_error;
	private String descp_error;
	public int getCod_error() {
		return cod_error;
	}
	public void setCod_error(int cod_error) {
		this.cod_error = cod_error;
	}
	public String getDescp_error() {
		return descp_error;
	}
	public void setDescp_error(String descp_error) {
		this.descp_error = descp_error;
	}
	public Message(int cod_error, String descp_error) {
		super();
		this.cod_error = cod_error;
		this.descp_error = descp_error;
	}
	public Message() {
		
	}
	
	
	

}
