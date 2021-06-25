package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;

import java.time.LocalDateTime;

@RestController
public class SimpleController {
	
	@Value("${myapp.test}")
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
