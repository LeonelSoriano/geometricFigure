package com.geopago.geometric.geometricFigure.api.dto;

/**
 * parametro de salida para el calculo de superficie
 * @author leonelsoriano3@gmail.com
 *
 */
public class GeometricSuperfaceDto {
	private Double superface;
	private String errorMsg;
	
	public GeometricSuperfaceDto(Double superface, String errorMsg) {
		this.superface = superface;
		this.errorMsg = errorMsg;
	}
	public Double getSuperface() {
		return superface;
	}
	public void setSuperface(Double superface) {
		this.superface = superface;
	}
	public String getErrorMsg() {
		return errorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	
}