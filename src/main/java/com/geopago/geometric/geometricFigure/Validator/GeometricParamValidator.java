package com.geopago.geometric.geometricFigure.Validator;

import com.geopago.geometric.geometricFigure.factory.BaseGeometric;

/**
 * implementacion del validador de parametros
 * @author leonelsorino3@gmail.com
 *
 */
public class GeometricParamValidator implements IValidator {

	private String param;
	
	private final String  paramError = "Tipo de grafico no existe";
	
	public GeometricParamValidator setParam(String param) {
		this.param = param.toUpperCase();
		return this;
	}
	
	@Override
	public String doValidator() {

		if( this.param.equals(BaseGeometric.CIRCLE) ||
				this.param.equals(BaseGeometric.SQUARE) ||
				this.param.equals(BaseGeometric.TRIANGLE)
				) {
			return null;
		} else {
			return this.paramError;
		}
	}

}