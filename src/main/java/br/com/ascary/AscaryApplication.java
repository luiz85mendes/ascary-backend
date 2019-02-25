package br.com.ascary;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import br.com.ascary.model.Wheels;

@SpringBootApplication
@ComponentScan
public class AscaryApplication {

	public static void main(String[] args) {
		SpringApplication.run(AscaryApplication.class, args);
		
	}
}
