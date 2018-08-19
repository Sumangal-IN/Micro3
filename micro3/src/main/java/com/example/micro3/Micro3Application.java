package com.example.micro3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Micro3Application {

	public static void main(String[] args) {
		SpringApplication.run(Micro3Application.class, args);
	}
	
	@RequestMapping(value = "/getMili", method = RequestMethod.GET)
	@ResponseBody
	public long getMili() {
		return System.currentTimeMillis();
	}
}
