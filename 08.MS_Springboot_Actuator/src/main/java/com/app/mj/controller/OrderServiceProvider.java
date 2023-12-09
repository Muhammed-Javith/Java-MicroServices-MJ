package com.app.mj.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderServiceProvider {
	@GetMapping("/show")
	public String showMsg() {
		System.out.println("From service");
		return "Hello From Provider";
	}
}