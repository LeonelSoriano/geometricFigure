package com.geopago.geometric.geometricFigure.factory.imp;

import com.geopago.geometric.geometricFigure.factory.BaseGeometric;
import com.geopago.geometric.geometricFigure.factory.IGreometric;
/**
 * implementacion de triangulo de la fatoria
 * @author leonelsoriano3@gmail.com
 *
 */
public class TriangleGeometric extends BaseGeometric implements IGreometric{


	@Override
	public Double getSuperface() {
		try {
			return (this.base * this.height) / 2;
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
		return null;
	}

	@Override
	public String getType() {
		return BaseGeometric.TRIANGLE;
	}
	
}