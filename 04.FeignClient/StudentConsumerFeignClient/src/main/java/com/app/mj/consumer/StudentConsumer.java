package com.app.mj.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.mj.client.StudentFeignClient;

@RestController
public class StudentConsumer {
	@Autowired
	private StudentFeignClient client;

	@GetMapping("consume")
	public String showData() {
		System.out.println(client.getClass().getName());
		return "CONSUMER=>" + client.getMsg();
	}
}