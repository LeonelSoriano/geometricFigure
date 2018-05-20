package com.geopago.geometric.geometricFigure.api.dto;

/**
 * parametros de salida para el diametro del get
 * @author leonelsoriano3@gmail
 *
 */
public class GeometricDiameterDto {
	
	private Double diameter;
	private String errorMsg;
	
	public GeometricDiameterDto(Double diameter, String errorMsg) {
		this.diameter = diameter;
		this.errorMsg = errorMsg;
	}
	public Double getDiameter() {
		return diameter;
	}
	public void setDiameter(Double diameter) {
		this.diameter = diameter;
	}
	public String getErrorMsg() {
		return errorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}	
}