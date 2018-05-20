package com.geopago.geometric.geometricFigure.api.dto;

/**
 * parametro para el rest de creacion post
 * @author leonelsoriano3@gmail.com
 *
 */
public class GeometricDto {
	
	private String type;
	private Double base;
	private Double height;
	private Double diameter;
	private String error;
	
	public Double getBase() {
		return base;
	}
	public void setBase(Double base) {
		this.base = base;
	}
	public Double getHeight() {
		return height;
	}
	public void setHeight(Double height) {
		this.height = height;
	}
	public Double getDiameter() {
		return diameter;
	}
	public void setDiameter(Double diameter) {
		this.diameter = diameter;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}

}