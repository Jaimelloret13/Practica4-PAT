package com.example.demo;


import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@SpringBootApplication
@RestController //Esta anotación permite a nuestra apli proporcionar los endpoints 
public class DemoApplication {

	public static void main(String[] args) {
		//Ejecutar el programa 
		SpringApplication.run(DemoApplication.class, args);
	}


	@GetMapping //Le vamos a proporcionar a nuestra apli, este string 
	public List<String> hello()
	{
		return List.of("Hola", "caracola");
	}

}
