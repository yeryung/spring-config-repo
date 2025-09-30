package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class CatalogController {
	@GetMapping("/")
	public String hello() {
		return "Hello @-@";
	}
	
	@PostMapping("/")
	public String World() {
		return "World";
	}
	
	@Value("${spring.application.name}")
	private String applicationName;
	
	@Value("${custom.name:anonymouse}")
	private String customName;
	
	@GetMapping("/whoami")
	public String profileTest() {
		return customName + "@" + applicationName;
	}
	
}
