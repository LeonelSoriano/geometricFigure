package com.geopago.geometric.geometricFigure.Validator;

/**
 * interface de validacion
 * @author leonelsoriano3@gmail.vom
 * 
 */
public interface IValidator {
	/**
	 * metodo de validacion
	 * @return si es null pasa la validacion
	 * 	por el contrario el String es distinto de null
	 * 	posee errores la validacion
	 * 
	 */
	String doValidator();
}