package com.app.mj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.mj.service.OrderConsumer;

@RestController
@RequestMapping("/invoice")
public class InvoiceProvider {
	@Autowired
	private OrderConsumer consumer;

	@GetMapping("/info")
	public String getOrderStatus() {
		return consumer.getStatus();
	}
}