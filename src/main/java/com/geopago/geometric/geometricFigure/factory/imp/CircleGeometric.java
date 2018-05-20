package com.geopago.geometric.geometricFigure.factory.imp;

import com.geopago.geometric.geometricFigure.factory.BaseGeometric;
import com.geopago.geometric.geometricFigure.factory.IGreometric;

/**
 * Implementacion de circulo de la factoria
 * @author leonelsoriano3@gmail.com
 *
 */
public class CircleGeometric extends BaseGeometric implements IGreometric {

	@Override
	public Double getSuperface() {
		try {
			double radius = this.diameter / 2;
			return Math.PI * ( radius * radius);			
		}catch (NullPointerException e) {
			return 0.0;
		}
	}

	@Override
	public Double getBase() {
		return this.base;
	}

	@Override
	public Double getHeight() {
		return this.height;
	}

	@Override
	public Double getDiameter() {
		return this.diameter;
	}

	@Override
	public String getType() {
		return BaseGeometric.CIRCLE;
	}
}