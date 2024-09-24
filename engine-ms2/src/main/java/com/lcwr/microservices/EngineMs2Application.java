package com.lcwr.microservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EngineMs2Application {

	public static void main(String[] args) {
		SpringApplication.run(EngineMs2Application.class, args);
		
		System.out.println("enginer service started!!!");
	}

}
