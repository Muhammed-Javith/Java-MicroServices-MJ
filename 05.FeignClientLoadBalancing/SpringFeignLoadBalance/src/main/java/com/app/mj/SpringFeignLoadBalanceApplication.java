package com.app.mj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringFeignLoadBalanceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringFeignLoadBalanceApplication.class, args);
	}

}
