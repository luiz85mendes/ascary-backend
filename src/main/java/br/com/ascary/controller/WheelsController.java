package br.com.ascary.controller;

import java.util.Collection;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sun.prism.impl.BaseResourcePool;

import br.com.ascary.model.Wheels;
import br.com.ascary.service.WheelsService;


@CrossOrigin(origins = "*")
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
	
	@PostMapping("/salvar")
	public Wheels save(@RequestBody Wheels wheels) {
		Wheels save =  wheelsService.save(wheels);
		return wheels;
		
	}
	@DeleteMapping("/wheel/{id}")
	public Wheels deleteWheel(@PathVariable("id") Long id) {
		 Wheels delete = wheelsService.deleteById(id);
		return delete;
	}
}
