package br.com.ascary.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ascary.model.Wheels;
import br.com.ascary.service.WheelsService;

@RestController
@RequestMapping(value = "/wheels", produces = MediaType.APPLICATION_JSON_VALUE ) 
public class WheelsController {
	
	@Autowired
	private WheelsService wheelsService;
	
	@GetMapping("/buscar")
	public ResponseEntity<Collection<Wheels>> findAllWheels(String name, String brand, Double amount) {
		Collection<Wheels> foundWheels = wheelsService.findWheels();
		return new ResponseEntity<>(foundWheels, HttpStatus.OK); 
		
	}

}
