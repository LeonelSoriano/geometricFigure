package com.geopago.geometric.geometricFigure.api.dto;

/**
 * parametro de salida para la altura
 * @author leonelsoriano3@gmail.com
 *
 */
public class GeometricHeightDto {

	private Double height;
	private String errorMsg;
	
	public GeometricHeightDto(Double height, String errorMsg) {
		this.height = height;
		this.errorMsg = errorMsg;
	}
	public Double getHeight() {
		return height;
	}
	public void setHeight(Double height) {
		this.height = height;
	}
	public String getErrorMsg() {
		return errorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	
}
