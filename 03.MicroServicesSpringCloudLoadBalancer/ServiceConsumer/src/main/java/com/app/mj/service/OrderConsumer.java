package com.app.mj.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OrderConsumer {
	@Autowired
	private LoadBalancerClient client;

	public String getStatus() {
		String path = "/order/status";
		// Choose Service instance based on SID
		ServiceInstance instance = client.choose("ORDER-PROVIDER");
		// Read URI from instance
		String uri = instance.getUri().toString();
		// Make http Request
		RestTemplate rt = new RestTemplate();
		ResponseEntity<String> resp = rt.getForEntity(uri + path, String.class);
		return "CONSUMER=>" + resp.getBody();
	}
}