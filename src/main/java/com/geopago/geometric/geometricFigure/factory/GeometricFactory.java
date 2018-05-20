package com.geopago.geometric.geometricFigure.factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.geopago.geometric.geometricFigure.factory.imp.CircleGeometric;
import com.geopago.geometric.geometricFigure.factory.imp.SquareGeometric;
import com.geopago.geometric.geometricFigure.factory.imp.TriangleGeometric;

/**
 * servicio que implementa el method factory
 * poseer los geometric especificos en memoria es solo
 * para cumplir el requerimiento exacto de este desarrollo
 * @author leonelsoriano3@gmail.com
 *
 */
@Service
public class GeometricFactory implements IGeometricFactoryMethod {

	@Autowired
	SquareGeometric scuareGeometric;
	
	@Autowired
	CircleGeometric circleGeometric;
	
	@Autowired
	TriangleGeometric triangleGeometric;
	
	@Override
	public BaseGeometric create(String type, Double base, Double height, Double diameter) {
		switch (type.toUpperCase()) {
		case BaseGeometric.CIRCLE:
			return this.circleGeometric.changeParam(null, null, diameter);
		case BaseGeometric.SQUARE:
			return this.scuareGeometric.changeParam(base, height, null);
		case BaseGeometric.TRIANGLE:
			return this.triangleGeometric.changeParam(base, height, null);
		default:
			return null;
		}
	}

}