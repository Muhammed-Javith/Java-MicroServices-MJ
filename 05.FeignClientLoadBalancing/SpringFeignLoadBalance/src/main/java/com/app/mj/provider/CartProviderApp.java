package com.app.mj.provider;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.mj.model.Cart;

@RestController
@RequestMapping("/cart")
public class CartProviderApp {
	@Value("{server.port}")
	private String port;

	@GetMapping("/info")
	public String getMsg() {
		return "CONSUMER:" + port;
	}

	@GetMapping("/data")
	public Cart getObj() {
		return new Cart(109, "ABC: " + port, 7868.98);
	}

	@GetMapping("/list")
	public List<Cart> getObjs() {
		return Arrays.asList(new Cart(101, "A :" + port, 876.98), new Cart(102, "B :" + port, 856.98),
				new Cart(103, "C :" + port, 883.98));
	}
}
