package com.lcwr.microservices.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/car")
public class CarController {
	
	@GetMapping("/testCar")
	public String testCar() {
		
		return "testing car service is successfull!!!";
	}

}
