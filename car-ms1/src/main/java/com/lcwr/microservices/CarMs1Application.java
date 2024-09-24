package com.lcwr.microservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CarMs1Application {

	public static void main(String[] args) {
		SpringApplication.run(CarMs1Application.class, args);
		System.out.println("car service started!!!");
	}

}
