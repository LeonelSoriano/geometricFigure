package com.geopago.geometric.geometricFigure.factory;

/**
 * interface del factory method
 * @author leonelsoriano3@gmail.com
 *
 */
public interface IGeometricFactoryMethod {
	public BaseGeometric create(String type, Double base , Double height,Double diameter);
}