package com.example.springmultiplepropertiesdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class GreetingModel {
	
	@Value("${message.default.welcome}")
	private String welcomeMessage;
	
	@Value("${message.default.goodbye}")
	private String goodByeMessage;

	public String getWelcomeMessage() {
		return welcomeMessage;
	}

//	public void setWelcomeMessage(String welcomeMessage) {
//		this.welcomeMessage = welcomeMessage;
//	}

	public String getGoodByeMessage() {
		return goodByeMessage;
	}

//	public void setGoodByeMessage(String goodByeMessage) {
//		this.goodByeMessage = goodByeMessage;
//	}
	
	

}
