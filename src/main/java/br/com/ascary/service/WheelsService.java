package br.com.ascary.service;

import java.util.List;
import java.util.Optional;

import org.apache.catalina.connector.ResponseFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.ascary.model.Wheels;
import br.com.ascary.repository.WheelsRepository;
import br.com.ascary.repository.WheelsRepositoryCustomImpl;

@Service
public class WheelsService {
	
	
	@Autowired
	private WheelsRepository repository;

	public List<Wheels> findWheels() {
		return repository.findWheels();

	}


	public Wheels save(Wheels wheels) {
		return repository.save(wheels);
		
	}
	
	public Wheels deleteById(Long id) {
		repository.deleteById(id);
		return null;
	}
	
//	public Wheels save(Wheels wheels) {
//		if(wheels.getAmount() != null) {
//			System.out.println("Valor validado");
//		}
//		if(wheels.getAmount() == null) {
//			System.out.println("O produto não será cadastrado");
//			
//		}
//		return repository.save(wheels);
//		
//	}
	
	
}
