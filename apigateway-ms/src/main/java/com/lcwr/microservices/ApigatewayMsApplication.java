package com.lcwr.microservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApigatewayMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApigatewayMsApplication.class, args);
		System.out.println("api gateway started!!!");
	}

}
