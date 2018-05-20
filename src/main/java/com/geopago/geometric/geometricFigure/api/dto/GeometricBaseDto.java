package com.geopago.geometric.geometricFigure.api.dto;

/**
 * dto de salida para la peticion get del base
 * @author leonelsoriano3@gmail.com
 *
 */
public class GeometricBaseDto {
	
	private Double base;
	private String msgError;
	
	public GeometricBaseDto(Double base, String msgError) {
		this.base = base;
		this.msgError = msgError;
	}
	public Double getBase() {
		return base;
	}
	public void setBase(Double base) {
		this.base = base;
	}
	public String getMsgError() {
		return msgError;
	}
	public void setMsgError(String msgError) {
		this.msgError = msgError;
	}
}