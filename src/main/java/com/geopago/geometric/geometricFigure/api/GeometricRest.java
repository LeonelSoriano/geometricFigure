package com.geopago.geometric.geometricFigure.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.geopago.geometric.geometricFigure.Validator.GeometricParamValidator;
import com.geopago.geometric.geometricFigure.api.dto.GeometricBaseDto;
import com.geopago.geometric.geometricFigure.api.dto.GeometricDiameterDto;
import com.geopago.geometric.geometricFigure.api.dto.GeometricDto;
import com.geopago.geometric.geometricFigure.api.dto.GeometricHeightDto;
import com.geopago.geometric.geometricFigure.api.dto.GeometricSuperfaceDto;
import com.geopago.geometric.geometricFigure.factory.BaseGeometric;
import com.geopago.geometric.geometricFigure.factory.GeometricFactory;
import com.geopago.geometric.geometricFigure.until.FindInMemoryGeometric;

import net.bytebuddy.asm.Advice.Return;

/**
 * salida de cuarta capa o api de la aplicacion
 * @author leonelsoriano3@gmail.com
 *
 */
@RestController
public class GeometricRest {
	
	@Autowired
	GeometricFactory geometricFactory;
	
	@Autowired
	GeometricParamValidator geometricParamValidator;
	
	@Autowired
	FindInMemoryGeometric findInMemoryGeometric;
	
	@ResponseBody
	@RequestMapping(value="/geometric", method=RequestMethod.POST,
		produces = "application/json")
	public ResponseEntity<GeometricDto> register(@RequestBody GeometricDto dto) {
		
		String errorMsg = geometricParamValidator.setParam(dto.getType()).doValidator(); 
		if( errorMsg != null) {
			dto.setError(errorMsg);
			return new ResponseEntity<GeometricDto>(dto, HttpStatus.NOT_FOUND);
		}
		
		this.geometricFactory.create(dto.getType(), dto.getBase(),
				dto.getHeight(), dto.getDiameter());
		
		return new ResponseEntity<GeometricDto>(dto, HttpStatus.OK);
	}
	
	@ResponseBody
	@RequestMapping(value="/geometric/superface/{type}", method=RequestMethod.GET,
		produces = "application/json")
	public  ResponseEntity<GeometricSuperfaceDto> callSuperface
		(@PathVariable String type) {
		
		String errorMsg = geometricParamValidator.setParam(type).doValidator(); 
		if( errorMsg != null) {
			return new ResponseEntity<GeometricSuperfaceDto>(
					new GeometricSuperfaceDto(null, errorMsg), HttpStatus.NOT_FOUND);
		}
		
		Double superface = this.findInMemoryGeometric.find(type).getSuperface();
		
		return new ResponseEntity<GeometricSuperfaceDto>(
				new GeometricSuperfaceDto(superface, null), HttpStatus.OK);
	}

	@ResponseBody
	@RequestMapping(value="/geometric/base/{type}", method=RequestMethod.GET,
		produces = "application/json")
	public  ResponseEntity<GeometricBaseDto> callBase
		(@PathVariable String type) {
		
		String errorMsg = geometricParamValidator.setParam(type).doValidator(); 
		if( errorMsg != null) {
			return new ResponseEntity<GeometricBaseDto>(
					new GeometricBaseDto(null, errorMsg), HttpStatus.NOT_FOUND);
		}
		
		Double base = this.findInMemoryGeometric.find(type).getBase();
		
		return new ResponseEntity<GeometricBaseDto>(
				new GeometricBaseDto(base, null), HttpStatus.OK);
	}

	
	
	@ResponseBody
	@RequestMapping(value="/geometric/height/{type}", method=RequestMethod.GET,
		produces = "application/json")
	public  ResponseEntity<GeometricHeightDto> callHeigh
		(@PathVariable String type) {
		
		String errorMsg = geometricParamValidator.setParam(type).doValidator(); 
		if( errorMsg != null) {
			return new ResponseEntity<GeometricHeightDto>(
					new GeometricHeightDto(null, errorMsg), HttpStatus.NOT_FOUND);
		}
		
		Double height = this.findInMemoryGeometric.find(type).getHeight();
		
		return new ResponseEntity<GeometricHeightDto>(
				new GeometricHeightDto(height, null), HttpStatus.OK);
	}


	@ResponseBody
	@RequestMapping(value="/geometric/diameter/{type}", method=RequestMethod.GET,
		produces = "application/json")
	public  ResponseEntity<GeometricDiameterDto> callDiameter
		(@PathVariable String type) {
		
		String errorMsg = geometricParamValidator.setParam(type).doValidator(); 
		if( errorMsg != null) {
			return new ResponseEntity<GeometricDiameterDto>(
					new GeometricDiameterDto(null, errorMsg), HttpStatus.NOT_FOUND);
		}
		
		Double height = this.findInMemoryGeometric.find(type).getHeight();
		
		return new ResponseEntity<GeometricDiameterDto>(
				new GeometricDiameterDto(height, null), HttpStatus.OK);
	}
	
}