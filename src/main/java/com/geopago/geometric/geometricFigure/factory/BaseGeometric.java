package com.geopago.geometric.geometricFigure.factory;

/**
 * clase base de la factori de geometrias
 * @author leonelsoriano3@gmail.com
 *
 */
public abstract class BaseGeometric {
	
	public static final String SQUARE = "ESCUARE";
	public static final String TRIANGLE = "TRIANGLE";
	public static final String CIRCLE = "CIRCLE";
	
	protected Double base;
	protected Double height;
	protected Double diameter;
	
	protected BaseGeometric changeParam(Double base, Double height, Double diameter) {
		this.base = base;
		this.height = height;
		this.diameter = diameter;
		return this;
	}
	

}