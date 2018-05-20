package com.geopago.geometric.geometricFigure.factory;

/**
 * interfas de funciones comunes para las creaciones concretas
 * @author leonelsoirano3@gmail.com
 *
 */
public interface IGreometric {
	Double getSuperface();
	Double getBase();
	Double getHeight();
	Double getDiameter();
	String getType();
}