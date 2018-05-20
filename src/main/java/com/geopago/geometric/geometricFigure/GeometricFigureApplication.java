package com.geopago.geometric.geometricFigure;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.geopago.geometric.geometricFigure.Validator.GeometricParamValidator;
import com.geopago.geometric.geometricFigure.factory.GeometricFactory;
import com.geopago.geometric.geometricFigure.factory.imp.CircleGeometric;
import com.geopago.geometric.geometricFigure.factory.imp.SquareGeometric;
import com.geopago.geometric.geometricFigure.factory.imp.TriangleGeometric;

/**
 * boostrap de la aplicacion y configuracion del mismo
 * @author leonelsoriano3@gmail.com
 *
 */
@SpringBootApplication
@Configuration
public class GeometricFigureApplication {
	
    @Bean
    public GeometricFactory getGeometricFactory() {
        return new GeometricFactory();
    }
    
    @Bean
    @Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
    public CircleGeometric getCircleGeometric() {
    	return new CircleGeometric();
    }
    
    @Bean
    @Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
    public SquareGeometric getSqueareGeometric() {
    	return new SquareGeometric();
    }
    
    @Bean
    @Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
    public TriangleGeometric getTriangleGeometric() {
    	return new TriangleGeometric();
    }
    
    @Bean
    @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public GeometricParamValidator getGeometricParamValidator() {
    	return new GeometricParamValidator();
    }
    
	public static void main(String[] args) {
		SpringApplication.run(GeometricFigureApplication.class, args);
	}
}