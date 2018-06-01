package br.com.ascary.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.ascary.model.Wheels;
import br.com.ascary.repository.WheelsRepository;

@Service
public class WheelsService {

	private WheelsRepository repository;

	public List<Wheels> findWheels(String name, String brand, Double amount) {
		return repository.findWheels(name, brand, amount);

	}
	

}
