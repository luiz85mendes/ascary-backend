package br.com.ascary.repository;

import java.util.List;

import br.com.ascary.model.Wheels;

public interface WheelsRepositoryCustom {
	
		
		List<Wheels> findWheels(String name, String brand, Double amount);
			

}
