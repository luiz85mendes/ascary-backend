package br.com.ascary.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.ascary.model.Wheels;


@Repository
public interface WheelsRepositoryCustom {
	
		
		List<Wheels> findWheels();
			

}
