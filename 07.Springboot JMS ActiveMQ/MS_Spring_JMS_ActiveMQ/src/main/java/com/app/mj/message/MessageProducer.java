package com.app.mj.message;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class MessageProducer implements CommandLineRunner {

	@Autowired
	private JmsTemplate template;

	@Override
	public void run(String... args) throws Exception {
		template.send("my-tpca", (ses) -> ses.createTextMessage("AAAAAAAAA"));
		System.out.println("sent from Producer");
	}
}
