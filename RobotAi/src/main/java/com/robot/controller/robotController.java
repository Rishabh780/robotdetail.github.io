package com.robot.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class robotController {
	
	
	@GetMapping("/home")
	public String home() {
		return "home";
	}
	
	
	
	@GetMapping("/technology")
	public String technology() {
		
		return "technology";
	}
	
	@GetMapping("/applications")
	public String applications() {
		
	return "applications";
	}
	
	
	/*
	 * @GetMapping("/applications") public ResponseEntity<String> applications(){
	 * 
	 * //String name="hello.....";
	 * 
	 * return new ResponseEntity<String>("applications",HttpStatus.OK); }
	 */

	
	
	@GetMapping("/product")
	public String product() {
		return "product";
	}
	
	
	@GetMapping("/pricing")
	public String pricing() {
		
		return "pricing";
	}
	
	@GetMapping("/hardware")
	public String hardware() {
		return "hardware";
	}
	
	
	@GetMapping("/modelzoo")
	public String modelzoo() {
		return "modelzoo";
		
	}
	
	@GetMapping("/contact")
	public String contact() {
		return "contact";
	}
}
