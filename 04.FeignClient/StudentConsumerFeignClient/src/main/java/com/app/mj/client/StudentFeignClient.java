package com.app.mj.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "STUDENT-PROVIDER")
public interface StudentFeignClient {
	@GetMapping("order/status")
	public String getMsg(); // Path and Return type same as Provider method
}