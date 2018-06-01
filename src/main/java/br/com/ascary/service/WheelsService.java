package br.com.ascary.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ascary.model.Wheels;
import br.com.ascary.repository.WheelsRepository;

@Service
public class WheelsService {
	
	@Autowired
	private WheelsRepository repository;

	public List<Wheels> findWheels() {
		return repository.findWheels();

	}
	

}
