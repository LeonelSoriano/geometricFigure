package com.geopago.geometric.geometricFigure.until;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.geopago.geometric.geometricFigure.factory.BaseGeometric;
import com.geopago.geometric.geometricFigure.factory.IGreometric;
import com.geopago.geometric.geometricFigure.factory.imp.CircleGeometric;
import com.geopago.geometric.geometricFigure.factory.imp.SquareGeometric;
import com.geopago.geometric.geometricFigure.factory.imp.TriangleGeometric;

/**
 * servicio de apoyo para conseguir la geometria en memoria
 * @author leonelsoriano3@gmail.com
 *
 */
@Service
public class FindInMemoryGeometric {

	@Autowired
	SquareGeometric scuareGeometric;
	
	@Autowired
	CircleGeometric circleGeometric;
	
	@Autowired
	TriangleGeometric triangleGeometric;
	
	public IGreometric find(String type) {
		switch (type.toUpperCase()) {
		case BaseGeometric.CIRCLE:
			return this.circleGeometric;
		case BaseGeometric.SQUARE:
			return this.scuareGeometric;
		case BaseGeometric.TRIANGLE:
			return this.triangleGeometric;
		default:
			return null;		
		}
	}
}