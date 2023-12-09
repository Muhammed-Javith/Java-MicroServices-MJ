package com.app.mj.controller;

import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class OrderServiceProvider {
	@GetMapping("/show")
	@HystrixCommand(fallbackMethod = "showFallBack")
//parameter must be same as fallBackMethod name
	public String showMsg() {
		System.out.println("From service");
		if (new Random().nextInt(10) <= 10) {
			throw new RuntimeException("DUMMY");
		}
		return "Hello From Provider";
	}

//fallBack method
	public String showFallBack() {
		System.out.println("From ballback");
		return "From FallBack method";
	}
}