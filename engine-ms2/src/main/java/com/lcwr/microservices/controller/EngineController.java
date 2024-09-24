package com.lcwr.microservices.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/engine")
public class EngineController {
	
	@GetMapping("/testEngine")
	public String testEngine() {
		
		return "engine service test is successfull";
	}

}
