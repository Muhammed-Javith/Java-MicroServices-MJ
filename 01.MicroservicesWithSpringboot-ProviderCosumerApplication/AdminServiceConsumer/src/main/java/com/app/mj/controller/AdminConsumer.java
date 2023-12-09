package com.app.mj.controller;

import org.springframework.boot.CommandLineRunner;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class AdminConsumer implements CommandLineRunner {
	public void run(String... args) throws Exception {
		RestTemplate rt = new RestTemplate();
		ResponseEntity<String> resp = rt.getForEntity("http://localhost:2023/provider/show", String.class);
		System.out.println(resp.getBody());
		System.exit(0);
	}
}