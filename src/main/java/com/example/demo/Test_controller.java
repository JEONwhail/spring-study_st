package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController


public class Test_controller {
	
	@GetMapping("/hello")
	public String hello() {
		return "안녕하세요";
	}
	



}
