package com.geopago.geometric.geometricFigure.factory.imp;

import com.geopago.geometric.geometricFigure.factory.BaseGeometric;
import com.geopago.geometric.geometricFigure.factory.IGreometric;

/**
 * implemtacion de un cuadrado para la factoria
 * @author leonelsoriano3@gmail.com
 *
 */
public class SquareGeometric extends BaseGeometric implements IGreometric{

	@Override
	public Double getSuperface() {
		try {
			return this.base * this.height;
		}catch (NullPointerException e ) {
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
		return BaseGeometric.SQUARE;
	}

}
