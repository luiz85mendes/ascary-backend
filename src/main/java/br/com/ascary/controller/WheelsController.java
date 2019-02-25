package br.com.ascary.controller;

import java.util.Collection;

import javax.servlet.http.HttpServletRequest;
import javax.xml.bind.JAXBException;
import javax.xml.stream.XMLStreamException;

import org.apache.coyote.Response;
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
import com.sun.xml.internal.ws.api.message.Message;
import com.sun.xml.internal.ws.client.sei.ResponseBuilder;

import br.com.ascary.model.Wheels;
import br.com.ascary.service.WheelsService;
import lombok.Data;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "/wheels", produces = MediaType.APPLICATION_JSON_VALUE ) 
public class WheelsController extends Wheels {
	
	@Autowired
	private WheelsService service;
	

	@GetMapping("/carregar")
	public ResponseEntity<Collection<Wheels>> findAllWheels(Wheels wheels) {
		Collection<Wheels> foundWheels = service.findWheels();
		return new ResponseEntity<>(foundWheels, HttpStatus.OK); 
		
	}
	
	@GetMapping("/buscar/{filtro}")
	public Collection<Wheels> findWheels(@PathVariable("filtro") String filtro) {
			Collection<Wheels> wheelsList = service.findWheelsList(filtro);		
			return wheelsList;
	}
	
	@PostMapping("/salvar")
	public Wheels save(@RequestBody Wheels wheels) {
		//Wheels save =  wheelsService.save(wheels);
		return wheels;
		
	}
	@DeleteMapping("/wheel/{id}")
	public Wheels deleteWheel(@PathVariable("id") Long id) {
		 Wheels delete = service.deleteById(id);
		return delete;
	}
	

}
