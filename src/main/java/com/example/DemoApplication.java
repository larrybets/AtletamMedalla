package com.example;

import com.example.service.AtletaService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
     //colocar el servivce
		AtletaService atletaService = context.getBean(AtletaService.class);
		atletaService.testAtletas();
	}
}
