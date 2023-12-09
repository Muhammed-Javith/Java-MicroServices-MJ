package com.app.mj.consumer;

import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@EnableJms // optional in case of @JmsListener
@Component
public class MessageConsumer {
	@JmsListener(destination = "my-tpca")
	public void readMessage(String msg) {
		System.out.println("from consumer");
		System.out.println("msg is:" + msg);
	}
}