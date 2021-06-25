package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class SimpleController {
	
	@Value("myapp.test")
	private String stringValue;

	@RequestMapping("/current_time")
	public String currentTime() {
		return LocalDateTime.now().toString();
	}

	@RequestMapping("/")
	public String index() {
		return stringValue;
	}

}
