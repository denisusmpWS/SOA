package com.soa.ws.util;

public interface ConstantsError {

	
	final static int COD_300=300;
	final static String COD_300_DESC1="Codigo de cliente debe ser numerico.";
	final static int COD_300_1=301;
	final static String COD_300_DESC2="Codigo cliente debe tener 5 digitos";
	final static int COD_300_2=302;
	final static String COD_300_DESC3="Codigo cliente vacio, ingrese un valor.";
	
	
	final static int COD_302=303;
	final static String COD_302_DESC1="Codigo de cuenta debe ser numerico.";
	final static int COD_302_1=304;
	final static String COD_302_DESC2="Codigo cuenta debe tener 5 digitos";
	final static int COD_302_2=305;
	final static String COD_302_DESC3="Codigo cuenta vacio, ingrese un valor.";

	final static int COD_303_1=307;
	final static String COD_303_DESC2="Clave debe tener 6 digitos";
	final static int COD_303_2=308;
	final static String COD_303_DESC3="Clave vacia, ingrese un valor.";
	
	final static int COD_310=310;
	final static String COD_NO_FOUND="No existen datos del cliente.";
	
	final static int COD_INTERNAL=500;
	final static String COD_INTERNAL_SERVER="Ocurrio un error inesperado, contactese con el tecnico.";
}
