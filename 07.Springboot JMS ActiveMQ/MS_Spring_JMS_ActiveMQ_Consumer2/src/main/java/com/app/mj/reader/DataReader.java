package com.app.mj.reader;

import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@EnableJms // optional in case of @JmsListener
@Component
public class DataReader {
	@JmsListener(destination = "my-tpca")
	public void getMsg(String msg) {
		System.out.println("consumer#222");
		System.out.println("Message is:=>" + msg);
	}
}
